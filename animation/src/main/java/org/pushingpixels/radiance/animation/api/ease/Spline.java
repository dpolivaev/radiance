/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.radiance.animation.api.ease;

import java.util.ArrayList;

/**
 * Spline easer. Is based on the code from
 * <a href="https://timingframework.dev.java.net">TimingFramework</a> by Chet
 * Haase and Romain Guy.
 *
 * @author Kirill Grouchnikov
 */
public class Spline implements TimelineEase {
    public Spline(float easeAmount) {
        this(easeAmount, 0, 1 - easeAmount, 1);
    }

    private static class FloatPoint {
        public float x;
        public float y;

        public FloatPoint(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }

    // Note: (x0,y0) and (x1,y1) are implicitly (0, 0) and (1,1) respectively
    private float x1, y1, x2, y2;
    private ArrayList<LengthItem> lengths = new ArrayList<>();

    /**
     * Creates a new instance of SplineInterpolator with the control points
     * defined by (x1, y1) and (x2, y2). The anchor points are implicitly
     * defined as (0, 0) and (1, 1).
     *
     * @param x1 X coordinate of the first control point
     * @param y1 Y coordinate of the first control point
     * @param x2 X coordinate of the second control point
     * @param y2 Y coordinate of the second control point
     * @throws IllegalArgumentException This exception is thrown when values beyond the allowed [0,1]
     *                                  range are passed in
     */
    public Spline(float x1, float y1, float x2, float y2) {
        if (x1 < 0 || x1 > 1.0f || y1 < 0 || y1 > 1.0f || x2 < 0 || x2 > 1.0f || y2 < 0
                || y2 > 1.0f) {
            throw new IllegalArgumentException("Control points must be in " + "the range [0, 1]:");
        }

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        // Now contruct the array of all lengths to t in [0, 1.0]
        float prevX = 0.0f;
        float prevY = 0.0f;
        float prevLength = 0.0f; // cumulative length
        for (float t = 0.01f; t <= 1.0f; t += .01f) {
            FloatPoint xy = getXY(t);
            float length = prevLength + (float) Math
                    .sqrt((xy.x - prevX) * (xy.x - prevX) + (xy.y - prevY) * (xy.y - prevY));
            LengthItem lengthItem = new LengthItem(length, t);
            lengths.add(lengthItem);
            prevLength = length;
            prevX = xy.x;
            prevY = xy.y;
        }
        // Now calculate the fractions so that we can access the lengths
        // array with values in [0,1]. prevLength now holds the total
        // length of the spline.
        for (LengthItem lengthItem : lengths) {
            lengthItem.setFraction(prevLength);
        }
    }

    /**
     * Calculates the XY point for a given t value.
     * <p>
     * The general spline equation is: x = b0*x0 + b1*x1 + b2*x2 + b3*x3 y =
     * b0*y0 + b1*y1 + b2*y2 + b3*y3 where: b0 = (1-t)^3 b1 = 3 * t * (1-t)^2 b2
     * = 3 * t^2 * (1-t) b3 = t^3 We know that (x0,y0) == (0,0) and (x1,y1) ==
     * (1,1) for our splines, so this simplifies to: x = b1*x1 + b2*x2 + b3 y =
     * b1*x1 + b2*x2 + b3
     *
     * @param t parametric value for spline calculation
     */
    private FloatPoint getXY(float t) {
        FloatPoint xy;
        float invT = (1 - t);
        float b1 = 3 * t * (invT * invT);
        float b2 = 3 * (t * t) * invT;
        float b3 = t * t * t;
        xy = new FloatPoint((b1 * x1) + (b2 * x2) + b3, (b1 * y1) + (b2 * y2) + b3);
        return xy;
    }

    /**
     * Utility function: When we are evaluating the spline, we only care about
     * the Y values. See {@link #getXY(float)} for the details.
     */
    private float getY(float t) {
        float invT = (1 - t);
        float b1 = 3 * t * (invT * invT);
        float b2 = 3 * (t * t) * invT;
        float b3 = t * t * t;
        return (b1 * y1) + (b2 * y2) + b3;
    }

    /**
     * Given a fraction of time along the spline (which we can interpret as the
     * length along a spline), return the interpolated value of the spline. We
     * first calculate the t value for the length (by doing a lookup in our
     * array of previousloy calculated values and then linearly interpolating
     * between the nearest values) and then calculate the Y value for this t.
     *
     * @param lengthFraction Fraction of time in a given time interval.
     * @return interpolated fraction between 0 and 1
     */
    public float map(float lengthFraction) {
        // REMIND: speed this up with binary search
        float interpolatedT = 1.0f;
        float prevT = 0.0f;
        float prevLength = 0.0f;
        for (int i = 0; i < lengths.size(); ++i) {
            LengthItem lengthItem = lengths.get(i);
            float fraction = lengthItem.getFraction();
            float t = lengthItem.getT();
            if (lengthFraction <= fraction) {
                // answer lies between last item and this one
                float proportion = (lengthFraction - prevLength) / (fraction - prevLength);
                interpolatedT = prevT + proportion * (t - prevT);
                return getY(interpolatedT);
            }
            prevLength = fraction;
            prevT = t;
        }
        return getY(interpolatedT);
    }
}

/**
 * Struct used to store information about length values. Specifically, each item
 * stores the "length" (which can be thought of as the time elapsed along the
 * spline path), the "t" value at this length (used to calculate the (x,y) point
 * along the spline), and the "fraction" which is equal to the length divided by
 * the total absolute length of the spline. After we calculate all LengthItems
 * for a give spline, we have a list of entries which can return the t values
 * for fractional lengths from 0 to 1.
 */
class LengthItem {
    float length;
    float t;
    float fraction;

    LengthItem(float length, float t, float fraction) {
        this.length = length;
        this.t = t;
        this.fraction = fraction;
    }

    LengthItem(float length, float t) {
        this.length = length;
        this.t = t;
    }

    public float getLength() {
        return length;
    }

    public float getT() {
        return t;
    }

    public float getFraction() {
        return fraction;
    }

    void setFraction(float totalLength) {
        fraction = length / totalLength;
    }
}

package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_aspx implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.9f, 89.8f);
generalPath.lineTo(18.4f, 89.8f);
generalPath.lineTo(17.0f, 86.2f);
generalPath.lineTo(10.6f, 86.2f);
generalPath.lineTo(9.3f, 89.799995f);
generalPath.lineTo(5.9f, 89.799995f);
generalPath.lineTo(12.1f, 74.1f);
generalPath.lineTo(15.5f, 74.1f);
generalPath.lineTo(21.9f, 89.799995f);
generalPath.closePath();
generalPath.moveTo(16.0f, 83.6f);
generalPath.lineTo(13.8f, 77.799995f);
generalPath.lineTo(11.700001f, 83.6f);
generalPath.lineTo(16.0f, 83.6f);
generalPath.closePath();
generalPath.moveTo(22.8f, 84.7f);
generalPath.lineTo(25.9f, 84.399994f);
generalPath.curveTo(26.1f, 85.399994f, 26.5f, 86.2f, 27.0f, 86.7f);
generalPath.curveTo(27.6f, 87.2f, 28.4f, 87.399994f, 29.3f, 87.399994f);
generalPath.curveTo(30.3f, 87.399994f, 31.099998f, 87.2f, 31.599998f, 86.7f);
generalPath.curveTo(32.1f, 86.299995f, 32.399998f, 85.799995f, 32.399998f, 85.2f);
generalPath.curveTo(32.399998f, 84.799995f, 32.3f, 84.5f, 32.1f, 84.2f);
generalPath.curveTo(31.999998f, 84.0f, 31.599998f, 83.799995f, 30.999998f, 83.6f);
generalPath.curveTo(30.599998f, 83.5f, 29.799997f, 83.2f, 28.399998f, 82.9f);
generalPath.curveTo(26.699997f, 82.5f, 25.499998f, 82.0f, 24.799997f, 81.3f);
generalPath.curveTo(23.799997f, 80.4f, 23.299997f, 79.4f, 23.299997f, 78.100006f);
generalPath.curveTo(23.299997f, 77.3f, 23.499998f, 76.50001f, 23.999998f, 75.90001f);
generalPath.curveTo(24.499998f, 75.20001f, 25.099998f, 74.70001f, 25.999998f, 74.30001f);
generalPath.curveTo(26.899998f, 73.90001f, 27.899998f, 73.80001f, 29.099998f, 73.80001f);
generalPath.curveTo(31.099998f, 73.80001f, 32.6f, 74.20001f, 33.6f, 75.10001f);
generalPath.curveTo(34.6f, 76.000015f, 35.1f, 77.10001f, 35.199997f, 78.60001f);
generalPath.lineTo(31.999996f, 78.70001f);
generalPath.curveTo(31.899996f, 77.90001f, 31.599997f, 77.30001f, 31.099997f, 77.000015f);
generalPath.curveTo(30.599997f, 76.60001f, 29.999996f, 76.500015f, 29.099997f, 76.500015f);
generalPath.curveTo(28.199997f, 76.500015f, 27.399996f, 76.70001f, 26.899996f, 77.10001f);
generalPath.curveTo(26.599997f, 77.30001f, 26.399996f, 77.70001f, 26.399996f, 78.10001f);
generalPath.curveTo(26.399996f, 78.500015f, 26.599997f, 78.80001f, 26.899996f, 79.10001f);
generalPath.curveTo(27.299995f, 79.40002f, 28.299995f, 79.80001f, 29.899996f, 80.20001f);
generalPath.curveTo(31.499996f, 80.60001f, 32.599995f, 80.90001f, 33.399994f, 81.30001f);
generalPath.curveTo(34.099995f, 81.70001f, 34.699993f, 82.20001f, 35.199993f, 82.90001f);
generalPath.curveTo(35.599995f, 83.600006f, 35.79999f, 84.40001f, 35.79999f, 85.40001f);
generalPath.curveTo(35.79999f, 86.30001f, 35.499992f, 87.100006f, 34.999992f, 87.90001f);
generalPath.curveTo(34.499992f, 88.70001f, 33.79999f, 89.30001f, 32.899994f, 89.70001f);
generalPath.curveTo(31.999994f, 90.10001f, 30.799994f, 90.30001f, 29.399994f, 90.30001f);
generalPath.curveTo(27.399994f, 90.30001f, 25.799994f, 89.80001f, 24.799994f, 88.90001f);
generalPath.curveTo(23.599993f, 87.80001f, 22.999994f, 86.50001f, 22.799994f, 84.70001f);
generalPath.closePath();
generalPath.moveTo(38.4f, 89.799995f);
generalPath.lineTo(38.4f, 74.1f);
generalPath.lineTo(43.600002f, 74.1f);
generalPath.curveTo(45.600002f, 74.1f, 46.800003f, 74.2f, 47.4f, 74.299995f);
generalPath.curveTo(48.300003f, 74.49999f, 49.100002f, 75.1f, 49.7f, 75.799995f);
generalPath.curveTo(50.3f, 76.6f, 50.600002f, 77.6f, 50.600002f, 78.899994f);
generalPath.curveTo(50.600002f, 79.899994f, 50.4f, 80.7f, 50.100002f, 81.299995f);
generalPath.curveTo(49.800003f, 81.899994f, 49.300003f, 82.49999f, 48.7f, 82.899994f);
generalPath.curveTo(48.2f, 83.299995f, 47.600002f, 83.49999f, 47.0f, 83.59999f);
generalPath.curveTo(46.2f, 83.79999f, 45.1f, 83.79999f, 43.7f, 83.79999f);
generalPath.lineTo(41.600002f, 83.79999f);
generalPath.lineTo(41.600002f, 89.69999f);
generalPath.lineTo(38.4f, 89.69999f);
generalPath.closePath();
generalPath.moveTo(41.600002f, 76.7f);
generalPath.lineTo(41.600002f, 81.2f);
generalPath.lineTo(43.4f, 81.2f);
generalPath.curveTo(44.7f, 81.2f, 45.5f, 81.1f, 45.9f, 81.0f);
generalPath.curveTo(46.300003f, 80.9f, 46.7f, 80.6f, 46.9f, 80.2f);
generalPath.curveTo(47.100002f, 79.799995f, 47.300003f, 79.399994f, 47.300003f, 79.0f);
generalPath.curveTo(47.300003f, 78.4f, 47.100002f, 78.0f, 46.800003f, 77.6f);
generalPath.curveTo(46.500004f, 77.2f, 46.000004f, 77.0f, 45.500004f, 76.9f);
generalPath.curveTo(45.100002f, 76.8f, 44.300003f, 76.8f, 43.200005f, 76.8f);
generalPath.lineTo(41.600006f, 76.8f);
generalPath.closePath();
generalPath.moveTo(51.600002f, 89.799995f);
generalPath.lineTo(57.000004f, 81.6f);
generalPath.lineTo(52.100002f, 74.1f);
generalPath.lineTo(55.9f, 74.1f);
generalPath.lineTo(59.100002f, 79.2f);
generalPath.lineTo(62.2f, 74.1f);
generalPath.lineTo(65.9f, 74.1f);
generalPath.lineTo(61.0f, 81.7f);
generalPath.lineTo(66.4f, 89.799995f);
generalPath.lineTo(62.5f, 89.799995f);
generalPath.lineTo(59.0f, 84.4f);
generalPath.lineTo(55.5f, 89.8f);
generalPath.lineTo(51.6f, 89.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.2f, 44.6f);
generalPath.curveTo(26.800001f, 45.6f, 25.5f, 46.699997f, 24.2f, 47.699997f);
generalPath.curveTo(21.5f, 49.699997f, 18.900002f, 51.799995f, 16.2f, 53.799995f);
generalPath.curveTo(15.800001f, 54.099995f, 15.6f, 54.099995f, 15.200001f, 53.899994f);
generalPath.curveTo(14.700001f, 53.599995f, 14.1f, 53.299995f, 13.500001f, 52.999992f);
generalPath.curveTo(13.200001f, 52.79999f, 13.100001f, 52.59999f, 13.100001f, 52.29999f);
generalPath.lineTo(13.100001f, 31.1f);
generalPath.curveTo(13.100001f, 30.9f, 13.300001f, 30.5f, 13.500001f, 30.4f);
generalPath.curveTo(14.100001f, 30.0f, 14.800001f, 29.699999f, 15.400001f, 29.4f);
generalPath.curveTo(15.700001f, 29.199999f, 16.0f, 29.4f, 16.300001f, 29.6f);
generalPath.curveTo(18.500002f, 31.300001f, 20.7f, 33.0f, 22.900002f, 34.6f);
generalPath.curveTo(24.7f, 36.0f, 26.500002f, 37.399998f, 28.300001f, 38.699997f);
generalPath.curveTo(28.400002f, 38.6f, 28.6f, 38.499996f, 28.7f, 38.399998f);
generalPath.curveTo(35.3f, 31.999998f, 41.9f, 25.599998f, 48.4f, 19.199997f);
generalPath.curveTo(48.7f, 18.899998f, 49.0f, 18.799997f, 49.4f, 18.999996f);
generalPath.curveTo(52.2f, 20.099997f, 55.0f, 21.199997f, 57.800003f, 22.399996f);
generalPath.curveTo(58.000004f, 22.499996f, 58.200005f, 22.799995f, 58.300003f, 22.999996f);
generalPath.curveTo(58.4f, 23.099997f, 58.300003f, 23.299995f, 58.300003f, 23.499996f);
generalPath.lineTo(58.300003f, 60.0f);
generalPath.curveTo(58.300003f, 60.9f, 58.300003f, 60.9f, 57.4f, 61.2f);
generalPath.curveTo(54.7f, 62.3f, 52.100002f, 63.3f, 49.5f, 64.4f);
generalPath.curveTo(49.0f, 64.6f, 48.7f, 64.5f, 48.4f, 64.200005f);
generalPath.curveTo(41.9f, 57.800003f, 35.4f, 51.500004f, 28.800001f, 45.200005f);
generalPath.lineTo(28.2f, 44.600006f);
generalPath.closePath();
generalPath.moveTo(47.2f, 50.399998f);
generalPath.lineTo(47.2f, 33.0f);
generalPath.curveTo(43.3f, 35.9f, 39.5f, 38.8f, 35.6f, 41.7f);
generalPath.curveTo(39.5f, 44.600002f, 43.3f, 47.5f, 47.199997f, 50.4f);
generalPath.closePath();
generalPath.moveTo(22.900002f, 41.699997f);
generalPath.curveTo(21.000002f, 39.999996f, 19.100002f, 38.299995f, 17.100002f, 36.499996f);
generalPath.lineTo(17.100002f, 46.899994f);
generalPath.curveTo(19.000002f, 45.199993f, 20.900002f, 43.399994f, 22.900002f, 41.699993f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.61899948120117, 64.5), new Point2D.Double(35.61899948120117, 18.9060001373291), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9980000257492065;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_aspx() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static RadianceIcon of(int width, int height) {
       ext_aspx base = new ext_aspx();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_aspx base = new ext_aspx();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_aspx::new;
    }
}


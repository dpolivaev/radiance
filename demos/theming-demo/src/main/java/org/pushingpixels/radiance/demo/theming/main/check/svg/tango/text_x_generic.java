package org.pushingpixels.radiance.demo.theming.main.check.svg.tango;

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
public class text_x_generic implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.02105461061000824f, 0.0f, 0.0f, 0.02086758054792881f, 42.85171890258789f, 41.15359878540039f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-219.61876f, -150.68037f);
generalPath.curveTo(-219.61876f, -150.68037f, -219.61876f, 327.65042f, -219.61876f, 327.65042f);
generalPath.curveTo(-76.74459f, 328.55087f, 125.78146f, 220.48074f, 125.78138f, 88.45424f);
generalPath.curveTo(125.78138f, -43.572304f, -33.655437f, -150.68036f, -219.61876f, -150.68037f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-1559.2523f, -150.68037f);
generalPath.curveTo(-1559.2523f, -150.68037f, -1559.2523f, 327.65042f, -1559.2523f, 327.65042f);
generalPath.curveTo(-1702.1265f, 328.55087f, -1904.6525f, 220.48074f, -1904.6525f, 88.45424f);
generalPath.curveTo(-1904.6525f, -43.572304f, -1745.2157f, -150.68036f, -1559.2523f, -150.68037f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
paint = new RadialGradientPaint(new Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, new Point2D.Double(33.966678619384766, 35.736915588378906), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(250, 250, 250, 255)) : new Color(250, 250, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 187, 187, 255)) : new Color(187, 187, 187, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, new Point2D.Double(8.824419021606445, 3.7561285495758057), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(163, 163, 163, 255)) : new Color(163, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 76, 76, 255)) : new Color(76, 76, 76, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
paint = new RadialGradientPaint(new Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, new Point2D.Double(8.143556594848633, 7.26789665222168), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 248, 248, 255)) : new Color(248, 248, 248, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f));
// _0_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f));
// _0_1_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.428f, 113.07f);
generalPath.curveTo(23.428f, 115.043f, 21.828f, 116.642f, 19.855f, 116.642f);
generalPath.curveTo(17.881f, 116.642f, 16.282f, 115.042f, 16.282f, 113.07f);
generalPath.curveTo(16.282f, 111.096f, 17.882f, 109.497f, 19.855f, 109.497f);
generalPath.curveTo(21.828f, 109.497f, 23.428f, 111.097f, 23.428f, 113.07f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.428f, 63.07f);
generalPath.curveTo(23.428f, 65.043f, 21.828f, 66.643f, 19.855f, 66.643f);
generalPath.curveTo(17.881f, 66.643f, 16.282f, 65.043f, 16.282f, 63.07f);
generalPath.curveTo(16.282f, 61.096f, 17.882f, 59.497f, 19.855f, 59.497f);
generalPath.curveTo(21.828f, 59.497f, 23.428f, 61.097f, 23.428f, 63.07f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.995011f, 29.952326f);
generalPath.curveTo(9.995011f, 30.40553f, 9.627486f, 30.772825f, 9.174282f, 30.772825f);
generalPath.curveTo(8.720848f, 30.772825f, 8.353554f, 30.4053f, 8.353554f, 29.952326f);
generalPath.curveTo(8.353554f, 29.498892f, 8.721078f, 29.131598f, 9.174282f, 29.131598f);
generalPath.curveTo(9.627486f, 29.131598f, 9.995011f, 29.499123f, 9.995011f, 29.952326f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, new Point2D.Double(20.892099380493164, 114.56839752197266), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 154, 154, 255)) : new Color(154, 154, 154, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.995011f, 18.467176f);
generalPath.curveTo(9.995011f, 18.92038f, 9.627486f, 19.287905f, 9.174282f, 19.287905f);
generalPath.curveTo(8.720848f, 19.287905f, 8.353554f, 18.92038f, 8.353554f, 18.467176f);
generalPath.curveTo(8.353554f, 18.013742f, 8.721078f, 17.646446f, 9.174282f, 17.646446f);
generalPath.curveTo(9.627486f, 17.646446f, 9.995011f, 18.013971f, 9.995011f, 18.467176f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, new Point2D.Double(20.892099380493164, 64.56790161132812), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(240, 240, 240, 255)) : new Color(240, 240, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 154, 154, 255)) : new Color(154, 154, 154, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 4)) : new Color(0, 0, 0, 4);
stroke = new BasicStroke(0.9885531f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.505723f, 5.4942765f);
generalPath.lineTo(11.505723f, 43.400867f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 52)) : new Color(255, 255, 255, 52);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.5f, 5.0205154f);
generalPath.lineTo(12.5f, 43.038227f);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9090909957885742f, 0.0f, 0.0f, 1.0f, 2.3636279106140137f, 0.0f));
// _0_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_0
shape = new RoundRectangle2D.Double(15.000001907348633, 9.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_1
shape = new RoundRectangle2D.Double(15.000001907348633, 11.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_2
shape = new RoundRectangle2D.Double(15.000001907348633, 13.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_3
shape = new RoundRectangle2D.Double(15.000001907348633, 15.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_4
shape = new RoundRectangle2D.Double(15.000001907348633, 17.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_5
shape = new RoundRectangle2D.Double(15.000001907348633, 19.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_6
shape = new RoundRectangle2D.Double(15.000001907348633, 21.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_7
shape = new RoundRectangle2D.Double(15.000001907348633, 23.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_8
shape = new RoundRectangle2D.Double(14.999992370605469, 25.0, 9.900005340576172, 1.0, 0.1364084780216217, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_9
shape = new RoundRectangle2D.Double(14.999992370605469, 29.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_10
shape = new RoundRectangle2D.Double(14.999992370605469, 31.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_11
shape = new RoundRectangle2D.Double(14.999992370605469, 33.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_12
shape = new RoundRectangle2D.Double(14.999992370605469, 35.0, 22.000003814697266, 1.0, 0.3031298518180847, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0_13
shape = new RoundRectangle2D.Double(14.999992370605469, 37.0, 15.40001392364502, 1.0, 0.21219104528427124, 0.13078175485134125);
paint = (colorFilter != null) ? colorFilter.filter(new Color(155, 155, 155, 140)) : new Color(155, 155, 155, 140);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
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
        return 2.750002861022949;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.1464462280273438;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 42.749996185302734;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 44.853553771972656;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private text_x_generic() {
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
       text_x_generic base = new text_x_generic();
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
       text_x_generic base = new text_x_generic();
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
        return text_x_generic::new;
    }
}


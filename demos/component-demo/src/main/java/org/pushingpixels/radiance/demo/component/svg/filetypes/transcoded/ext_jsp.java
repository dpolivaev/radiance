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
public class ext_jsp implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.1f);
generalPath.lineTo(72.0f, 27.800001f);
generalPath.lineTo(72.0f, 98.9f);
generalPath.lineTo(0.0f, 98.9f);
generalPath.lineTo(0.0f, 1.1f);
generalPath.lineTo(45.0f, 1.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.125), new Point2D.Double(36.0, 100.875), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.1f);
generalPath.lineTo(72.0f, 27.800001f);
generalPath.lineTo(72.0f, 98.9f);
generalPath.lineTo(0.0f, 98.9f);
generalPath.lineTo(0.0f, 1.1f);
generalPath.lineTo(45.0f, 1.1f);
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
generalPath.moveTo(45.0f, 1.1f);
generalPath.lineTo(72.0f, 27.800001f);
generalPath.lineTo(72.0f, 98.9f);
generalPath.lineTo(0.0f, 98.9f);
generalPath.lineTo(0.0f, 1.1f);
generalPath.lineTo(45.0f, 1.1f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.3f, 23.7f);
generalPath.curveTo(34.0f, 25.300001f, 31.3f, 27.2f, 29.9f, 30.300001f);
generalPath.curveTo(27.4f, 35.600002f, 34.9f, 41.5f, 35.2f, 41.7f);
generalPath.curveTo(35.3f, 41.8f, 35.4f, 41.8f, 35.5f, 41.8f);
generalPath.curveTo(35.6f, 41.8f, 35.7f, 41.8f, 35.8f, 41.7f);
generalPath.curveTo(35.899998f, 41.600002f, 36.0f, 41.4f, 35.899998f, 41.2f);
generalPath.curveTo(35.899998f, 41.100002f, 33.199997f, 35.9f, 33.3f, 32.2f);
generalPath.curveTo(33.3f, 30.900002f, 35.2f, 29.400002f, 37.1f, 27.900002f);
generalPath.curveTo(38.899998f, 26.500002f, 40.899998f, 24.800001f, 42.0f, 22.900002f);
generalPath.curveTo(44.6f, 18.7f, 41.7f, 14.600001f, 41.7f, 14.600001f);
generalPath.curveTo(41.600002f, 14.400002f, 41.4f, 14.400002f, 41.2f, 14.500001f);
generalPath.curveTo(41.0f, 14.6f, 40.9f, 14.800001f, 41.0f, 15.000001f);
generalPath.curveTo(41.0f, 15.000001f, 41.6f, 17.7f, 40.0f, 20.5f);
generalPath.curveTo(39.3f, 21.5f, 37.9f, 22.5f, 36.3f, 23.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(29.386999130249023, 28.042999267578125), new Point2D.Double(43.01900100708008, 28.042999267578125), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.0f, 25.5f);
generalPath.curveTo(46.2f, 25.4f, 46.2f, 25.2f, 46.1f, 25.0f);
generalPath.curveTo(45.999996f, 24.8f, 45.8f, 24.7f, 45.6f, 24.8f);
generalPath.curveTo(45.199997f, 25.0f, 35.899998f, 28.5f, 35.899998f, 32.8f);
generalPath.curveTo(35.899998f, 35.8f, 37.199997f, 37.399998f, 38.1f, 38.5f);
generalPath.curveTo(38.5f, 39.0f, 38.8f, 39.3f, 38.899998f, 39.7f);
generalPath.curveTo(39.199997f, 40.7f, 38.499996f, 42.4f, 38.199997f, 43.0f);
generalPath.curveTo(38.1f, 43.2f, 38.199997f, 43.4f, 38.299995f, 43.5f);
generalPath.curveTo(38.399994f, 43.6f, 38.499996f, 43.6f, 38.599995f, 43.6f);
generalPath.curveTo(38.699993f, 43.6f, 38.799995f, 43.6f, 38.799995f, 43.5f);
generalPath.curveTo(38.999996f, 43.4f, 42.699997f, 40.7f, 41.999996f, 37.6f);
generalPath.curveTo(41.799995f, 36.399998f, 41.199997f, 35.5f, 40.599995f, 34.699997f);
generalPath.curveTo(39.799995f, 33.499996f, 39.199993f, 32.6f, 40.099995f, 30.999996f);
generalPath.curveTo(41.299995f, 29.099997f, 45.999996f, 25.499996f, 45.999996f, 25.499996f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.979000091552734, 34.17599868774414), new Point2D.Double(46.207000732421875, 34.17599868774414), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.9f, 43.6f);
generalPath.curveTo(21.699999f, 44.1f, 21.8f, 44.5f, 22.1f, 45.0f);
generalPath.curveTo(23.1f, 46.4f, 26.7f, 47.2f, 32.1f, 47.2f);
generalPath.lineTo(34.399998f, 47.2f);
generalPath.curveTo(43.1f, 46.9f, 46.399998f, 44.2f, 46.5f, 44.100002f);
generalPath.curveTo(46.6f, 44.000004f, 46.7f, 43.800003f, 46.6f, 43.600002f);
generalPath.curveTo(46.499996f, 43.4f, 46.3f, 43.300003f, 46.1f, 43.4f);
generalPath.curveTo(43.0f, 44.2f, 37.3f, 44.5f, 33.3f, 44.5f);
generalPath.curveTo(28.8f, 44.5f, 26.599998f, 44.2f, 26.0f, 43.9f);
generalPath.curveTo(26.3f, 43.5f, 28.0f, 42.800003f, 30.2f, 42.4f);
generalPath.curveTo(30.400002f, 42.4f, 30.6f, 42.2f, 30.5f, 42.0f);
generalPath.curveTo(30.5f, 41.8f, 30.3f, 41.6f, 30.1f, 41.6f);
generalPath.curveTo(29.0f, 41.5f, 22.6f, 41.6f, 21.900002f, 43.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.820999145507812, 44.35100173950195), new Point2D.Double(46.71500015258789, 44.35100173950195), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.1f, 40.8f);
generalPath.curveTo(49.3f, 40.8f, 47.6f, 41.7f, 47.5f, 41.7f);
generalPath.curveTo(47.3f, 41.8f, 47.2f, 42.0f, 47.3f, 42.2f);
generalPath.curveTo(47.3f, 42.4f, 47.5f, 42.5f, 47.7f, 42.5f);
generalPath.curveTo(47.7f, 42.5f, 51.5f, 42.5f, 51.9f, 44.7f);
generalPath.curveTo(52.2f, 46.600002f, 48.300003f, 49.600002f, 46.800003f, 50.600002f);
generalPath.curveTo(46.600002f, 50.7f, 46.600002f, 50.9f, 46.600002f, 51.100002f);
generalPath.curveTo(46.7f, 51.300003f, 46.800003f, 51.4f, 47.000004f, 51.4f);
generalPath.lineTo(47.100002f, 51.4f);
generalPath.curveTo(47.500004f, 51.300003f, 56.0f, 49.4f, 55.100002f, 44.5f);
generalPath.curveTo(54.500004f, 41.5f, 52.600002f, 40.8f, 51.100002f, 40.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(46.60599899291992, 46.14899826049805), new Point2D.Double(55.1510009765625, 46.14899826049805), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 50.1f);
generalPath.curveTo(45.3f, 49.899998f, 45.3f, 49.8f, 45.1f, 49.699997f);
generalPath.lineTo(43.1f, 48.299995f);
generalPath.curveTo(43.0f, 48.199997f, 42.899998f, 48.199997f, 42.8f, 48.199997f);
generalPath.curveTo(42.8f, 48.199997f, 40.6f, 48.799995f, 37.5f, 49.1f);
generalPath.curveTo(36.3f, 49.199997f, 34.9f, 49.3f, 33.5f, 49.3f);
generalPath.curveTo(30.4f, 49.3f, 28.4f, 48.899998f, 28.1f, 48.7f);
generalPath.lineTo(28.1f, 48.600002f);
generalPath.curveTo(28.2f, 48.500004f, 28.4f, 48.300003f, 28.6f, 48.2f);
generalPath.curveTo(28.800001f, 48.100002f, 28.9f, 47.9f, 28.9f, 47.7f);
generalPath.curveTo(28.8f, 47.5f, 28.6f, 47.4f, 28.4f, 47.4f);
generalPath.curveTo(26.4f, 47.9f, 25.3f, 48.600002f, 25.4f, 49.5f);
generalPath.curveTo(25.5f, 51.0f, 29.1f, 51.8f, 32.1f, 52.0f);
generalPath.lineTo(33.5f, 52.0f);
generalPath.curveTo(38.5f, 52.0f, 45.0f, 50.4f, 45.0f, 50.4f);
generalPath.curveTo(45.1f, 50.4f, 45.2f, 50.2f, 45.3f, 50.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.340999603271484, 49.67499923706055), new Point2D.Double(45.284000396728516, 49.67499923706055), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.9f, 53.4f);
generalPath.curveTo(30.1f, 53.300003f, 30.1f, 53.100002f, 30.1f, 52.9f);
generalPath.curveTo(30.0f, 52.7f, 29.9f, 52.600002f, 29.7f, 52.600002f);
generalPath.curveTo(29.400002f, 52.600002f, 27.0f, 52.7f, 26.800001f, 54.300003f);
generalPath.curveTo(26.7f, 54.800003f, 26.900002f, 55.200005f, 27.2f, 55.500004f);
generalPath.curveTo(28.1f, 56.500004f, 30.400002f, 57.100002f, 34.3f, 57.400005f);
generalPath.lineTo(35.7f, 57.400005f);
generalPath.curveTo(40.7f, 57.400005f, 44.1f, 55.800007f, 44.2f, 55.800007f);
generalPath.curveTo(44.3f, 55.70001f, 44.4f, 55.600006f, 44.4f, 55.400005f);
generalPath.curveTo(44.4f, 55.200005f, 44.300003f, 55.100006f, 44.2f, 55.000004f);
generalPath.lineTo(41.600002f, 53.400005f);
generalPath.curveTo(41.500004f, 53.300007f, 41.4f, 53.300007f, 41.300003f, 53.300007f);
generalPath.curveTo(41.300003f, 53.300007f, 39.600002f, 53.600006f, 37.200005f, 54.000008f);
generalPath.curveTo(36.700005f, 54.100006f, 36.100006f, 54.100006f, 35.500004f, 54.100006f);
generalPath.curveTo(33.000004f, 54.100006f, 30.300003f, 53.700005f, 29.800003f, 53.400005f);
generalPath.curveTo(29.800003f, 53.500004f, 29.800003f, 53.400005f, 29.900003f, 53.400005f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.775999069213867, 55.03900146484375), new Point2D.Double(44.49599838256836, 55.03900146484375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.4f, 62.2f);
generalPath.curveTo(44.9f, 62.2f, 51.0f, 60.100002f, 52.2f, 58.9f);
generalPath.curveTo(52.600002f, 58.4f, 52.7f, 58.0f, 52.600002f, 57.7f);
generalPath.curveTo(52.500004f, 57.0f, 51.9f, 56.600002f, 51.800003f, 56.5f);
generalPath.curveTo(51.600002f, 56.4f, 51.4f, 56.4f, 51.300003f, 56.6f);
generalPath.curveTo(51.200005f, 56.8f, 51.200005f, 57.0f, 51.300003f, 57.1f);
generalPath.curveTo(51.4f, 57.199997f, 51.4f, 57.3f, 51.200005f, 57.6f);
generalPath.curveTo(50.800003f, 58.0f, 46.000004f, 59.399998f, 38.000004f, 59.8f);
generalPath.curveTo(36.900005f, 59.899998f, 35.800003f, 59.899998f, 34.600002f, 59.899998f);
generalPath.curveTo(27.500002f, 59.899998f, 22.200003f, 58.899998f, 21.600002f, 58.399998f);
generalPath.curveTo(21.900002f, 57.999996f, 23.700003f, 57.399998f, 25.700003f, 57.1f);
generalPath.curveTo(25.900003f, 57.1f, 26.100002f, 56.899998f, 26.000002f, 56.6f);
generalPath.curveTo(26.000002f, 56.399998f, 25.800001f, 56.199997f, 25.500002f, 56.3f);
generalPath.lineTo(25.0f, 56.3f);
generalPath.curveTo(21.8f, 56.5f, 18.0f, 56.899998f, 17.8f, 58.6f);
generalPath.curveTo(17.699999f, 59.1f, 17.9f, 59.6f, 18.199999f, 60.0f);
generalPath.curveTo(19.199999f, 60.9f, 21.699999f, 62.2f, 33.399998f, 62.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(17.847000122070312, 59.17499923706055), new Point2D.Double(52.66400146484375, 59.17499923706055), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.5f, 59.2f);
generalPath.curveTo(54.3f, 59.100002f, 54.1f, 59.2f, 54.0f, 59.3f);
generalPath.curveTo(54.0f, 59.3f, 52.3f, 61.1f, 47.1f, 62.2f);
generalPath.curveTo(45.1f, 62.600002f, 41.399998f, 62.8f, 36.0f, 62.8f);
generalPath.curveTo(30.6f, 62.8f, 25.5f, 62.6f, 25.5f, 62.6f);
generalPath.curveTo(25.3f, 62.6f, 25.1f, 62.699997f, 25.1f, 63.0f);
generalPath.curveTo(25.1f, 63.2f, 25.2f, 63.4f, 25.4f, 63.5f);
generalPath.curveTo(25.5f, 63.5f, 30.8f, 64.8f, 38.1f, 64.8f);
generalPath.curveTo(41.6f, 64.8f, 45.0f, 64.5f, 48.3f, 64.0f);
generalPath.curveTo(54.3f, 62.9f, 54.8f, 60.0f, 54.8f, 59.8f);
generalPath.curveTo(54.7f, 59.5f, 54.6f, 59.3f, 54.5f, 59.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.01099967956543, 61.909000396728516), new Point2D.Double(54.71799850463867, 61.909000396728516), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(19.0f, 71.1f);
generalPath.lineTo(23.0f, 71.1f);
generalPath.lineTo(23.0f, 83.7f);
generalPath.curveTo(23.0f, 85.299995f, 22.9f, 86.6f, 22.6f, 87.5f);
generalPath.curveTo(22.2f, 88.7f, 21.5f, 89.6f, 20.5f, 90.3f);
generalPath.curveTo(19.5f, 91.0f, 18.1f, 91.3f, 16.4f, 91.3f);
generalPath.curveTo(14.4f, 91.3f, 12.9f, 90.8f, 11.799999f, 89.700005f);
generalPath.curveTo(10.699999f, 88.600006f, 10.199999f, 87.00001f, 10.199999f, 84.9f);
generalPath.lineTo(13.999999f, 84.5f);
generalPath.curveTo(13.999999f, 85.6f, 14.199999f, 86.4f, 14.499999f, 86.9f);
generalPath.curveTo(14.899999f, 87.6f, 15.599999f, 88.0f, 16.5f, 88.0f);
generalPath.curveTo(17.4f, 88.0f, 18.0f, 87.7f, 18.4f, 87.2f);
generalPath.curveTo(18.8f, 86.7f, 19.0f, 85.6f, 19.0f, 84.0f);
generalPath.lineTo(19.0f, 71.1f);
generalPath.closePath();
generalPath.moveTo(26.3f, 84.5f);
generalPath.lineTo(30.199999f, 84.1f);
generalPath.curveTo(30.4f, 85.4f, 30.9f, 86.4f, 31.599998f, 87.0f);
generalPath.curveTo(32.299995f, 87.6f, 33.3f, 87.9f, 34.5f, 87.9f);
generalPath.curveTo(35.8f, 87.9f, 36.8f, 87.6f, 37.5f, 87.1f);
generalPath.curveTo(38.2f, 86.6f, 38.5f, 85.9f, 38.5f, 85.2f);
generalPath.curveTo(38.5f, 84.7f, 38.4f, 84.299995f, 38.1f, 84.0f);
generalPath.curveTo(37.8f, 83.7f, 37.3f, 83.4f, 36.6f, 83.1f);
generalPath.curveTo(36.1f, 82.9f, 35.0f, 82.6f, 33.399998f, 82.2f);
generalPath.curveTo(31.199997f, 81.7f, 29.699997f, 81.0f, 28.799997f, 80.2f);
generalPath.curveTo(27.599997f, 79.1f, 26.899998f, 77.799995f, 26.899998f, 76.2f);
generalPath.curveTo(26.899998f, 75.2f, 27.199997f, 74.2f, 27.799997f, 73.399994f);
generalPath.curveTo(28.399998f, 72.59999f, 29.199997f, 71.899994f, 30.299997f, 71.399994f);
generalPath.curveTo(31.399998f, 70.899994f, 32.699997f, 70.7f, 34.299995f, 70.7f);
generalPath.curveTo(36.799995f, 70.7f, 38.699997f, 71.2f, 39.999996f, 72.299995f);
generalPath.curveTo(41.299995f, 73.399994f, 41.899998f, 74.799995f, 41.999996f, 76.7f);
generalPath.lineTo(37.999996f, 77.0f);
generalPath.curveTo(37.799995f, 76.0f, 37.499996f, 75.2f, 36.899998f, 74.8f);
generalPath.curveTo(36.3f, 74.4f, 35.499996f, 74.100006f, 34.3f, 74.100006f);
generalPath.curveTo(33.1f, 74.100006f, 32.2f, 74.3f, 31.5f, 74.8f);
generalPath.curveTo(31.1f, 75.100006f, 30.9f, 75.5f, 30.9f, 76.0f);
generalPath.curveTo(30.9f, 76.5f, 31.1f, 76.9f, 31.5f, 77.2f);
generalPath.curveTo(32.0f, 77.6f, 33.3f, 78.1f, 35.2f, 78.5f);
generalPath.curveTo(37.100002f, 78.9f, 38.600002f, 79.4f, 39.600002f, 79.9f);
generalPath.curveTo(40.500004f, 80.4f, 41.300003f, 81.1f, 41.800003f, 81.9f);
generalPath.curveTo(42.300003f, 82.8f, 42.600002f, 83.8f, 42.600002f, 85.1f);
generalPath.curveTo(42.600002f, 86.2f, 42.300003f, 87.299995f, 41.600002f, 88.299995f);
generalPath.curveTo(41.000004f, 89.299995f, 40.100002f, 89.99999f, 38.9f, 90.49999f);
generalPath.curveTo(37.7f, 90.99999f, 36.300003f, 91.19999f, 34.5f, 91.19999f);
generalPath.curveTo(32.0f, 91.19999f, 30.0f, 90.59999f, 28.6f, 89.49999f);
generalPath.curveTo(27.4f, 88.399994f, 26.6f, 86.69999f, 26.300001f, 84.49999f);
generalPath.closePath();
generalPath.moveTo(46.1f, 91.0f);
generalPath.lineTo(46.1f, 71.1f);
generalPath.lineTo(52.6f, 71.1f);
generalPath.curveTo(55.1f, 71.1f, 56.699997f, 71.2f, 57.399998f, 71.4f);
generalPath.curveTo(58.6f, 71.700005f, 59.499996f, 72.3f, 60.3f, 73.3f);
generalPath.curveTo(61.1f, 74.3f, 61.5f, 75.600006f, 61.5f, 77.200005f);
generalPath.curveTo(61.5f, 78.4f, 61.3f, 79.4f, 60.8f, 80.3f);
generalPath.curveTo(60.399998f, 81.100006f, 59.8f, 81.8f, 59.1f, 82.3f);
generalPath.curveTo(58.399998f, 82.8f, 57.699997f, 83.100006f, 57.0f, 83.200005f);
generalPath.curveTo(56.0f, 83.4f, 54.6f, 83.50001f, 52.8f, 83.50001f);
generalPath.lineTo(50.2f, 83.50001f);
generalPath.lineTo(50.2f, 91.0f);
generalPath.lineTo(46.100002f, 91.0f);
generalPath.closePath();
generalPath.moveTo(50.1f, 74.5f);
generalPath.lineTo(50.1f, 80.1f);
generalPath.lineTo(52.3f, 80.1f);
generalPath.curveTo(53.899998f, 80.1f, 55.0f, 80.0f, 55.5f, 79.799995f);
generalPath.curveTo(56.0f, 79.6f, 56.5f, 79.299995f, 56.8f, 78.799995f);
generalPath.curveTo(57.1f, 78.399994f, 57.3f, 77.799995f, 57.3f, 77.299995f);
generalPath.curveTo(57.3f, 76.6f, 57.1f, 75.99999f, 56.7f, 75.49999f);
generalPath.curveTo(56.3f, 74.99999f, 55.7f, 74.69999f, 55.100002f, 74.59999f);
generalPath.curveTo(54.600002f, 74.49999f, 53.600002f, 74.49999f, 52.2f, 74.49999f);
generalPath.lineTo(50.100002f, 74.49999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(45.0f, 1.1f);
generalPath.lineTo(72.0f, 27.800001f);
generalPath.lineTo(45.0f, 27.800001f);
generalPath.lineTo(45.0f, 1.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.084999084472656, 74.13099670410156), new Point2D.Double(58.584999084472656, 87.63099670410156), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.1f);
generalPath.lineTo(72.0f, 27.800001f);
generalPath.lineTo(45.0f, 27.800001f);
generalPath.lineTo(45.0f, 1.1f);
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
generalPath.moveTo(45.0f, 1.1f);
generalPath.lineTo(72.0f, 27.800001f);
generalPath.lineTo(45.0f, 27.800001f);
generalPath.lineTo(45.0f, 1.1f);
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
        return 0.12999992072582245;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 9.999846806749701E-4;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000691413879;
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
	private ext_jsp() {
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
       ext_jsp base = new ext_jsp();
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
       ext_jsp base = new ext_jsp();
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
        return ext_jsp::new;
    }
}


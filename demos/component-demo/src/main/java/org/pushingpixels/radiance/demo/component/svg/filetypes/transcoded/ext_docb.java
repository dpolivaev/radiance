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
public class ext_docb implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 45, 68, 255)) : new Color(0, 45, 68, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 56, 82, 255)) : new Color(1, 56, 82, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 77, 107, 255)) : new Color(10, 77, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 94, 130, 255)) : new Color(15, 94, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 109, 150, 255)) : new Color(15, 109, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(13, 119, 164, 255)) : new Color(13, 119, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 126, 174, 255)) : new Color(10, 126, 174, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 129, 178, 255)) : new Color(8, 129, 178, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(7.7f, 76.7f);
generalPath.lineTo(13.0f, 76.7f);
generalPath.curveTo(14.2f, 76.7f, 15.1f, 76.799995f, 15.8f, 77.0f);
generalPath.curveTo(16.6f, 77.2f, 17.4f, 77.7f, 18.0f, 78.3f);
generalPath.curveTo(18.6f, 78.9f, 19.1f, 79.700005f, 19.4f, 80.600006f);
generalPath.curveTo(19.699999f, 81.50001f, 19.9f, 82.600006f, 19.9f, 84.00001f);
generalPath.curveTo(19.9f, 85.200005f, 19.8f, 86.200005f, 19.5f, 87.00001f);
generalPath.curveTo(19.1f, 88.00001f, 18.6f, 88.90001f, 18.0f, 89.50001f);
generalPath.curveTo(17.5f, 90.00001f, 16.8f, 90.40001f, 15.9f, 90.600006f);
generalPath.curveTo(15.299999f, 90.8f, 14.4f, 90.90001f, 13.299999f, 90.90001f);
generalPath.lineTo(7.7f, 90.90001f);
generalPath.lineTo(7.7f, 76.7f);
generalPath.closePath();
generalPath.moveTo(10.7f, 79.2f);
generalPath.lineTo(10.7f, 88.7f);
generalPath.lineTo(12.9f, 88.7f);
generalPath.curveTo(13.7f, 88.7f, 14.299999f, 88.7f, 14.7f, 88.6f);
generalPath.curveTo(15.2f, 88.5f, 15.599999f, 88.299995f, 15.9f, 88.0f);
generalPath.curveTo(16.199999f, 87.7f, 16.5f, 87.3f, 16.699999f, 86.6f);
generalPath.curveTo(16.9f, 86.0f, 16.999998f, 85.1f, 16.999998f, 84.0f);
generalPath.curveTo(16.999998f, 82.9f, 16.899998f, 82.0f, 16.699999f, 81.5f);
generalPath.curveTo(16.499998f, 80.9f, 16.199999f, 80.4f, 15.899999f, 80.1f);
generalPath.curveTo(15.499999f, 79.799995f, 15.099998f, 79.5f, 14.499999f, 79.4f);
generalPath.curveTo(14.099999f, 79.3f, 13.299999f, 79.3f, 12.099998f, 79.3f);
generalPath.lineTo(10.699999f, 79.3f);
generalPath.closePath();
generalPath.moveTo(21.7f, 84.0f);
generalPath.curveTo(21.7f, 82.5f, 21.900002f, 81.3f, 22.400002f, 80.3f);
generalPath.curveTo(22.7f, 79.600006f, 23.2f, 78.9f, 23.7f, 78.3f);
generalPath.curveTo(24.2f, 77.700005f, 24.900002f, 77.3f, 25.6f, 77.0f);
generalPath.curveTo(26.5f, 76.6f, 27.5f, 76.4f, 28.7f, 76.4f);
generalPath.curveTo(30.800001f, 76.4f, 32.5f, 77.1f, 33.8f, 78.4f);
generalPath.curveTo(35.1f, 79.700005f, 35.7f, 81.5f, 35.7f, 83.9f);
generalPath.curveTo(35.7f, 86.200005f, 35.100002f, 88.0f, 33.8f, 89.3f);
generalPath.curveTo(32.499996f, 90.600006f, 30.8f, 91.3f, 28.699999f, 91.3f);
generalPath.curveTo(26.499998f, 91.3f, 24.8f, 90.700005f, 23.599998f, 89.4f);
generalPath.curveTo(22.399998f, 88.1f, 21.699999f, 86.3f, 21.699999f, 84.0f);
generalPath.closePath();
generalPath.moveTo(24.800001f, 83.9f);
generalPath.curveTo(24.800001f, 85.5f, 25.2f, 86.700005f, 25.900002f, 87.6f);
generalPath.curveTo(26.600002f, 88.49999f, 27.600002f, 88.9f, 28.800001f, 88.9f);
generalPath.curveTo(30.0f, 88.9f, 30.900002f, 88.5f, 31.7f, 87.700005f);
generalPath.curveTo(32.4f, 86.9f, 32.8f, 85.600006f, 32.8f, 84.00001f);
generalPath.curveTo(32.8f, 82.40001f, 32.399998f, 81.100006f, 31.699999f, 80.30001f);
generalPath.curveTo(30.9f, 79.40001f, 29.999998f, 79.00001f, 28.8f, 79.00001f);
generalPath.curveTo(27.6f, 79.00001f, 26.599998f, 79.40001f, 25.9f, 80.200005f);
generalPath.curveTo(25.1f, 81.00001f, 24.8f, 82.200005f, 24.8f, 83.9f);
generalPath.closePath();
generalPath.moveTo(47.300003f, 85.8f);
generalPath.lineTo(50.100002f, 86.700005f);
generalPath.curveTo(49.7f, 88.3f, 48.9f, 89.4f, 47.9f, 90.200005f);
generalPath.curveTo(46.9f, 91.00001f, 45.600002f, 91.3f, 44.100002f, 91.3f);
generalPath.curveTo(42.2f, 91.3f, 40.600002f, 90.700005f, 39.4f, 89.4f);
generalPath.curveTo(38.2f, 88.1f, 37.5f, 86.3f, 37.5f, 84.1f);
generalPath.curveTo(37.5f, 81.7f, 38.1f, 79.9f, 39.4f, 78.5f);
generalPath.curveTo(40.600002f, 77.2f, 42.300003f, 76.5f, 44.300003f, 76.5f);
generalPath.curveTo(46.100002f, 76.5f, 47.500004f, 77.0f, 48.600002f, 78.1f);
generalPath.curveTo(49.300003f, 78.7f, 49.800003f, 79.6f, 50.100002f, 80.7f);
generalPath.lineTo(47.2f, 81.399994f);
generalPath.curveTo(47.0f, 80.7f, 46.7f, 80.09999f, 46.100002f, 79.59999f);
generalPath.curveTo(45.500004f, 79.09999f, 44.9f, 78.99999f, 44.100002f, 78.99999f);
generalPath.curveTo(43.000004f, 78.99999f, 42.2f, 79.399994f, 41.500004f, 80.09999f);
generalPath.curveTo(40.800003f, 80.899994f, 40.500004f, 82.09999f, 40.500004f, 83.79999f);
generalPath.curveTo(40.500004f, 85.59999f, 40.800003f, 86.89999f, 41.500004f, 87.69999f);
generalPath.curveTo(42.200005f, 88.49999f, 43.000004f, 88.89999f, 44.100002f, 88.89999f);
generalPath.curveTo(44.9f, 88.89999f, 45.500004f, 88.69999f, 46.100002f, 88.19999f);
generalPath.curveTo(46.7f, 87.69999f, 47.100002f, 86.79999f, 47.300003f, 85.79999f);
generalPath.closePath();
generalPath.moveTo(52.700005f, 76.700005f);
generalPath.lineTo(58.500004f, 76.700005f);
generalPath.curveTo(59.600002f, 76.700005f, 60.500004f, 76.700005f, 61.100002f, 76.8f);
generalPath.curveTo(61.7f, 76.9f, 62.2f, 77.100006f, 62.600002f, 77.4f);
generalPath.curveTo(63.000004f, 77.700005f, 63.4f, 78.1f, 63.7f, 78.6f);
generalPath.curveTo(64.0f, 79.1f, 64.1f, 79.7f, 64.1f, 80.299995f);
generalPath.curveTo(64.1f, 80.99999f, 63.899998f, 81.6f, 63.6f, 82.1f);
generalPath.curveTo(63.199997f, 82.7f, 62.699997f, 83.1f, 62.1f, 83.4f);
generalPath.curveTo(63.0f, 83.700005f, 63.699997f, 84.1f, 64.1f, 84.700005f);
generalPath.curveTo(64.6f, 85.3f, 64.799995f, 86.00001f, 64.799995f, 86.9f);
generalPath.curveTo(64.799995f, 87.6f, 64.6f, 88.200005f, 64.299995f, 88.8f);
generalPath.curveTo(63.999992f, 89.4f, 63.599995f, 89.9f, 62.999996f, 90.3f);
generalPath.curveTo(62.399998f, 90.700005f, 61.799995f, 90.9f, 60.999996f, 91.0f);
generalPath.curveTo(60.499996f, 91.1f, 59.299995f, 91.1f, 57.499996f, 91.1f);
generalPath.lineTo(52.599995f, 91.1f);
generalPath.lineTo(52.599995f, 76.7f);
generalPath.closePath();
generalPath.moveTo(55.600006f, 79.100006f);
generalPath.lineTo(55.600006f, 82.40001f);
generalPath.lineTo(59.600006f, 82.40001f);
generalPath.curveTo(60.100006f, 82.30001f, 60.500008f, 82.20001f, 60.800007f, 81.90001f);
generalPath.curveTo(61.100006f, 81.600006f, 61.20001f, 81.20001f, 61.20001f, 80.80001f);
generalPath.curveTo(61.20001f, 80.40001f, 61.10001f, 80.00001f, 60.800007f, 79.70001f);
generalPath.curveTo(60.500004f, 79.40002f, 60.20001f, 79.30001f, 59.70001f, 79.20001f);
generalPath.lineTo(55.60001f, 79.20001f);
generalPath.closePath();
generalPath.moveTo(55.600006f, 84.8f);
generalPath.lineTo(55.600006f, 88.600006f);
generalPath.lineTo(58.300007f, 88.600006f);
generalPath.curveTo(59.400005f, 88.600006f, 60.000008f, 88.600006f, 60.300007f, 88.50001f);
generalPath.curveTo(60.70001f, 88.40001f, 61.100006f, 88.200005f, 61.400005f, 87.90001f);
generalPath.curveTo(61.700005f, 87.60001f, 61.800007f, 87.20001f, 61.800007f, 86.70001f);
generalPath.curveTo(61.800007f, 86.30001f, 61.70001f, 85.90001f, 61.500008f, 85.60001f);
generalPath.curveTo(61.300007f, 85.30002f, 61.000008f, 85.10001f, 60.600006f, 84.90002f);
generalPath.curveTo(60.200005f, 84.80002f, 59.300007f, 84.70002f, 58.000008f, 84.70002f);
generalPath.lineTo(55.600006f, 84.70002f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(64.4f, 25.7f);
generalPath.curveTo(63.9f, 25.7f, 63.4f, 25.900002f, 63.0f, 26.0f);
generalPath.curveTo(62.5f, 26.2f, 62.0f, 26.4f, 61.6f, 26.6f);
generalPath.curveTo(60.899998f, 27.0f, 60.399998f, 27.4f, 60.1f, 27.9f);
generalPath.curveTo(59.8f, 28.4f, 59.5f, 29.0f, 59.3f, 29.6f);
generalPath.curveTo(58.399998f, 32.0f, 57.1f, 35.6f, 55.3f, 40.9f);
generalPath.curveTo(53.5f, 46.0f, 51.7f, 51.4f, 49.7f, 56.9f);
generalPath.lineTo(45.0f, 56.9f);
generalPath.lineTo(36.3f, 32.5f);
generalPath.lineTo(28.4f, 56.9f);
generalPath.lineTo(23.7f, 56.9f);
generalPath.curveTo(21.1f, 49.4f, 19.1f, 43.600002f, 17.7f, 39.7f);
generalPath.curveTo(16.300001f, 35.600002f, 15.200001f, 32.3f, 14.200001f, 29.5f);
generalPath.curveTo(13.900001f, 28.7f, 13.6f, 28.1f, 13.200001f, 27.7f);
generalPath.curveTo(12.800001f, 27.300001f, 12.300001f, 26.900002f, 11.800001f, 26.5f);
generalPath.curveTo(11.400002f, 26.2f, 10.900002f, 26.0f, 10.500001f, 25.9f);
generalPath.curveTo(10.000001f, 25.8f, 9.500001f, 25.699999f, 8.900001f, 25.6f);
generalPath.lineTo(8.900001f, 23.800001f);
generalPath.lineTo(26.5f, 23.800001f);
generalPath.lineTo(26.5f, 25.6f);
generalPath.curveTo(25.5f, 25.7f, 24.7f, 25.800001f, 24.2f, 26.0f);
generalPath.curveTo(23.7f, 26.1f, 23.300001f, 26.2f, 23.0f, 26.4f);
generalPath.curveTo(22.7f, 26.5f, 22.5f, 26.699999f, 22.5f, 26.8f);
generalPath.curveTo(22.4f, 26.9f, 22.4f, 27.099998f, 22.4f, 27.199999f);
generalPath.curveTo(22.4f, 27.4f, 22.4f, 27.599998f, 22.5f, 27.8f);
generalPath.curveTo(22.6f, 28.0f, 22.6f, 28.199999f, 22.7f, 28.5f);
generalPath.curveTo(23.1f, 29.7f, 23.800001f, 32.0f, 25.0f, 35.3f);
generalPath.curveTo(26.1f, 38.7f, 27.5f, 42.8f, 29.2f, 47.8f);
generalPath.lineTo(36.7f, 24.0f);
generalPath.lineTo(41.600002f, 24.0f);
generalPath.lineTo(50.300003f, 48.5f);
generalPath.curveTo(51.600002f, 44.5f, 52.600002f, 41.3f, 53.4f, 38.8f);
generalPath.curveTo(54.2f, 36.3f, 54.800003f, 34.1f, 55.300003f, 32.399998f);
generalPath.curveTo(55.600002f, 31.299997f, 55.9f, 30.399998f, 56.000004f, 29.599998f);
generalPath.curveTo(56.200005f, 28.899998f, 56.300003f, 28.199999f, 56.300003f, 27.699999f);
generalPath.curveTo(56.300003f, 27.4f, 56.100002f, 27.099998f, 55.800003f, 26.9f);
generalPath.curveTo(55.500004f, 26.699999f, 55.100002f, 26.5f, 54.600002f, 26.3f);
generalPath.curveTo(54.2f, 26.199999f, 53.600002f, 26.0f, 52.9f, 26.0f);
generalPath.curveTo(52.2f, 25.9f, 51.600002f, 25.8f, 51.100002f, 25.8f);
generalPath.lineTo(51.100002f, 23.8f);
generalPath.lineTo(64.4f, 23.8f);
generalPath.lineTo(64.4f, 25.699999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.121000289916992, 50.46799850463867), new Point2D.Double(55.04100036621094, 87.38899993896484), new float[] {0.005f,0.116f,0.239f,0.369f,0.502f,0.639f,0.779f,0.918f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 97, 134, 255)) : new Color(0, 97, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 95, 131, 255)) : new Color(0, 95, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 90, 125, 255)) : new Color(0, 90, 125, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 83, 115, 255)) : new Color(0, 83, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 72, 101, 255)) : new Color(0, 72, 101, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 57, 83, 255)) : new Color(0, 57, 83, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 37, 60, 255)) : new Color(0, 37, 60, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 3, 29, 255)) : new Color(0, 3, 29, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 241, 250, 255)) : new Color(223, 241, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(220, 238, 247, 255)) : new Color(220, 238, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 228, 239, 255)) : new Color(211, 228, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(196, 214, 227, 255)) : new Color(196, 214, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(177, 197, 213, 255)) : new Color(177, 197, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 176, 197, 255)) : new Color(154, 176, 197, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 154, 179, 255)) : new Color(129, 154, 179, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 130, 159, 255)) : new Color(100, 130, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 108, 140, 255)) : new Color(66, 108, 140, 255)),((colorFilter != null) ? colorFilter.filter(new Color(6, 87, 122, 255)) : new Color(6, 87, 122, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 86, 121, 255)) : new Color(1, 86, 121, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
		return 1.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_docb() {
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
       ext_docb base = new ext_docb();
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
       ext_docb base = new ext_docb();
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
        return ext_docb::new;
    }
}


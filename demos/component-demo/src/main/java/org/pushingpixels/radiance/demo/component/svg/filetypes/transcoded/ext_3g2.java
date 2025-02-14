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
public class ext_3g2 implements RadianceIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(72.2f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 101.0), new Point2D.Double(36.20000076293945, 3.005000114440918), new float[] {0.0f,0.17f,0.313f,0.447f,0.575f,0.698f,0.819f,0.934f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(226, 205, 228, 255)) : new Color(226, 205, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(224, 202, 226, 255)) : new Color(224, 202, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 192, 221, 255)) : new Color(219, 192, 221, 255)),((colorFilter != null) ? colorFilter.filter(new Color(210, 177, 212, 255)) : new Color(210, 177, 212, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 157, 199, 255)) : new Color(199, 157, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(186, 132, 185, 255)) : new Color(186, 132, 185, 255)),((colorFilter != null) ? colorFilter.filter(new Color(171, 104, 169, 255)) : new Color(171, 104, 169, 255)),((colorFilter != null) ? colorFilter.filter(new Color(156, 69, 152, 255)) : new Color(156, 69, 152, 255)),((colorFilter != null) ? colorFilter.filter(new Color(147, 42, 142, 255)) : new Color(147, 42, 142, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(72.2f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 35, 131, 255)) : new Color(136, 35, 131, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(72.2f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(11.3f, 85.8f);
generalPath.lineTo(15.0f, 85.4f);
generalPath.curveTo(15.1f, 86.3f, 15.4f, 87.1f, 16.0f, 87.6f);
generalPath.curveTo(16.5f, 88.1f, 17.1f, 88.299995f, 17.9f, 88.299995f);
generalPath.curveTo(18.699999f, 88.299995f, 19.4f, 87.99999f, 19.9f, 87.399994f);
generalPath.curveTo(20.4f, 86.799995f, 20.699999f, 85.99999f, 20.699999f, 84.99999f);
generalPath.curveTo(20.699999f, 83.99999f, 20.4f, 83.299995f, 19.9f, 82.69999f);
generalPath.curveTo(19.4f, 82.09998f, 18.699999f, 81.89999f, 18.0f, 81.89999f);
generalPath.curveTo(17.5f, 81.89999f, 16.9f, 81.999985f, 16.2f, 82.19999f);
generalPath.lineTo(16.6f, 79.09999f);
generalPath.curveTo(17.6f, 79.09999f, 18.4f, 78.899994f, 19.0f, 78.399994f);
generalPath.curveTo(19.6f, 77.899994f, 19.8f, 77.299995f, 19.8f, 76.49999f);
generalPath.curveTo(19.8f, 75.799995f, 19.599998f, 75.299995f, 19.199999f, 74.899994f);
generalPath.curveTo(18.8f, 74.49999f, 18.3f, 74.299995f, 17.599998f, 74.299995f);
generalPath.curveTo(16.899998f, 74.299995f, 16.399998f, 74.49999f, 15.899999f, 74.99999f);
generalPath.curveTo(15.399999f, 75.49999f, 15.199999f, 76.09999f, 15.099998f, 76.99999f);
generalPath.lineTo(11.599998f, 76.399994f);
generalPath.curveTo(11.799998f, 75.2f, 12.199999f, 74.2f, 12.699999f, 73.49999f);
generalPath.curveTo(13.199999f, 72.799995f, 13.899999f, 72.19999f, 14.799999f, 71.799995f);
generalPath.curveTo(15.7f, 71.4f, 16.699999f, 71.2f, 17.8f, 71.2f);
generalPath.curveTo(19.699999f, 71.2f, 21.199999f, 71.799995f, 22.3f, 73.0f);
generalPath.curveTo(23.199999f, 74.0f, 23.699999f, 75.1f, 23.699999f, 76.3f);
generalPath.curveTo(23.699999f, 78.0f, 22.699999f, 79.4f, 20.8f, 80.5f);
generalPath.curveTo(21.9f, 80.7f, 22.9f, 81.3f, 23.599998f, 82.1f);
generalPath.curveTo(24.3f, 82.9f, 24.599998f, 84.0f, 24.599998f, 85.2f);
generalPath.curveTo(24.599998f, 86.899994f, 23.999998f, 88.399994f, 22.699999f, 89.7f);
generalPath.curveTo(21.4f, 90.899994f, 19.8f, 91.5f, 17.899998f, 91.5f);
generalPath.curveTo(16.099998f, 91.5f, 14.5999975f, 91.0f, 13.399998f, 90.0f);
generalPath.curveTo(12.0999975f, 88.8f, 11.399998f, 87.5f, 11.299997f, 85.8f);
generalPath.closePath();
generalPath.moveTo(37.1f, 83.8f);
generalPath.lineTo(37.1f, 80.5f);
generalPath.lineTo(45.8f, 80.5f);
generalPath.lineTo(45.8f, 88.4f);
generalPath.curveTo(45.0f, 89.200005f, 43.7f, 89.9f, 42.1f, 90.5f);
generalPath.curveTo(40.499996f, 91.1f, 38.899998f, 91.4f, 37.199997f, 91.4f);
generalPath.curveTo(35.1f, 91.4f, 33.299995f, 91.0f, 31.699997f, 90.1f);
generalPath.curveTo(30.099998f, 89.2f, 29.0f, 88.0f, 28.2f, 86.4f);
generalPath.curveTo(27.400002f, 84.8f, 27.0f, 83.0f, 27.0f, 81.1f);
generalPath.curveTo(27.0f, 79.0f, 27.4f, 77.2f, 28.3f, 75.6f);
generalPath.curveTo(29.199999f, 74.0f, 30.5f, 72.799995f, 32.1f, 71.9f);
generalPath.curveTo(33.399998f, 71.200005f, 35.0f, 70.9f, 36.899998f, 70.9f);
generalPath.curveTo(39.399998f, 70.9f, 41.3f, 71.4f, 42.699997f, 72.4f);
generalPath.curveTo(44.099995f, 73.4f, 44.999996f, 74.9f, 45.399998f, 76.700005f);
generalPath.lineTo(41.399998f, 77.4f);
generalPath.curveTo(41.1f, 76.4f, 40.6f, 75.700005f, 39.8f, 75.1f);
generalPath.curveTo(39.0f, 74.5f, 38.0f, 74.299995f, 36.899998f, 74.299995f);
generalPath.curveTo(35.1f, 74.299995f, 33.699997f, 74.899994f, 32.699997f, 75.99999f);
generalPath.curveTo(31.699997f, 77.09999f, 31.099997f, 78.799995f, 31.099997f, 80.899994f);
generalPath.curveTo(31.099997f, 83.299995f, 31.599997f, 84.99999f, 32.699997f, 86.2f);
generalPath.curveTo(33.799995f, 87.399994f, 35.1f, 88.0f, 36.899998f, 88.0f);
generalPath.curveTo(37.699997f, 88.0f, 38.6f, 87.8f, 39.399998f, 87.5f);
generalPath.curveTo(40.3f, 87.2f, 40.999996f, 86.8f, 41.6f, 86.3f);
generalPath.lineTo(41.6f, 83.8f);
generalPath.lineTo(37.1f, 83.8f);
generalPath.closePath();
generalPath.moveTo(61.699997f, 87.5f);
generalPath.lineTo(61.699997f, 91.0f);
generalPath.lineTo(48.2f, 91.0f);
generalPath.curveTo(48.3f, 89.7f, 48.8f, 88.4f, 49.5f, 87.2f);
generalPath.curveTo(50.2f, 86.0f, 51.7f, 84.399994f, 53.8f, 82.399994f);
generalPath.curveTo(55.5f, 80.799995f, 56.6f, 79.7f, 57.0f, 79.2f);
generalPath.curveTo(57.5f, 78.399994f, 57.8f, 77.6f, 57.8f, 76.899994f);
generalPath.curveTo(57.8f, 76.09999f, 57.6f, 75.399994f, 57.1f, 74.899994f);
generalPath.curveTo(56.6f, 74.399994f, 56.0f, 74.2f, 55.199997f, 74.2f);
generalPath.curveTo(54.399998f, 74.2f, 53.799995f, 74.399994f, 53.299995f, 74.899994f);
generalPath.curveTo(52.799995f, 75.399994f, 52.599995f, 76.2f, 52.499996f, 77.299995f);
generalPath.lineTo(48.699997f, 76.99999f);
generalPath.curveTo(48.899998f, 74.899994f, 49.6f, 73.399994f, 50.799995f, 72.49999f);
generalPath.curveTo(51.999992f, 71.59999f, 53.499996f, 71.09999f, 55.299995f, 71.09999f);
generalPath.curveTo(57.299995f, 71.09999f, 58.799995f, 71.59999f, 59.999996f, 72.69999f);
generalPath.curveTo(61.099995f, 73.79999f, 61.699997f, 75.09999f, 61.699997f, 76.59999f);
generalPath.curveTo(61.699997f, 77.49999f, 61.499996f, 78.29999f, 61.199997f, 79.19999f);
generalPath.curveTo(60.899998f, 79.99999f, 60.399998f, 80.89999f, 59.699997f, 81.69999f);
generalPath.curveTo(59.199997f, 82.29999f, 58.399998f, 83.09999f, 57.199997f, 84.19999f);
generalPath.curveTo(55.999996f, 85.29999f, 55.199997f, 85.99999f, 54.899998f, 86.39999f);
generalPath.curveTo(54.6f, 86.79999f, 54.3f, 87.09998f, 54.1f, 87.499985f);
generalPath.lineTo(61.699997f, 87.499985f);
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
generalPath.moveTo(64.3f, 55.5f);
generalPath.curveTo(62.600002f, 55.3f, 60.9f, 55.2f, 59.200005f, 55.2f);
generalPath.curveTo(51.900005f, 55.100002f, 45.900005f, 56.8f, 40.400005f, 58.9f);
generalPath.curveTo(34.900005f, 61.000004f, 29.6f, 63.6f, 23.3f, 64.0f);
generalPath.curveTo(19.9f, 64.2f, 15.999999f, 63.4f, 14.799999f, 61.6f);
generalPath.curveTo(13.999999f, 60.3f, 13.999999f, 58.1f, 13.799999f, 55.899998f);
generalPath.curveTo(13.199999f, 50.199997f, 12.199999f, 44.199997f, 11.4f, 38.6f);
generalPath.curveTo(12.2f, 37.699997f, 13.5f, 37.3f, 14.799999f, 36.899998f);
generalPath.curveTo(15.199999f, 37.999996f, 14.999999f, 39.6f, 15.4f, 40.699997f);
generalPath.curveTo(22.5f, 41.399998f, 29.0f, 40.299995f, 35.4f, 39.199997f);
generalPath.curveTo(41.7f, 38.1f, 47.800003f, 36.999996f, 54.800003f, 36.6f);
generalPath.curveTo(58.200005f, 36.399998f, 61.700005f, 36.399998f, 65.100006f, 36.6f);
generalPath.moveTo(55.200005f, 51.899998f);
generalPath.curveTo(55.700005f, 51.699997f, 56.300003f, 51.6f, 57.100006f, 51.699997f);
generalPath.curveTo(57.300007f, 47.999996f, 57.400005f, 44.399998f, 57.400005f, 40.499996f);
generalPath.curveTo(51.200005f, 40.699997f, 45.500008f, 41.399998f, 40.400005f, 42.699997f);
generalPath.curveTo(40.600006f, 46.699997f, 40.800007f, 50.499996f, 40.700005f, 54.699997f);
generalPath.curveTo(44.700005f, 53.6f, 48.400005f, 52.199997f, 53.300003f, 51.999996f);
generalPath.moveTo(55.300003f, 39.899994f);
generalPath.lineTo(56.4f, 39.899994f);
generalPath.curveTo(56.800003f, 39.499992f, 56.600002f, 38.699993f, 56.600002f, 37.999992f);
generalPath.curveTo(55.100002f, 37.399994f, 54.800003f, 38.999992f, 55.300003f, 39.899994f);
generalPath.closePath();
generalPath.moveTo(59.200005f, 39.699993f);
generalPath.lineTo(60.700005f, 39.699993f);
generalPath.lineTo(60.700005f, 38.0f);
generalPath.lineTo(59.400005f, 38.0f);
generalPath.curveTo(59.400005f, 38.7f, 59.000004f, 38.9f, 59.200005f, 39.7f);
generalPath.closePath();
generalPath.moveTo(63.200005f, 39.699993f);
generalPath.curveTo(63.700005f, 39.599995f, 64.00001f, 39.699993f, 64.3f, 39.899994f);
generalPath.curveTo(64.700005f, 39.599995f, 64.5f, 38.699993f, 64.5f, 37.999992f);
generalPath.lineTo(63.2f, 37.999992f);
generalPath.lineTo(63.2f, 39.699993f);
generalPath.closePath();
generalPath.moveTo(51.700005f, 39.999992f);
generalPath.lineTo(52.600006f, 39.999992f);
generalPath.curveTo(53.000008f, 39.699993f, 52.800007f, 38.79999f, 52.800007f, 38.09999f);
generalPath.curveTo(51.400005f, 37.69999f, 51.20001f, 39.29999f, 51.70001f, 39.999992f);
generalPath.closePath();
generalPath.moveTo(47.700005f, 40.399994f);
generalPath.curveTo(48.400005f, 40.599995f, 48.500004f, 40.099995f, 49.200005f, 40.199993f);
generalPath.lineTo(49.200005f, 38.499992f);
generalPath.curveTo(47.700005f, 38.09999f, 47.500004f, 39.09999f, 47.700005f, 40.399994f);
generalPath.closePath();
generalPath.moveTo(44.100006f, 39.299995f);
generalPath.curveTo(44.100006f, 39.899994f, 44.000008f, 40.699997f, 44.300007f, 40.999996f);
generalPath.curveTo(44.800007f, 41.099995f, 44.800007f, 40.599995f, 45.400005f, 40.799995f);
generalPath.curveTo(45.200005f, 40.199997f, 45.900005f, 38.799995f, 45.000004f, 38.899994f);
generalPath.curveTo(44.900005f, 39.299995f, 44.200005f, 38.999992f, 44.100002f, 39.299995f);
generalPath.closePath();
generalPath.moveTo(12.600006f, 40.099995f);
generalPath.curveTo(13.000006f, 39.999996f, 13.7000065f, 40.699993f, 13.900006f, 40.099995f);
generalPath.curveTo(13.400006f, 40.099995f, 13.800006f, 39.299995f, 13.7000065f, 38.999996f);
generalPath.curveTo(13.000007f, 39.199997f, 12.400006f, 39.299995f, 12.600006f, 40.099995f);
generalPath.closePath();
generalPath.moveTo(40.900005f, 39.699993f);
generalPath.curveTo(40.600006f, 39.999992f, 41.100006f, 40.79999f, 40.900005f, 41.599995f);
generalPath.curveTo(41.500004f, 41.799995f, 41.500004f, 41.299995f, 42.000004f, 41.399994f);
generalPath.curveTo(41.800003f, 40.799995f, 42.500004f, 39.399994f, 41.600002f, 39.499992f);
generalPath.curveTo(41.500004f, 39.79999f, 41.2f, 39.699993f, 40.9f, 39.699993f);
generalPath.closePath();
generalPath.moveTo(37.400005f, 42.499992f);
generalPath.curveTo(37.900005f, 42.399994f, 38.300007f, 42.29999f, 38.700005f, 42.09999f);
generalPath.curveTo(38.900005f, 41.29999f, 38.300003f, 41.19999f, 38.500004f, 40.39999f);
generalPath.lineTo(37.600002f, 40.39999f);
generalPath.curveTo(37.300003f, 40.69999f, 37.500004f, 41.69999f, 37.4f, 42.49999f);
generalPath.closePath();
generalPath.moveTo(64.3f, 40.699993f);
generalPath.curveTo(62.200005f, 40.599995f, 61.000004f, 40.499992f, 58.800003f, 40.499992f);
generalPath.curveTo(58.300003f, 43.899994f, 58.800003f, 48.29999f, 58.300003f, 51.699993f);
generalPath.curveTo(60.700005f, 51.699993f, 61.9f, 51.79999f, 64.100006f, 51.999992f);
generalPath.moveTo(33.4f, 41.6f);
generalPath.curveTo(33.9f, 41.8f, 33.5f, 42.8f, 33.600002f, 43.3f);
generalPath.curveTo(34.100002f, 43.2f, 34.7f, 43.1f, 35.100002f, 42.899998f);
generalPath.curveTo(35.7f, 40.999996f, 34.2f, 40.499996f, 33.4f, 41.6f);
generalPath.closePath();
generalPath.moveTo(28.7f, 42.199997f);
generalPath.lineTo(28.7f, 44.1f);
generalPath.curveTo(29.6f, 44.3f, 29.900002f, 43.899998f, 30.6f, 43.899998f);
generalPath.curveTo(30.5f, 43.199997f, 30.800001f, 42.199997f, 30.4f, 41.8f);
generalPath.curveTo(29.9f, 42.0f, 29.1f, 41.899998f, 28.699999f, 42.2f);
generalPath.closePath();
generalPath.moveTo(23.400002f, 42.799995f);
generalPath.curveTo(23.7f, 43.299995f, 23.400002f, 44.399994f, 23.800001f, 44.899994f);
generalPath.curveTo(24.500002f, 44.999992f, 24.6f, 44.499992f, 25.300001f, 44.699993f);
generalPath.curveTo(25.2f, 43.999992f, 25.000002f, 43.499992f, 25.1f, 42.599995f);
generalPath.curveTo(24.300001f, 42.399994f, 24.2f, 42.899994f, 23.4f, 42.799995f);
generalPath.closePath();
generalPath.moveTo(15.900002f, 44.799995f);
generalPath.lineTo(17.0f, 44.799995f);
generalPath.curveTo(17.2f, 43.899994f, 16.6f, 43.599995f, 16.8f, 42.699997f);
generalPath.curveTo(16.4f, 42.799995f, 15.599999f, 42.399998f, 15.499999f, 42.899998f);
generalPath.curveTo(16.099998f, 43.1f, 15.399999f, 44.6f, 15.899999f, 44.8f);
generalPath.closePath();
generalPath.moveTo(19.300001f, 45.799995f);
generalPath.curveTo(19.400002f, 49.899994f, 20.2f, 55.099995f, 20.7f, 59.499996f);
generalPath.curveTo(28.7f, 59.599995f, 33.800003f, 56.799995f, 39.9f, 54.999996f);
generalPath.curveTo(39.4f, 51.099995f, 40.0f, 46.299995f, 39.2f, 42.799995f);
generalPath.curveTo(33.0f, 44.399994f, 27.1f, 45.999996f, 19.300001f, 45.799995f);
generalPath.closePath();
generalPath.moveTo(19.800001f, 44.999996f);
generalPath.lineTo(20.900002f, 44.999996f);
generalPath.curveTo(21.300001f, 44.499996f, 20.7f, 43.799995f, 20.900002f, 42.899998f);
generalPath.lineTo(19.400002f, 42.899998f);
generalPath.curveTo(19.500002f, 43.6f, 19.500002f, 44.499996f, 19.800001f, 44.999996f);
generalPath.closePath();
generalPath.moveTo(14.400002f, 52.799995f);
generalPath.curveTo(14.600001f, 52.799995f, 14.700002f, 52.999996f, 14.800001f, 53.199997f);
generalPath.curveTo(14.400002f, 52.499996f, 14.100001f, 53.699997f, 14.600001f, 53.799995f);
generalPath.curveTo(14.700002f, 53.599995f, 14.600001f, 53.399994f, 14.800001f, 53.399994f);
generalPath.curveTo(15.100001f, 53.899994f, 14.000001f, 54.099995f, 14.600001f, 54.199993f);
generalPath.curveTo(15.300001f, 53.699993f, 15.900002f, 52.999992f, 17.000002f, 52.699993f);
generalPath.curveTo(16.900002f, 54.199993f, 17.400002f, 55.099995f, 17.400002f, 56.499992f);
generalPath.curveTo(16.7f, 56.999992f, 15.700002f, 57.199993f, 15.500002f, 58.199993f);
generalPath.curveTo(16.700003f, 58.899994f, 18.000002f, 59.399994f, 19.7f, 59.499992f);
generalPath.curveTo(19.0f, 54.59999f, 18.6f, 50.699993f, 18.1f, 45.79999f);
generalPath.curveTo(15.900001f, 46.09999f, 14.1f, 44.999992f, 13.0f, 44.89999f);
generalPath.curveTo(13.9f, 45.69999f, 13.6f, 47.39999f, 13.8f, 48.49999f);
generalPath.curveTo(13.8f, 48.299988f, 13.8f, 48.099987f, 14.0f, 48.099987f);
generalPath.curveTo(13.9f, 48.799988f, 14.1f, 49.799988f, 13.8f, 50.199986f);
generalPath.curveTo(14.5f, 50.499985f, 14.3f, 49.999985f, 14.2f, 51.099987f);
generalPath.moveTo(58.8f, 54.299988f);
generalPath.lineTo(59.899998f, 54.299988f);
generalPath.curveTo(60.199997f, 53.99999f, 60.1f, 53.19999f, 60.1f, 52.599987f);
generalPath.lineTo(58.8f, 52.599987f);
generalPath.lineTo(58.8f, 54.299988f);
generalPath.closePath();
generalPath.moveTo(54.8f, 52.899986f);
generalPath.lineTo(54.8f, 54.199986f);
generalPath.curveTo(55.2f, 54.599987f, 55.5f, 53.999985f, 56.3f, 54.199986f);
generalPath.lineTo(56.3f, 52.699986f);
generalPath.curveTo(55.7f, 52.699986f, 55.1f, 52.699986f, 54.8f, 52.899986f);
generalPath.closePath();
generalPath.moveTo(62.399998f, 54.299988f);
generalPath.lineTo(63.699997f, 54.299988f);
generalPath.lineTo(63.699997f, 52.799988f);
generalPath.lineTo(62.399998f, 52.799988f);
generalPath.curveTo(62.499996f, 53.299988f, 62.399998f, 53.799988f, 62.399998f, 54.299988f);
generalPath.closePath();
generalPath.moveTo(51.399998f, 53.299988f);
generalPath.lineTo(51.399998f, 54.599987f);
generalPath.lineTo(52.499996f, 54.599987f);
generalPath.curveTo(52.799995f, 54.299988f, 52.899998f, 52.899986f, 52.299995f, 52.899986f);
generalPath.curveTo(52.199997f, 53.299988f, 51.499996f, 52.999985f, 51.399994f, 53.299988f);
generalPath.closePath();
generalPath.moveTo(47.8f, 53.69999f);
generalPath.curveTo(47.899998f, 54.299988f, 47.5f, 55.39999f, 48.2f, 55.39999f);
generalPath.curveTo(48.2f, 55.09999f, 48.7f, 55.19999f, 49.100002f, 55.19999f);
generalPath.curveTo(48.9f, 54.69999f, 49.500004f, 53.39999f, 48.7f, 53.49999f);
generalPath.curveTo(48.600002f, 53.799988f, 48.100002f, 53.69999f, 47.8f, 53.69999f);
generalPath.closePath();
generalPath.moveTo(44.399998f, 54.69999f);
generalPath.lineTo(44.399998f, 56.19999f);
generalPath.curveTo(45.1f, 56.39999f, 44.999996f, 55.799988f, 45.699997f, 55.99999f);
generalPath.curveTo(45.499996f, 55.49999f, 46.1f, 54.19999f, 45.299995f, 54.299988f);
generalPath.curveTo(45.199997f, 54.599987f, 44.499996f, 54.49999f, 44.399994f, 54.69999f);
generalPath.closePath();
generalPath.moveTo(15.0f, 57.0f);
generalPath.curveTo(15.7f, 56.5f, 16.3f, 55.3f, 15.2f, 54.7f);
generalPath.curveTo(14.5f, 55.100002f, 14.4f, 56.3f, 15.0f, 57.0f);
generalPath.closePath();
generalPath.moveTo(41.1f, 55.7f);
generalPath.curveTo(41.0f, 56.4f, 41.5f, 56.5f, 41.3f, 57.2f);
generalPath.curveTo(42.2f, 57.2f, 42.5f, 56.600002f, 42.399998f, 55.5f);
generalPath.curveTo(41.999996f, 55.0f, 41.6f, 55.6f, 41.1f, 55.7f);
generalPath.closePath();
generalPath.moveTo(38.1f, 58.4f);
generalPath.curveTo(39.1f, 58.4f, 39.3f, 57.600002f, 39.199997f, 56.5f);
generalPath.lineTo(38.299995f, 56.5f);
generalPath.curveTo(37.999996f, 56.9f, 38.199997f, 57.8f, 38.099995f, 58.4f);
generalPath.closePath();
generalPath.moveTo(34.5f, 58.0f);
generalPath.lineTo(34.5f, 59.7f);
generalPath.curveTo(35.1f, 59.600002f, 35.8f, 59.5f, 36.0f, 58.9f);
generalPath.curveTo(35.4f, 58.9f, 36.3f, 57.300003f, 35.4f, 57.600002f);
generalPath.curveTo(35.4f, 58.000004f, 34.7f, 57.7f, 34.5f, 58.000004f);
generalPath.closePath();
generalPath.moveTo(16.0f, 60.8f);
generalPath.curveTo(15.6f, 60.1f, 15.8f, 58.8f, 14.7f, 58.899998f);
generalPath.curveTo(14.9f, 59.6f, 14.9f, 61.6f, 16.0f, 60.8f);
generalPath.closePath();
generalPath.moveTo(29.8f, 59.899998f);
generalPath.curveTo(30.3f, 59.899998f, 29.9f, 60.8f, 30.0f, 61.199997f);
generalPath.curveTo(30.8f, 61.299995f, 31.2f, 60.999996f, 31.7f, 60.799995f);
generalPath.lineTo(31.7f, 59.099995f);
generalPath.curveTo(30.800001f, 58.999996f, 30.1f, 59.199993f, 29.800001f, 59.899994f);
generalPath.closePath();
generalPath.moveTo(25.099998f, 60.499996f);
generalPath.curveTo(25.099998f, 61.299995f, 24.999998f, 62.199997f, 25.499998f, 62.399998f);
generalPath.curveTo(25.499998f, 61.899998f, 26.299997f, 62.3f, 26.599998f, 62.199997f);
generalPath.curveTo(26.899998f, 61.899998f, 26.399998f, 61.1f, 26.599998f, 60.299995f);
generalPath.curveTo(25.899998f, 60.099995f, 25.599998f, 60.399994f, 25.099998f, 60.499996f);
generalPath.closePath();
generalPath.moveTo(19.0f, 62.3f);
generalPath.lineTo(19.0f, 60.6f);
generalPath.curveTo(18.5f, 60.6f, 18.4f, 60.199997f, 17.7f, 60.399998f);
generalPath.curveTo(17.6f, 61.499996f, 17.7f, 62.499996f, 19.0f, 62.3f);
generalPath.closePath();
generalPath.moveTo(21.5f, 62.5f);
generalPath.lineTo(22.8f, 62.5f);
generalPath.curveTo(23.0f, 61.6f, 22.5f, 61.4f, 22.599998f, 60.6f);
generalPath.lineTo(21.3f, 60.6f);
generalPath.curveTo(21.199999f, 61.5f, 21.5f, 61.8f, 21.5f, 62.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(11.51099967956543, 51.715999603271484), new Point2D.Double(65.21099853515625, 51.715999603271484), new float[] {0.005f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(150, 52, 145, 255)) : new Color(150, 52, 145, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 19, 107, 255)) : new Color(112, 19, 107, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.26900100708008, 74.20600128173828), new Point2D.Double(58.76900100708008, 87.70600128173828), new float[] {0.0f,0.378f,0.515f,0.612f,0.69f,0.757f,0.817f,0.871f,0.921f,0.965f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(249, 239, 246, 255)) : new Color(249, 239, 246, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 237, 245, 255)) : new Color(248, 237, 245, 255)),((colorFilter != null) ? colorFilter.filter(new Color(243, 230, 241, 255)) : new Color(243, 230, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 219, 235, 255)) : new Color(236, 219, 235, 255)),((colorFilter != null) ? colorFilter.filter(new Color(227, 204, 226, 255)) : new Color(227, 204, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(215, 184, 215, 255)) : new Color(215, 184, 215, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 161, 201, 255)) : new Color(202, 161, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 136, 187, 255)) : new Color(188, 136, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(174, 108, 171, 255)) : new Color(174, 108, 171, 255)),((colorFilter != null) ? colorFilter.filter(new Color(159, 77, 155, 255)) : new Color(159, 77, 155, 255)),((colorFilter != null) ? colorFilter.filter(new Color(147, 42, 142, 255)) : new Color(147, 42, 142, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(136, 35, 131, 255)) : new Color(136, 35, 131, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
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
        return 0.13199996948242188;
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
	private ext_3g2() {
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
       ext_3g2 base = new ext_3g2();
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
       ext_3g2 base = new ext_3g2();
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
        return ext_3g2::new;
    }
}


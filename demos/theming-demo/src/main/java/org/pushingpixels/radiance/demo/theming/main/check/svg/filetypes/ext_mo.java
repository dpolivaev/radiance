package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
public class ext_mo implements RadianceIcon {
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(486.3110046386719, 644.1119995117188), new Point2D.Double(486.30999755859375, 742.0850219726562), new float[] {0.0f,0.005f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(116, 45, 45, 255)) : new Color(116, 45, 45, 255)),((colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 238, 145, 255)) : new Color(255, 238, 145, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
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
generalPath.moveTo(20.4f, 91.6f);
generalPath.lineTo(20.4f, 76.0f);
generalPath.lineTo(25.2f, 76.0f);
generalPath.lineTo(28.1f, 86.6f);
generalPath.lineTo(30.9f, 76.0f);
generalPath.lineTo(35.7f, 76.0f);
generalPath.lineTo(35.7f, 91.6f);
generalPath.lineTo(32.7f, 91.6f);
generalPath.lineTo(32.7f, 79.3f);
generalPath.lineTo(29.6f, 91.600006f);
generalPath.lineTo(26.5f, 91.600006f);
generalPath.lineTo(23.4f, 79.3f);
generalPath.lineTo(23.4f, 91.600006f);
generalPath.lineTo(20.4f, 91.600006f);
generalPath.closePath();
generalPath.moveTo(38.199997f, 83.9f);
generalPath.curveTo(38.199997f, 82.3f, 38.399998f, 81.0f, 38.899998f, 79.9f);
generalPath.curveTo(39.3f, 79.1f, 39.699997f, 78.4f, 40.399998f, 77.8f);
generalPath.curveTo(40.999996f, 77.200005f, 41.699997f, 76.700005f, 42.399998f, 76.4f);
generalPath.curveTo(43.399998f, 76.0f, 44.499996f, 75.8f, 45.8f, 75.8f);
generalPath.curveTo(48.1f, 75.8f, 50.0f, 76.5f, 51.399998f, 77.9f);
generalPath.curveTo(52.8f, 79.3f, 53.499996f, 81.3f, 53.499996f, 83.8f);
generalPath.curveTo(53.499996f, 86.3f, 52.799995f, 88.3f, 51.399998f, 89.700005f);
generalPath.curveTo(50.0f, 91.100006f, 48.199997f, 91.8f, 45.8f, 91.8f);
generalPath.curveTo(43.5f, 91.8f, 41.6f, 91.100006f, 40.2f, 89.700005f);
generalPath.curveTo(38.9f, 88.3f, 38.2f, 86.4f, 38.2f, 83.9f);
generalPath.closePath();
generalPath.moveTo(41.499996f, 83.8f);
generalPath.curveTo(41.499996f, 85.600006f, 41.899998f, 86.9f, 42.699997f, 87.8f);
generalPath.curveTo(43.499996f, 88.700005f, 44.6f, 89.200005f, 45.799995f, 89.200005f);
generalPath.curveTo(47.099995f, 89.200005f, 48.099995f, 88.700005f, 48.899994f, 87.8f);
generalPath.curveTo(49.699993f, 86.9f, 50.099995f, 85.5f, 50.099995f, 83.700005f);
generalPath.curveTo(50.099995f, 81.9f, 49.699993f, 80.600006f, 48.899994f, 79.700005f);
generalPath.curveTo(48.099995f, 78.8f, 47.099995f, 78.4f, 45.699993f, 78.4f);
generalPath.curveTo(44.399994f, 78.4f, 43.29999f, 78.8f, 42.499992f, 79.700005f);
generalPath.curveTo(41.899994f, 80.600006f, 41.499992f, 82.00001f, 41.499992f, 83.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(254, 254, 254, 255)) : new Color(254, 254, 254, 255);
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(254, 234, 134, 255)) : new Color(254, 234, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(134, 114, 0, 255)) : new Color(134, 114, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(34.9f, 48.6f);
generalPath.curveTo(31.400002f, 45.199997f, 28.300001f, 42.1f, 26.500002f, 35.199997f);
generalPath.lineTo(38.800003f, 35.199997f);
generalPath.lineTo(38.800003f, 30.0f);
generalPath.lineTo(26.6f, 30.0f);
generalPath.lineTo(26.6f, 23.1f);
generalPath.lineTo(21.3f, 23.1f);
generalPath.lineTo(21.3f, 30.1f);
generalPath.lineTo(9.0f, 30.1f);
generalPath.lineTo(9.0f, 35.3f);
generalPath.lineTo(21.6f, 35.3f);
generalPath.curveTo(21.6f, 35.3f, 21.5f, 36.3f, 21.300001f, 37.1f);
generalPath.curveTo(19.6f, 43.9f, 17.5f, 48.3f, 9.0f, 52.5f);
generalPath.lineTo(10.8f, 57.7f);
generalPath.curveTo(18.8f, 53.4f, 23.0f, 48.1f, 24.900002f, 42.1f);
generalPath.curveTo(26.7f, 46.6f, 29.7f, 50.3f, 33.100002f, 53.699997f);
generalPath.lineTo(34.9f, 48.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(23.924999237060547, 57.72800064086914), new Point2D.Double(23.924999237060547, 23.100000381469727), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(170, 148, 0, 255)) : new Color(170, 148, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 74, 0, 255)) : new Color(86, 74, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(23.881999969482422, 58.266998291015625), new Point2D.Double(23.881999969482422, 22.725000381469727), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(170, 148, 0, 255)) : new Color(170, 148, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 74, 0, 255)) : new Color(86, 74, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(34.9f, 48.6f);
generalPath.curveTo(31.400002f, 45.199997f, 28.300001f, 42.1f, 26.500002f, 35.199997f);
generalPath.lineTo(38.800003f, 35.199997f);
generalPath.lineTo(38.800003f, 30.0f);
generalPath.lineTo(26.6f, 30.0f);
generalPath.lineTo(26.6f, 23.1f);
generalPath.lineTo(21.3f, 23.1f);
generalPath.lineTo(21.3f, 30.1f);
generalPath.lineTo(9.0f, 30.1f);
generalPath.lineTo(9.0f, 35.3f);
generalPath.lineTo(21.6f, 35.3f);
generalPath.curveTo(21.6f, 35.3f, 21.5f, 36.3f, 21.300001f, 37.1f);
generalPath.curveTo(19.6f, 43.9f, 17.5f, 48.3f, 9.0f, 52.5f);
generalPath.lineTo(10.8f, 57.7f);
generalPath.curveTo(18.8f, 53.4f, 23.0f, 48.1f, 24.900002f, 42.1f);
generalPath.curveTo(26.7f, 46.6f, 29.7f, 50.3f, 33.100002f, 53.699997f);
generalPath.lineTo(34.9f, 48.6f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.2f, 31.7f);
generalPath.lineTo(44.2f, 31.7f);
generalPath.lineTo(31.8f, 66.4f);
generalPath.lineTo(37.1f, 66.4f);
generalPath.lineTo(40.6f, 56.0f);
generalPath.lineTo(54.699997f, 56.0f);
generalPath.lineTo(58.199997f, 66.4f);
generalPath.lineTo(63.499996f, 66.4f);
generalPath.lineTo(51.2f, 31.7f);
generalPath.closePath();
generalPath.moveTo(42.4f, 50.800003f);
generalPath.lineTo(47.7f, 37.0f);
generalPath.lineTo(53.0f, 50.9f);
generalPath.lineTo(42.4f, 50.800003f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.65299987792969, 66.36499786376953), new Point2D.Double(47.65299987792969, 31.736000061035156), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(170, 148, 0, 255)) : new Color(170, 148, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 74, 0, 255)) : new Color(86, 74, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(47.65299987792969, 66.73999786376953), new Point2D.Double(47.65299987792969, 31.361000061035156), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(170, 148, 0, 255)) : new Color(170, 148, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 74, 0, 255)) : new Color(86, 74, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.2f, 31.7f);
generalPath.lineTo(44.2f, 31.7f);
generalPath.lineTo(31.8f, 66.4f);
generalPath.lineTo(37.1f, 66.4f);
generalPath.lineTo(40.6f, 56.0f);
generalPath.lineTo(54.699997f, 56.0f);
generalPath.lineTo(58.199997f, 66.4f);
generalPath.lineTo(63.499996f, 66.4f);
generalPath.lineTo(51.2f, 31.7f);
generalPath.closePath();
generalPath.moveTo(42.4f, 50.800003f);
generalPath.lineTo(47.7f, 37.0f);
generalPath.lineTo(53.0f, 50.9f);
generalPath.lineTo(42.4f, 50.800003f);
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
        return 0.13099998235702515;
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
		return 0.7437919974327087;
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
	private ext_mo() {
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
       ext_mo base = new ext_mo();
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
       ext_mo base = new ext_mo();
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
        return ext_mo::new;
    }
}


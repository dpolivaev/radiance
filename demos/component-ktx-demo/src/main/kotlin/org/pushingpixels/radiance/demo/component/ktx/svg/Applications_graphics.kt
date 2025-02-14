package org.pushingpixels.radiance.demo.component.ktx.svg

import java.awt.*
import java.awt.geom.*
import java.awt.image.BufferedImage
import java.io.*
import java.lang.ref.WeakReference
import java.util.Base64
import java.util.Stack
import javax.imageio.ImageIO
import javax.swing.plaf.UIResource

import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
class Applications_graphics private constructor(private var width: Int, private var height: Int)
       : RadianceIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Shape? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: GeneralPath? = null
    @Suppress("UNUSED_VARIABLE") private var paint: Paint? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var colorFilter: RadianceIcon.ColorFilter? = null
    private val transformsStack = Stack<AffineTransform>()

    

	private fun _paint0(g : Graphics2D,origAlpha : Float) {
transformsStack.push(g.transform)
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.069200038909912f, 0.0f, 0.0f, 1.1230000257492065f, 5.769000053405762f, -7.116199970245361f))
// _0_0_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.189f, 42.343f)
generalPath!!.curveTo(41.212086f, 43.799988f, 38.471092f, 45.149097f, 34.003914f, 45.87948f)
generalPath!!.curveTo(29.536732f, 46.60986f, 24.026266f, 46.60986f, 19.559084f, 45.87948f)
generalPath!!.curveTo(15.091904f, 45.149097f, 12.35091f, 43.799988f, 12.373999f, 42.343f)
generalPath!!.curveTo(12.35091f, 40.88601f, 15.091904f, 39.5369f, 19.559084f, 38.80652f)
generalPath!!.curveTo(24.026266f, 38.076138f, 29.536732f, 38.076138f, 34.003914f, 38.80652f)
generalPath!!.curveTo(38.471092f, 39.5369f, 41.212086f, 40.88601f, 41.189f, 42.343f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(26.781999588012695, 42.34299850463867), 14.407f, Point2D.Double(26.781999588012695, 42.34299850463867), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.28220999240875244f, 2.936099951220735E-15f, 30.393999099731445f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.652f, 22.587f)
generalPath!!.lineTo(23.718f, 26.387f)
generalPath!!.curveTo(30.905f, 19.324999f, 41.501f, 2.4099998f, 41.501f, 2.4099998f)
generalPath!!.curveTo(41.93f, 1.1856998f, 40.413f, 0.41419983f, 39.654f, 1.2396998f)
generalPath!!.curveTo(39.654f, 1.2396998f, 25.964f, 15.3367f, 19.651999f, 22.5867f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(28.05900001525879, 18.868000030517578), Point2D.Double(33.4370002746582, 23.743000030517578), floatArrayOf(0.0f,0.24242f,0.62121f,1.0f), arrayOf((colorFilter?.filter(Color(110, 61, 9, 255)) ?: Color(110, 61, 9, 255)),(colorFilter?.filter(Color(234, 129, 19, 255)) ?: Color(234, 129, 19, 255)),(colorFilter?.filter(Color(92, 51, 7, 255)) ?: Color(92, 51, 7, 255)),(colorFilter?.filter(Color(224, 124, 18, 255)) ?: Color(224, 124, 18, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.9070000648498535f, -1.802899956703186f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(103, 57, 7, 255)) ?: Color(103, 57, 7, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.652f, 22.587f)
generalPath!!.lineTo(23.718f, 26.387f)
generalPath!!.curveTo(30.905f, 19.324999f, 41.501f, 2.4099998f, 41.501f, 2.4099998f)
generalPath!!.curveTo(41.93f, 1.1856998f, 40.413f, 0.41419983f, 39.654f, 1.2396998f)
generalPath!!.curveTo(39.654f, 1.2396998f, 25.964f, 15.3367f, 19.651999f, 22.5867f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.05f, 32.814f)
generalPath!!.lineTo(14.297f, 34.748f)
generalPath!!.lineTo(22.789f, 27.381f)
generalPath!!.lineTo(23.064f, 26.675001f)
generalPath!!.lineTo(24.158998f, 26.657001f)
generalPath!!.curveTo(23.720999f, 25.095001f, 21.217f, 22.274002f, 19.342f, 22.274002f)
generalPath!!.lineTo(19.424f, 23.364002f)
generalPath!!.lineTo(18.754f, 23.744001f)
generalPath!!.lineTo(12.049999f, 32.814003f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(19.395000457763672, 30.000999450683594), Point2D.Double(23.108999252319336, 33.43899917602539), floatArrayOf(0.0f,0.33333f,0.66667f,1.0f), arrayOf((colorFilter?.filter(Color(189, 189, 189, 255)) ?: Color(189, 189, 189, 255)),(colorFilter?.filter(Color(226, 226, 226, 255)) ?: Color(226, 226, 226, 255)),(colorFilter?.filter(Color(163, 163, 163, 255)) ?: Color(163, 163, 163, 255)),(colorFilter?.filter(Color(221, 221, 221, 255)) ?: Color(221, 221, 221, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.9070000648498535f, -1.802899956703186f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(136, 138, 133, 255)) ?: Color(136, 138, 133, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.05f, 32.814f)
generalPath!!.lineTo(14.297f, 34.748f)
generalPath!!.lineTo(22.789f, 27.381f)
generalPath!!.lineTo(23.064f, 26.675001f)
generalPath!!.lineTo(24.158998f, 26.657001f)
generalPath!!.curveTo(23.720999f, 25.095001f, 21.217f, 22.274002f, 19.342f, 22.274002f)
generalPath!!.lineTo(19.424f, 23.364002f)
generalPath!!.lineTo(18.754f, 23.744001f)
generalPath!!.lineTo(12.049999f, 32.814003f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.3f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.3384000062942505f, 0.0f, 0.0f, 1.0f, -20.926000595092773f, -3.4089999198913574f))
// _0_0_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.189f, 42.343f)
generalPath!!.curveTo(41.212086f, 43.799988f, 38.471092f, 45.149097f, 34.003914f, 45.87948f)
generalPath!!.curveTo(29.536732f, 46.60986f, 24.026266f, 46.60986f, 19.559084f, 45.87948f)
generalPath!!.curveTo(15.091904f, 45.149097f, 12.35091f, 43.799988f, 12.373999f, 42.343f)
generalPath!!.curveTo(12.35091f, 40.88601f, 15.091904f, 39.5369f, 19.559084f, 38.80652f)
generalPath!!.curveTo(24.026266f, 38.076138f, 29.536732f, 38.076138f, 34.003914f, 38.80652f)
generalPath!!.curveTo(38.471092f, 39.5369f, 41.212086f, 40.88601f, 41.189f, 42.343f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(26.781999588012695, 42.34299850463867), 14.407f, Point2D.Double(26.781999588012695, 42.34299850463867), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.28220999240875244f, 1.679200042767814E-15f, 30.393999099731445f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(1.7577f, 40.724f)
generalPath!!.curveTo(8.363f, 40.724f, 13.3757f, 41.510998f, 14.3247f, 36.704998f)
generalPath!!.curveTo(15.089701f, 32.831997f, 9.7643f, 30.975998f, 7.1255f, 34.434f)
generalPath!!.curveTo(4.5835f, 37.764f, 1.7574f, 40.724f, 1.7574f, 40.724f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(15.414999961853027, 35.356998443603516), 7.5792f, Point2D.Double(15.414999961853027, 35.356998443603516), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(105, 105, 105, 255)) ?: Color(105, 105, 105, 255)),(colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9946600198745728f, 3.262900085348021E-16f, 6.564499920209965E-13f, 0.9693199992179871f, -4.583000183105469f, 0.16592000424861908f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.52778f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.8522999882698059f, 0.0f, 0.0f, 0.8522999882698059f, 3.733599901199341f, 2.5755999088287354f))
// _0_0_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.875f, 37.75f)
generalPath!!.curveTo(8.877003f, 38.197914f, 8.639194f, 38.612663f, 8.251619f, 38.8372f)
generalPath!!.curveTo(7.864045f, 39.061737f, 7.385955f, 39.061737f, 6.9983807f, 38.8372f)
generalPath!!.curveTo(6.6108065f, 38.612663f, 6.372997f, 38.197914f, 6.375f, 37.75f)
generalPath!!.curveTo(6.372997f, 37.302086f, 6.6108065f, 36.887337f, 6.9983807f, 36.6628f)
generalPath!!.curveTo(7.385955f, 36.438263f, 7.864045f, 36.438263f, 8.251619f, 36.6628f)
generalPath!!.curveTo(8.639194f, 36.887337f, 8.877003f, 37.302086f, 8.875f, 37.75f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.7878699898719788f, 0.0f, 0.0f, 0.7878699898719788f, 14.265000343322754f, -4.723400115966797f))
// _0_0_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.875f, 37.75f)
generalPath!!.curveTo(8.877003f, 38.197914f, 8.639194f, 38.612663f, 8.251619f, 38.8372f)
generalPath!!.curveTo(7.864045f, 39.061737f, 7.385955f, 39.061737f, 6.9983807f, 38.8372f)
generalPath!!.curveTo(6.6108065f, 38.612663f, 6.372997f, 38.197914f, 6.375f, 37.75f)
generalPath!!.curveTo(6.372997f, 37.302086f, 6.6108065f, 36.887337f, 6.9983807f, 36.6628f)
generalPath!!.curveTo(7.385955f, 36.438263f, 7.864045f, 36.438263f, 8.251619f, 36.6628f)
generalPath!!.curveTo(8.639194f, 36.887337f, 8.877003f, 37.302086f, 8.875f, 37.75f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.941f, 26.398f)
generalPath!!.lineTo(13.6380005f, 32.541f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.42778f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.0709f, 40.069f)
generalPath!!.curveTo(3.0709f, 40.069f, 6.4119997f, 38.427002f, 7.8357f, 35.982002f)
generalPath!!.curveTo(8.3394f, 35.117f, 9.4801f, 35.855003f, 8.7774f, 36.717003f)
generalPath!!.curveTo(7.2596f, 38.577003f, 3.0709f, 40.069004f, 3.0709f, 40.069004f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(13.236000061035156, 37.75199890136719), Point2D.Double(7.752099990844727, 42.28200149536133), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8522999882698059f, 0.0f, 0.0f, 0.8522999882698059f, -1.6750999689102173f, 3.753999948501587f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.53333f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.237869992852211f, 0.0f, 0.0f, 0.237869992852211f, 38.433998107910156f, -7.10099983215332f))
// _0_0_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.875f, 37.75f)
generalPath!!.curveTo(8.877003f, 38.197914f, 8.639194f, 38.612663f, 8.251619f, 38.8372f)
generalPath!!.curveTo(7.864045f, 39.061737f, 7.385955f, 39.061737f, 6.9983807f, 38.8372f)
generalPath!!.curveTo(6.6108065f, 38.612663f, 6.372997f, 38.197914f, 6.375f, 37.75f)
generalPath!!.curveTo(6.372997f, 37.302086f, 6.6108065f, 36.887337f, 6.9983807f, 36.6628f)
generalPath!!.curveTo(7.385955f, 36.438263f, 7.864045f, 36.438263f, 8.251619f, 36.6628f)
generalPath!!.curveTo(8.639194f, 36.887337f, 8.877003f, 37.302086f, 8.875f, 37.75f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.127f, 7.3501f)
generalPath!!.curveTo(32.069f, 7.4374f, 29.642998f, 8.4062f, 29.642998f, 9.5744f)
generalPath!!.lineTo(29.642998f, 13.145f)
generalPath!!.curveTo(29.642998f, 14.370001f, 32.312996f, 15.369f, 35.584f, 15.369f)
generalPath!!.curveTo(38.854f, 15.369f, 41.5f, 14.370001f, 41.5f, 13.145f)
generalPath!!.lineTo(41.5f, 9.5744f)
generalPath!!.curveTo(41.5f, 8.3487f, 38.854f, 7.3501f, 35.584f, 7.3501f)
generalPath!!.curveTo(35.431f, 7.3501f, 35.277f, 7.3458f, 35.127f, 7.3501f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(52.71799850463867, 2.316200017929077), Point2D.Double(67.46600341796875, 2.316200017929077), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)),(colorFilter?.filter(Color(60, 116, 177, 255)) ?: Color(60, 116, 177, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8624799847602844f, 0.0f, 0.0f, 0.5807200074195862f, -16.256999969482422f, 11.012999534606934f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(32, 74, 135, 255)) ?: Color(32, 74, 135, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.127f, 7.3501f)
generalPath!!.curveTo(32.069f, 7.4374f, 29.642998f, 8.4062f, 29.642998f, 9.5744f)
generalPath!!.lineTo(29.642998f, 13.145f)
generalPath!!.curveTo(29.642998f, 14.370001f, 32.312996f, 15.369f, 35.584f, 15.369f)
generalPath!!.curveTo(38.854f, 15.369f, 41.5f, 14.370001f, 41.5f, 13.145f)
generalPath!!.lineTo(41.5f, 9.5744f)
generalPath!!.curveTo(41.5f, 8.3487f, 38.854f, 7.3501f, 35.584f, 7.3501f)
generalPath!!.curveTo(35.431f, 7.3501f, 35.277f, 7.3458f, 35.127f, 7.3501f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.8862800002098083f, 0.0f, 0.0f, 0.46891000866889954f, -10.444000244140625f, -9.718899726867676f))
// _0_0_10_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(57.375f, 49.75f)
generalPath!!.curveTo(57.383614f, 50.287495f, 56.36103f, 50.785194f, 54.69446f, 51.05464f)
generalPath!!.curveTo(53.027893f, 51.324085f, 50.972107f, 51.324085f, 49.30554f, 51.05464f)
generalPath!!.curveTo(47.63897f, 50.785194f, 46.616386f, 50.287495f, 46.625f, 49.75f)
generalPath!!.curveTo(46.616386f, 49.212505f, 47.63897f, 48.714806f, 49.30554f, 48.44536f)
generalPath!!.curveTo(50.972107f, 48.175915f, 53.027893f, 48.175915f, 54.69446f, 48.44536f)
generalPath!!.curveTo(56.36103f, 48.714806f, 57.383614f, 49.212505f, 57.375f, 49.75f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(27.926f, 39.155f)
generalPath!!.lineTo(28.973001f, 17.805998f)
generalPath!!.lineTo(31.460001f, 14.142998f)
generalPath!!.curveTo(33.431f, 13.506998f, 38.187f, 13.506998f, 39.967003f, 14.142998f)
generalPath!!.lineTo(42.454002f, 17.173998f)
generalPath!!.lineTo(45.071003f, 39.660995f)
generalPath!!.lineTo(27.926003f, 39.154995f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(53.16899871826172, 24.2450008392334), Point2D.Double(69.69100189208984, 24.2450008392334), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(242, 242, 242, 255)) ?: Color(242, 242, 242, 255)),(colorFilter?.filter(Color(195, 195, 195, 255)) ?: Color(195, 195, 195, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.7194399833679199f, 0.0f, 0.0f, 0.7189099788665771f, -7.696300029754639f, 9.471699714660645f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(90, 90, 90, 255)) ?: Color(90, 90, 90, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(27.926f, 39.155f)
generalPath!!.lineTo(28.973001f, 17.805998f)
generalPath!!.lineTo(31.460001f, 14.142998f)
generalPath!!.curveTo(33.431f, 13.506998f, 38.187f, 13.506998f, 39.967003f, 14.142998f)
generalPath!!.lineTo(42.454002f, 17.173998f)
generalPath!!.lineTo(45.071003f, 39.660995f)
generalPath!!.lineTo(27.926003f, 39.154995f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(28.828f, 38.896f)
generalPath!!.curveTo(28.828f, 38.896f, 31.418999f, 29.365f, 36.369f, 29.365f)
generalPath!!.curveTo(41.475f, 29.365f, 44.537f, 39.277f, 44.537f, 39.277f)
generalPath!!.lineTo(28.828f, 38.896f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(61.87200164794922, 29.614999771118164), Point2D.Double(61.87200164794922, 41.45899963378906), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(174, 174, 174, 255)) ?: Color(174, 174, 174, 255)),(colorFilter?.filter(Color(196, 196, 196, 0)) ?: Color(196, 196, 196, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.8886200189590454f, 0.0f, 0.0f, 0.7189099788665771f, -18.29800033569336f, 9.471699714660645f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_4
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.18f, 20.499f)
generalPath!!.lineTo(28.884f, 26.973f)
generalPath!!.curveTo(30.547f, 25.895f, 40.877f, 25.709f, 43.228f, 27.361f)
generalPath!!.lineTo(42.526f, 20.764f)
generalPath!!.curveTo(41.128002f, 19.811f, 31.943f, 19.286f, 29.18f, 20.499f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(49.85300064086914, 64.26000213623047), Point2D.Double(62.768001556396484, 64.26000213623047), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)),(colorFilter?.filter(Color(43, 85, 130, 255)) ?: Color(43, 85, 130, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.7189099788665771f, 0.0f, 0.0f, 0.7189099788665771f, -1.8970999717712402f, -22.424999237060547f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.59444f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_5
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.049f, 38.222f)
generalPath!!.lineTo(29.926f, 18.028f)
generalPath!!.lineTo(31.766f, 14.995f)
generalPath!!.curveTo(33.585f, 14.403f, 37.971f, 14.403f, 39.614002f, 14.995f)
generalPath!!.lineTo(41.575f, 17.528f)
generalPath!!.lineTo(44.027f, 38.776f)
generalPath!!.lineTo(29.049f, 38.222f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_6
shape = RoundRectangle2D.Double(26.51300048828125, 37.5359992980957, 19.974000930786133, 3.927799940109253, 1.7677600383758545, 1.7677600383758545)
paint = LinearGradientPaint(Point2D.Double(60.16899871826172, 40.119998931884766), Point2D.Double(60.441001892089844, 43.869998931884766), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(242, 242, 242, 255)) ?: Color(242, 242, 242, 255)),(colorFilter?.filter(Color(195, 195, 195, 255)) ?: Color(195, 195, 195, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.737309992313385f, 0.0f, 0.0f, 0.7708500027656555f, -8.531999588012695f, 7.121600151062012f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(90, 90, 90, 255)) ?: Color(90, 90, 90, 255)
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
shape = RoundRectangle2D.Double(26.51300048828125, 37.5359992980957, 19.974000930786133, 3.927799940109253, 1.7677600383758545, 1.7677600383758545)
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.395f, 17.996f)
generalPath!!.curveTo(31.27f, 16.630001f, 38.493f, 16.341f, 42.115f, 17.39f)
generalPath!!.lineTo(39.778f, 14.504f)
generalPath!!.curveTo(37.3f, 13.837f, 33.853f, 14.127999f, 31.501999f, 14.573f)
generalPath!!.lineTo(29.394999f, 17.996f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.86111f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_8
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.173f, 17.416f)
generalPath!!.lineTo(31.173f, 32.873f)
generalPath!!.lineTo(34.408f, 29.278002f)
generalPath!!.lineTo(34.049f, 16.697002f)
generalPath!!.lineTo(31.173f, 17.416002f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(48.25, 54.75), Point2D.Double(48.25, 71.25), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.7189099788665771f, 0.0f, 0.0f, 0.7189099788665771f, -1.8970999717712402f, -20.68600082397461f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.57778f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_9
g.composite = AlphaComposite.getInstance(3, 0.41111f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_9_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.009f, 9.381f)
generalPath!!.lineTo(31.009f, 12.620999f)
generalPath!!.curveTo(31.009f, 12.620999f, 31.621f, 12.273f, 32.0f, 12.259999f)
generalPath!!.lineTo(32.0f, 8.999999f)
generalPath!!.curveTo(31.518f, 9.069499f, 31.009f, 9.380999f, 31.009f, 9.380999f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(230, 231, 230, 255)) ?: Color(230, 231, 230, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_9_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(33.009f, 8.76f)
generalPath!!.lineTo(33.009f, 12.0f)
generalPath!!.curveTo(33.009f, 12.0f, 33.621f, 11.917f, 34.0f, 11.904f)
generalPath!!.lineTo(34.0f, 8.588901f)
generalPath!!.curveTo(33.488f, 8.6147f, 33.009f, 8.76f, 33.009f, 8.76f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(230, 231, 230, 255)) ?: Color(230, 231, 230, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.44444f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10_9_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.009f, 8.5611f)
generalPath!!.lineTo(35.009f, 11.856f)
generalPath!!.curveTo(35.009f, 11.856f, 35.565f, 11.851f, 36.0f, 11.871f)
generalPath!!.lineTo(36.0f, 8.5337f)
generalPath!!.curveTo(35.499f, 8.4821f, 35.009f, 8.5611f, 35.009f, 8.5611f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(230, 231, 230, 255)) ?: Color(230, 231, 230, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()

}



	private fun innerPaint(g : Graphics2D) {
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    _paint0(g, origAlpha)


	    shape = null
	    generalPath = null
	    paint = null
	    stroke = null
	    clip = null
	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.29957765340805054
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 48.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.92709732055664
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Applications_graphics(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Applications_graphics(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Applications_graphics(getOrigWidth().toInt(), getOrigHeight().toInt()) }
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override @Synchronized fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun supportsColorFilter(): Boolean {
        return true
    }

    override fun setColorFilter(colorFilter: RadianceIcon.ColorFilter?) {
        this.colorFilter = colorFilter
    }

    override @Synchronized fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()
    }
}


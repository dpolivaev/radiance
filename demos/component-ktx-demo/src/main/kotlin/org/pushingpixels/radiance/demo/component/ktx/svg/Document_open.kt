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
class Document_open private constructor(private var width: Int, private var height: Int)
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
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.6200285f, 38.651016f)
generalPath!!.curveTo(4.6618366f, 39.07147f, 5.117414f, 39.491924f, 5.5311837f, 39.491924f)
generalPath!!.lineTo(36.667347f, 39.491924f)
generalPath!!.curveTo(37.081116f, 39.491924f, 37.45308f, 39.07147f, 37.41127f, 38.651016f)
generalPath!!.lineTo(34.714653f, 11.531728f)
generalPath!!.curveTo(34.672844f, 11.111274f, 34.217266f, 10.69082f, 33.803497f, 10.69082f)
generalPath!!.lineTo(21.080082f, 10.69082f)
generalPath!!.curveTo(20.489536f, 10.69082f, 19.870998f, 10.311268f, 19.677221f, 9.730485f)
generalPath!!.lineTo(18.574219f, 6.4246087f)
generalPath!!.curveTo(18.404966f, 5.9173307f, 18.02707f, 5.6888137f, 17.259747f, 5.6888137f)
generalPath!!.lineTo(2.3224187f, 5.6888137f)
generalPath!!.curveTo(1.9086492f, 5.6888137f, 1.5366876f, 6.109268f, 1.5784956f, 6.529722f)
generalPath!!.lineTo(4.6200285f, 38.651016f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(26.10677719116211, 38.19511413574219), 32.25977f, Point2D.Double(26.10677719116211, 38.19511413574219), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(160, 160, 160, 255)) ?: Color(160, 160, 160, 255)),(colorFilter?.filter(Color(168, 168, 168, 255)) ?: Color(168, 168, 168, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0156350135803223f, 0.0f, 0.10310500115156174f, 1.0005120038986206f, 0.0f, -0.08369457721710205f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(90, 90, 90, 255)) ?: Color(90, 90, 90, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.6200285f, 38.651016f)
generalPath!!.curveTo(4.6618366f, 39.07147f, 5.117414f, 39.491924f, 5.5311837f, 39.491924f)
generalPath!!.lineTo(36.667347f, 39.491924f)
generalPath!!.curveTo(37.081116f, 39.491924f, 37.45308f, 39.07147f, 37.41127f, 38.651016f)
generalPath!!.lineTo(34.714653f, 11.531728f)
generalPath!!.curveTo(34.672844f, 11.111274f, 34.217266f, 10.69082f, 33.803497f, 10.69082f)
generalPath!!.lineTo(21.080082f, 10.69082f)
generalPath!!.curveTo(20.489536f, 10.69082f, 19.870998f, 10.311268f, 19.677221f, 9.730485f)
generalPath!!.lineTo(18.574219f, 6.4246087f)
generalPath!!.curveTo(18.404966f, 5.9173307f, 18.02707f, 5.6888137f, 17.259747f, 5.6888137f)
generalPath!!.lineTo(2.3224187f, 5.6888137f)
generalPath!!.curveTo(1.9086492f, 5.6888137f, 1.5366876f, 6.109268f, 1.5784956f, 6.529722f)
generalPath!!.lineTo(4.6200285f, 38.651016f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.3386018f, 17.533487f)
generalPath!!.lineTo(34.48846f, 17.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.3386018f, 17.533487f)
generalPath!!.lineTo(34.48846f, 17.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3301525f, 37.533485f)
generalPath!!.lineTo(35.317905f, 37.533485f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3301525f, 37.533485f)
generalPath!!.lineTo(35.317905f, 37.533485f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3301525f, 35.533485f)
generalPath!!.lineTo(35.317905f, 35.533485f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.3301525f, 35.533485f)
generalPath!!.lineTo(35.317905f, 35.533485f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(0.02165151946246624f, 0.0f, 0.0f, 0.019038410857319832f, 42.41537857055664f, 36.933719635009766f))
// _0_1_4
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4_0
shape = Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375)
paint = LinearGradientPaint(Point2D.Double(302.8571472167969, 366.64788818359375), Point2D.Double(302.8571472167969, 609.5050659179688), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)),(colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4_1
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-219.61876f, -150.68037f)
generalPath!!.curveTo(-219.61876f, -150.68037f, -219.61876f, 327.65042f, -219.61876f, 327.65042f)
generalPath!!.curveTo(-76.74459f, 328.55087f, 125.78146f, 220.48074f, 125.78138f, 88.45424f)
generalPath!!.curveTo(125.78138f, -43.572304f, -33.655437f, -150.68036f, -219.61876f, -150.68037f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.40206185f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4_2
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-1559.2523f, -150.68037f)
generalPath!!.curveTo(-1559.2523f, -150.68037f, -1559.2523f, 327.65042f, -1559.2523f, 327.65042f)
generalPath!!.curveTo(-1702.1265f, 328.55087f, -1904.6525f, 220.48074f, -1904.6525f, 88.45424f)
generalPath!!.curveTo(-1904.6525f, -43.572304f, -1745.2157f, -150.68036f, -1559.2523f, -150.68037f)
generalPath!!.closePath()
shape = generalPath
paint = RadialGradientPaint(Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, Point2D.Double(605.7142944335938, 486.64788818359375), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_5
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.171752f, 38.418674f)
generalPath!!.curveTo(6.203108f, 38.729f, 6.017127f, 38.935886f, 5.6963477f, 38.832443f)
generalPath!!.lineTo(5.6963477f, 38.832443f)
generalPath!!.curveTo(5.3755684f, 38.729f, 5.14778f, 38.522118f, 5.1164236f, 38.21179f)
generalPath!!.lineTo(2.0868573f, 6.8445945f)
generalPath!!.curveTo(2.0555012f, 6.534267f, 2.243451f, 6.346871f, 2.5537784f, 6.346871f)
generalPath!!.lineTo(17.303532f, 6.255425f)
generalPath!!.curveTo(17.834814f, 6.2521315f, 18.04296f, 6.308731f, 18.18333f, 6.7726374f)
generalPath!!.curveTo(18.18333f, 6.7726374f, 19.268703f, 9.885435f, 19.429564f, 10.470742f)
generalPath!!.lineTo(17.873968f, 7.553706f)
generalPath!!.curveTo(17.608788f, 7.0564437f, 17.275225f, 7.1399364f, 16.901178f, 7.1399364f)
generalPath!!.lineTo(3.7717774f, 7.1399364f)
generalPath!!.curveTo(3.4614503f, 7.1399364f, 3.2754695f, 7.3468213f, 3.3068254f, 7.657149f)
generalPath!!.lineTo(6.285646f, 38.522118f)
generalPath!!.lineTo(6.171752f, 38.418674f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(5.265791416168213, 18.725862503051758), Point2D.Double(8.212224006652832, 52.625850677490234), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 179)) ?: Color(255, 255, 255, 179)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4626959562301636f, 0.0f, 0.06907907873392105f, 0.6836689710617065f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_6
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.3052332f, 7.533487f)
generalPath!!.lineTo(17.088966f, 7.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(0.9999998f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.3052332f, 7.533487f)
generalPath!!.lineTo(17.088966f, 7.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_7
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.7573333f, 11.533487f)
generalPath!!.lineTo(33.496216f, 11.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.7573333f, 11.533487f)
generalPath!!.lineTo(33.496216f, 11.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0344239473342896f, 0.0f, 0.10452000051736832f, 1.0344239473342896f, -10.032480239868164f, 2.631913900375366f))
// _0_1_8
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_8_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.785744f, 9.0363865f)
generalPath!!.curveTo(41.79537f, 8.561804f, 41.800934f, 8.311881f, 41.36235f, 8.312183f)
generalPath!!.lineTo(28.80653f, 8.32084f)
generalPath!!.curveTo(28.50653f, 8.32084f, 28.481916f, 8.177634f, 28.80653f, 8.32084f)
generalPath!!.curveTo(29.131144f, 8.4640465f, 30.053629f, 8.979112f, 30.989227f, 9.021835f)
generalPath!!.curveTo(30.989227f, 9.021835f, 41.785706f, 9.038299f, 41.785744f, 9.0363865f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 148)) ?: Color(255, 255, 255, 148)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_9
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.1628954f, 15.533487f)
generalPath!!.lineTo(33.99345f, 15.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(0.99999994f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.1628954f, 15.533487f)
generalPath!!.lineTo(33.99345f, 15.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_10
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.1594715f, 33.533485f)
generalPath!!.lineTo(35.147224f, 33.533485f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.1594715f, 33.533485f)
generalPath!!.lineTo(35.147224f, 33.533485f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_11
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.8658085f, 31.533487f)
generalPath!!.lineTo(34.974533f, 31.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.8658085f, 31.533487f)
generalPath!!.lineTo(34.974533f, 31.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_12
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.6336365f, 29.533487f)
generalPath!!.lineTo(34.80285f, 29.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.6336365f, 29.533487f)
generalPath!!.lineTo(34.80285f, 29.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_13
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.4629555f, 27.533487f)
generalPath!!.lineTo(34.632168f, 27.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.4629555f, 27.533487f)
generalPath!!.lineTo(34.632168f, 27.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_14
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.255672f, 25.533487f)
generalPath!!.lineTo(34.460793f, 25.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.255672f, 25.533487f)
generalPath!!.lineTo(34.460793f, 25.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_15
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.02352f, 23.533487f)
generalPath!!.lineTo(34.2891f, 23.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.02352f, 23.533487f)
generalPath!!.lineTo(34.2891f, 23.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_16
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.852839f, 21.533487f)
generalPath!!.lineTo(34.11842f, 21.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.852839f, 21.533487f)
generalPath!!.lineTo(34.11842f, 21.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0344239473342896f, 0.0f, 0.10452000051736832f, 1.0344239473342896f, -10.032480239868164f, 2.631913900375366f))
// _0_1_17
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_17_0
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(41.785744f, 9.0363865f)
generalPath!!.curveTo(41.79537f, 8.561804f, 41.800934f, 8.311881f, 41.36235f, 8.312183f)
generalPath!!.lineTo(28.80653f, 8.32084f)
generalPath!!.curveTo(28.50653f, 8.32084f, 28.481916f, 8.177634f, 28.80653f, 8.32084f)
generalPath!!.curveTo(29.131144f, 8.4640465f, 30.053629f, 8.979112f, 30.989227f, 9.021835f)
generalPath!!.curveTo(30.989227f, 9.021835f, 41.785706f, 9.038299f, 41.785744f, 9.0363865f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 148)) ?: Color(255, 255, 255, 148)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_18
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.9642313f, 13.533487f)
generalPath!!.lineTo(33.990734f, 13.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000004f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.9642313f, 13.533487f)
generalPath!!.lineTo(33.990734f, 13.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_19
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.651419f, 19.533487f)
generalPath!!.lineTo(33.947216f, 19.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000001f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.651419f, 19.533487f)
generalPath!!.lineTo(33.947216f, 19.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.11363633f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_20
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.5242572f, 9.533487f)
generalPath!!.lineTo(17.805073f, 9.533487f)
shape = generalPath
paint = colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255)
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)
stroke = BasicStroke(1.0000002f,1,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(2.5242572f, 9.533487f)
generalPath!!.lineTo(17.805073f, 9.533487f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.39204544f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_21
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(34.375f, 14.125f)
generalPath!!.lineTo(37.0f, 38.75f)
generalPath!!.lineTo(6.0f, 38.875f)
generalPath!!.curveTo(6.0f, 38.875f, 4.125f, 14.125f, 4.125f, 14.125f)
generalPath!!.curveTo(4.125f, 14.125f, 34.5f, 14.125f, 34.375f, 14.125f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(22.25, 37.625), Point2D.Double(19.75, 14.875), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)),(colorFilter?.filter(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_22
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.375f, 2.4944034f)
generalPath!!.curveTo(43.875f, 19.373135f, 34.29994f, 21.022879f, 37.36244f, 31.494661f)
generalPath!!.curveTo(37.36244f, 31.494661f, 5.875f, 32.380596f, 5.875f, 32.380596f)
generalPath!!.curveTo(4.0f, 19.527987f, 14.25f, 11.166045f, 11.25f, 2.649254f)
generalPath!!.lineTo(43.375f, 2.4944034f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(25.875, 10.625), Point2D.Double(25.25, 30.875), floatArrayOf(0.0f,0.5f,1.0f), arrayOf((colorFilter?.filter(Color(250, 250, 250, 255)) ?: Color(250, 250, 250, 255)),(colorFilter?.filter(Color(168, 168, 168, 255)) ?: Color(168, 168, 168, 255)),(colorFilter?.filter(Color(205, 205, 205, 255)) ?: Color(205, 205, 205, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.2388060092926025f, 0.0f, -7.880597114562988f))
g.paint = paint
g.fill(shape)
paint = RadialGradientPaint(Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, Point2D.Double(8.824419021606445, 3.7561285495758057), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(163, 163, 163, 255)) ?: Color(163, 163, 163, 255)),(colorFilter?.filter(Color(76, 76, 76, 255)) ?: Color(76, 76, 76, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.046686053276062f, 44.36452865600586f, -17.007169723510742f))
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.375f, 2.4944034f)
generalPath!!.curveTo(43.875f, 19.373135f, 34.29994f, 21.022879f, 37.36244f, 31.494661f)
generalPath!!.curveTo(37.36244f, 31.494661f, 5.875f, 32.380596f, 5.875f, 32.380596f)
generalPath!!.curveTo(4.0f, 19.527987f, 14.25f, 11.166045f, 11.25f, 2.649254f)
generalPath!!.lineTo(43.375f, 2.4944034f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_23
paint = colorFilter?.filter(Color(161, 161, 161, 255)) ?: Color(161, 161, 161, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.4375f, 6.5625f)
generalPath!!.lineTo(39.0f, 6.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_24
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.7785654f, 39.065998f)
generalPath!!.curveTo(5.8820076f, 39.277466f, 6.0888915f, 39.488926f, 6.399217f, 39.488926f)
generalPath!!.lineTo(39.70767f, 39.488926f)
generalPath!!.curveTo(39.914562f, 39.488926f, 40.228832f, 39.36262f, 40.415844f, 39.224575f)
generalPath!!.curveTo(40.946247f, 38.83304f, 41.070705f, 38.61219f, 41.308624f, 38.251106f)
generalPath!!.curveTo(43.756752f, 34.53565f, 47.113766f, 18.974215f, 47.113766f, 18.974215f)
generalPath!!.curveTo(47.21721f, 18.762754f, 47.010326f, 18.551294f, 46.7f, 18.551294f)
generalPath!!.lineTo(11.776358f, 18.551294f)
generalPath!!.curveTo(11.466032f, 18.551294f, 10.120393f, 34.658623f, 6.913359f, 37.838318f)
generalPath!!.lineTo(5.6751237f, 39.065998f)
generalPath!!.lineTo(5.7785654f, 39.065998f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(22.175975799560547, 36.987998962402344), Point2D.Double(22.065330505371094, 32.050498962402344), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(97, 148, 203, 255)) ?: Color(97, 148, 203, 255)),(colorFilter?.filter(Color(114, 159, 207, 255)) ?: Color(114, 159, 207, 255))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0221179723739624f, 52.05693817138672f, -1.3230259418487549f))
g.paint = paint
g.fill(shape)
paint = colorFilter?.filter(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)
stroke = BasicStroke(0.9999998f,0,1,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.7785654f, 39.065998f)
generalPath!!.curveTo(5.8820076f, 39.277466f, 6.0888915f, 39.488926f, 6.399217f, 39.488926f)
generalPath!!.lineTo(39.70767f, 39.488926f)
generalPath!!.curveTo(39.914562f, 39.488926f, 40.228832f, 39.36262f, 40.415844f, 39.224575f)
generalPath!!.curveTo(40.946247f, 38.83304f, 41.070705f, 38.61219f, 41.308624f, 38.251106f)
generalPath!!.curveTo(43.756752f, 34.53565f, 47.113766f, 18.974215f, 47.113766f, 18.974215f)
generalPath!!.curveTo(47.21721f, 18.762754f, 47.010326f, 18.551294f, 46.7f, 18.551294f)
generalPath!!.lineTo(11.776358f, 18.551294f)
generalPath!!.curveTo(11.466032f, 18.551294f, 10.120393f, 34.658623f, 6.913359f, 37.838318f)
generalPath!!.lineTo(5.6751237f, 39.065998f)
generalPath!!.lineTo(5.7785654f, 39.065998f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_25
paint = colorFilter?.filter(Color(161, 161, 161, 255)) ?: Color(161, 161, 161, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.356073f, 8.5625f)
generalPath!!.lineTo(35.08142f, 8.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_26
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.134476f, 20.138641f)
generalPath!!.curveTo(12.361729f, 25.129398f, 11.633175f, 29.147884f, 10.418486f, 33.652504f)
generalPath!!.curveTo(12.804971f, 32.945396f, 17.534601f, 30.448f, 27.534601f, 30.448f)
generalPath!!.curveTo(37.534603f, 30.448f, 44.258175f, 21.1993f, 45.186253f, 20.094446f)
generalPath!!.lineTo(13.134476f, 20.138641f)
generalPath!!.closePath()
shape = generalPath
paint = LinearGradientPaint(Point2D.Double(14.899378776550293, 27.059642791748047), Point2D.Double(22.71544647216797, 41.83689498901367), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 34)) ?: Color(255, 255, 255, 34)),(colorFilter?.filter(Color(255, 255, 255, 13)) ?: Color(255, 255, 255, 13))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.5352989435195923f, 0.0f, 0.0f, 0.6513389945030212f, 3.451417922973633f, 2.447999954223633f))
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_27
paint = colorFilter?.filter(Color(161, 161, 161, 255)) ?: Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.143007f, 10.5625f)
generalPath!!.lineTo(39.457832f, 10.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 0.52272725f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_28
paint = LinearGradientPaint(Point2D.Double(19.11611557006836, 28.946041107177734), Point2D.Double(19.426923751831055, 51.91269302368164), floatArrayOf(0.0f,1.0f), arrayOf((colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)),(colorFilter?.filter(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0))), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.4215370416641235f, 0.0f, 0.0f, 0.7034639716148376f, 0.0f, 0.0f))
stroke = BasicStroke(1.0f,1,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.820084f, 19.6875f)
generalPath!!.lineTo(12.661612f, 19.6875f)
generalPath!!.curveTo(12.661612f, 19.6875f, 10.513864f, 35.707108f, 7.93934f, 37.928078f)
generalPath!!.curveTo(16.060417f, 37.928078f, 39.51051f, 37.87944f, 39.53033f, 37.87944f)
generalPath!!.curveTo(41.28199f, 37.87944f, 44.43797f, 25.243248f, 45.820084f, 19.6875f)
generalPath!!.closePath()
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_29
paint = colorFilter?.filter(Color(161, 161, 161, 255)) ?: Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.398767f, 12.5625f)
generalPath!!.lineTo(38.25216f, 12.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_30
paint = colorFilter?.filter(Color(161, 161, 161, 255)) ?: Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000005f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.629028f, 14.5625f)
generalPath!!.lineTo(36.97533f, 14.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_31
paint = colorFilter?.filter(Color(161, 161, 161, 255)) ?: Color(161, 161, 161, 255)
stroke = BasicStroke(1.0000002f,0,0,4.0f,null,0.0f)
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.520679f, 16.5625f)
generalPath!!.lineTo(31.16684f, 16.5625f)
shape = generalPath
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_32
if (generalPath == null) {
   generalPath = GeneralPath()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.375f, 31.75f)
generalPath!!.curveTo(5.1336346f, 19.511961f, 13.5625f, 12.6875f, 12.0f, 3.0f)
generalPath!!.lineTo(42.875f, 3.0f)
generalPath!!.lineTo(12.875f, 3.625f)
generalPath!!.curveTo(14.125f, 13.1875f, 6.6786165f, 18.271446f, 6.375f, 31.75f)
generalPath!!.closePath()
shape = generalPath
paint = colorFilter?.filter(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)
g.paint = paint
g.fill(shape)
g.transform = transformsStack.pop()
g.transform = transformsStack.pop()
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
transformsStack.push(g.transform)
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_2
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
            return 1.0752774477005005
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.9920581579208374
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 46.72058868408203
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 41.196746826171875
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): RadianceIcon {
            return Document_open(width, height)
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): RadianceIconUIResource {
            return RadianceIconUIResource(Document_open(width, height))
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): Factory {
            return Factory { Document_open(getOrigWidth().toInt(), getOrigHeight().toInt()) }
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


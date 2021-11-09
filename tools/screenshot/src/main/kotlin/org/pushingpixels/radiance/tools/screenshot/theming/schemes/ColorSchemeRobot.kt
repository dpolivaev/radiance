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
package org.pushingpixels.radiance.tools.screenshot.theming.schemes

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.swing.Swing
import kotlinx.coroutines.withContext
import org.pushingpixels.radiance.demo.theming.main.check.SampleFrame
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.theming.api.ComponentState
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme
import org.pushingpixels.radiance.tools.common.RadianceLogo
import org.pushingpixels.radiance.tools.screenshot.ScreenshotRobot
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO
import javax.swing.JFrame

abstract class BaseColorSchemeRobot(
    private var skin: RadianceSkin,
    private val screenshotFilename: String
) : ScreenshotRobot {

    private suspend fun runInner(screenshotDirectory: String) {
        val start = System.currentTimeMillis()

        // set skin
        withContext(Dispatchers.Swing) {
            RadianceThemingCortex.GlobalScope.setSkin(skin)
            JFrame.setDefaultLookAndFeelDecorated(true)
        }

        // create the frame and set the icon image
        val frame: JFrame
        withContext(Dispatchers.Swing) {
            frame = SampleFrame()
            frame.iconImage = RadianceLogo.getLogoImage(frame,
                RadianceThemingCortex.ComponentScope.getCurrentSkin(frame.rootPane).getColorScheme(
                    DecorationAreaType.PRIMARY_TITLE_PANE,
                    RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                    ComponentState.ENABLED
                )
            )
            frame.setSize(340, 258)
            frame.setLocationRelativeTo(null)
            frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

            frame.isVisible = true
        }

        // wait for one second
        withContext(Dispatchers.Main) { delay(1000) }

        // make the screenshot
        withContext(Dispatchers.Swing) { makeScreenshot(frame, screenshotDirectory) }

        // dispose the frame
        withContext(Dispatchers.Swing) { frame.dispose() }

        val end = System.currentTimeMillis()
        println(this.javaClass.simpleName + " : " + (end - start) + "ms")
    }

    /**
     * Runs the screenshot process.
     */
    override fun run(screenshotDirectory: String) {
        runBlocking { runInner(screenshotDirectory) }
    }

    /**
     * Creates the screenshot and saves it on the disk.
     */
    private fun makeScreenshot(frame: JFrame, screenshotDirectory: String) {
        val bi = RadianceCommonCortex.getBlankScaledImage(
            RadianceCommonCortex.getScaleFactor(frame),
            frame.width,
            frame.height
        )
        val g = bi.graphics
        frame.paint(g)
        try {
            val target = File(screenshotDirectory + this.screenshotFilename)
            target.parentFile.mkdirs()
            ImageIO.write(bi, "png", target)
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

    }
}

/**
 * The base class for taking screenshots of color schemes for Radiance documentation.
 *
 * @author Kirill Grouchnikov
 */
abstract class ColorSchemeRobot(colorScheme: RadianceColorScheme, screenshotFilename: String) :
    BaseColorSchemeRobot(
        if (colorScheme.isDark) RobotDefaultDarkSkin(colorScheme) else
            RobotDefaultSkin(colorScheme), screenshotFilename
    )

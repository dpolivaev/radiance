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
package org.pushingpixels.radiance.demo.theming.main.samples.theming.api;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.skin.AutumnSkin;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.radiance.theming.api.skin.GraphiteSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.RootPaneScope#setSkin(javax.swing.JRootPane, RadianceSkin)} API.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.RootPaneScope#setSkin(javax.swing.JRootPane, RadianceSkin)
 */
public class SetRootPaneSkin extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public SetRootPaneSkin() {
        super("Per-window skins");

        this.setLayout(new FlowLayout());

        JButton autumnSkin = new JButton("Autumn skin");
        autumnSkin.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> openSampleFrame(new AutumnSkin())));
        this.add(autumnSkin);

        JButton ravenGraphiteSkin = new JButton("Graphite skin");
        ravenGraphiteSkin.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> openSampleFrame(new GraphiteSkin())));
        this.add(ravenGraphiteSkin);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Opens a sample frame under the specified skin.
     * 
     * @param skin
     *            Skin.
     */
    private void openSampleFrame(RadianceSkin skin) {
        JFrame sampleFrame = new JFrame(skin.getDisplayName());
        sampleFrame.setLayout(new FlowLayout());
        JButton defaultButton = new JButton("active");
        JButton button = new JButton("default");
        JButton disabledButton = new JButton("disabled");
        disabledButton.setEnabled(false);
        sampleFrame.getRootPane().setDefaultButton(defaultButton);

        sampleFrame.add(defaultButton);
        sampleFrame.add(button);
        sampleFrame.add(disabledButton);

        sampleFrame.setVisible(true);
        sampleFrame.pack();
        sampleFrame.setLocationRelativeTo(null);
        sampleFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sampleFrame.setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR));

        RadianceThemingCortex.RootPaneScope.setSkin(sampleFrame.getRootPane(), skin);
        SwingUtilities.updateComponentTreeUI(sampleFrame);
        sampleFrame.repaint();
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new SetRootPaneSkin().setVisible(true);
        });
    }
}

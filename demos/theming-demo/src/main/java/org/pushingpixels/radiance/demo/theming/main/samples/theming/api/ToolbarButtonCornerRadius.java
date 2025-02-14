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
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.ComponentScope#setToolbarButtonCornerRadius(javax.swing.AbstractButton, float)}
 * API.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.ComponentScope#setToolbarButtonCornerRadius(javax.swing.AbstractButton,
 *      float)
 */
public class ToolbarButtonCornerRadius extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public ToolbarButtonCornerRadius() {
        super("Toolbar button corner radius");

        this.setLayout(new BorderLayout());

        JToolBar toolBar = new JToolBar("");
        toolBar.add(new JLabel("Sample toolbar"));
        toolBar.add(new JSeparator(SwingConstants.VERTICAL));

        JToggleButton buttonDefault = new JToggleButton("radius default");
        buttonDefault.setSelected(true);
        toolBar.add(buttonDefault);

        JToggleButton button1 = new JToggleButton("radius 5");
        // set corner radius to 5 pixels
        RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(button1, 5.0f);
        button1.setSelected(true);
        toolBar.add(button1);

        JToggleButton button2 = new JToggleButton("radius 0");
        // set corner radius to 0 pixels (perfect rectangle)
        RadianceThemingCortex.ComponentScope.setToolbarButtonCornerRadius(button2, 0.0f);
        button2.setSelected(true);
        toolBar.add(button2);

        this.add(toolBar, BorderLayout.NORTH);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            new ToolbarButtonCornerRadius().setVisible(true);
        });
    }
}

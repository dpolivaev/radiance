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
package org.pushingpixels.radiance.theming.extras.api;

import org.pushingpixels.radiance.theming.extras.api.tabbed.TabPreviewPainter;
import org.pushingpixels.radiance.theming.extras.internal.RadianceExtrasSynapse;

import javax.swing.*;
import java.awt.*;

/**
 * This class is the only officially-supported entry point into configuring the extra behavior of
 * Radiance-powered UIs and for querying the state of such UIs.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceThemingExtrasCortex {
    /**
     * APIs in this scope apply to individual application {@link Component}s.
     */
    public static final class ComponentScope {
        /**
         * Sets the tab preview painter to be used for all tabs of the specified tabbed pane.
         * 
         * @param tabbedPane
         *            Tabbed pane.
         * @param tabPreviewPainter
         *            Preview painter to be used for all tabs of the tabbed pane. Can be
         *            <code>null</code>.
         */
        public static void setTabPanePreviewPainter(JTabbedPane tabbedPane,
                TabPreviewPainter tabPreviewPainter) {
            tabbedPane.putClientProperty(RadianceExtrasSynapse.TABBED_PANE_PREVIEW_PAINTER,
                    tabPreviewPainter);
        }
    }
}

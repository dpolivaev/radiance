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
package org.pushingpixels.radiance.theming.internal.widget.text;

import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ComponentStateFacet;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;
import org.pushingpixels.radiance.theming.internal.utils.icon.HighlightableTransitionAwareIcon;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Adds edit context menu on text components.
 * 
 * @author Kirill Grouchnikov
 */
public class EditContextMenuWidget extends RadianceThemingWidget<JTextComponent> {
    /**
     * Mouse listener for showing the edit context menu.
     */
    private MouseListener menuMouseListener;

    private static final int ICON_SIZE = 14;

    @Override
    public void installListeners() {
        this.menuMouseListener = new MouseAdapter() {
            // fix for issue 8 - use mousePressed instead of
            // mouseClicked so that it will be triggered on Linux.
            @Override
            public void mousePressed(MouseEvent e) {
                this.handleMouseEvent(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                this.handleMouseEvent(e);
            }

            private void handleMouseEvent(MouseEvent e) {
                if (!WidgetUtilities.hasTextEditContextMenu(jcomp))
                    return;
                if (!e.isPopupTrigger())
                    return;

                // request focus
                jcomp.requestFocus(true);

                JPopupMenu editMenu = new JPopupMenu();
                editMenu.add(getCutItem());
                editMenu.add(getCopyItem());
                editMenu.add(getPasteItem());
                editMenu.addSeparator();
                editMenu.add(getDeleteItem());
                editMenu.add(getSelectAllItem());
                editMenu.applyComponentOrientation(jcomp.getComponentOrientation());

                Point pt = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), jcomp);
                if (jcomp.getComponentOrientation().isLeftToRight()) {
                    editMenu.show(jcomp, pt.x, pt.y);
                } else {
                    editMenu.show(jcomp, pt.x - editMenu.getPreferredSize().width, pt.y);
                }
            }
        };
        jcomp.addMouseListener(this.menuMouseListener);
    }

    @Override
    public void uninstallListeners() {
        jcomp.removeMouseListener(this.menuMouseListener);
        this.menuMouseListener = null;
    }

    private JMenuItem getCutItem() {
        JMenuItem result = new JMenuItem(
                RadianceThemingCortex.GlobalScope.getLabelBundle().getString("EditMenu.cut"));
        result.setEnabled(
                jcomp.isEditable() && jcomp.isEnabled() && (jcomp.getSelectedText() != null));

        HighlightableTransitionAwareIcon icon = new HighlightableTransitionAwareIcon(result,
                () -> (TransitionAwareUI) result.getUI(),
                scheme -> RadianceThemingCortex.GlobalScope.getIconPack().getTextCutActionIcon(ICON_SIZE, scheme),
                ComponentStateFacet.ARM, "radiance.theming.internal.widget.editcontext.cut");
        result.setIcon(icon);

        result.addActionListener(actionEvent -> jcomp.cut());
        return result;
    }

    private JMenuItem getCopyItem() {
        JMenuItem result = new JMenuItem(
                RadianceThemingCortex.GlobalScope.getLabelBundle().getString("EditMenu.copy"));
        result.setEnabled(jcomp.isEnabled() && (jcomp.getSelectedText() != null));

        HighlightableTransitionAwareIcon icon = new HighlightableTransitionAwareIcon(result,
                () -> (TransitionAwareUI) result.getUI(),
                scheme -> RadianceThemingCortex.GlobalScope.getIconPack().getTextCopyActionIcon(ICON_SIZE, scheme),
                ComponentStateFacet.ARM, "radiance.theming.internal.widget.editcontext.copy");
        result.setIcon(icon);

        result.addActionListener(actionEvent -> jcomp.copy());
        return result;
    }

    private JMenuItem getPasteItem() {
        JMenuItem result = new JMenuItem(
                RadianceThemingCortex.GlobalScope.getLabelBundle().getString("EditMenu.paste"));
        boolean isEnabled = false;
        if (jcomp.isEditable() && jcomp.isEnabled()) {
            Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard()
                    .getContents(this);
            isEnabled = contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        }
        result.setEnabled(isEnabled);

        HighlightableTransitionAwareIcon icon = new HighlightableTransitionAwareIcon(result,
                () -> (TransitionAwareUI) result.getUI(),
                scheme -> RadianceThemingCortex.GlobalScope.getIconPack().getTextPasteActionIcon(ICON_SIZE, scheme),
                ComponentStateFacet.ARM, "radiance.theming.internal.widget.editcontext.paste");
        result.setIcon(icon);

        result.addActionListener(actionEvent -> jcomp.paste());
        return result;
    }

    private JMenuItem getDeleteItem() {
        JMenuItem result = new JMenuItem(
                RadianceThemingCortex.GlobalScope.getLabelBundle().getString("EditMenu.delete"));
        result.setEnabled(
                jcomp.isEditable() && jcomp.isEnabled() && (jcomp.getSelectedText() != null));

        HighlightableTransitionAwareIcon icon = new HighlightableTransitionAwareIcon(result,
                () -> (TransitionAwareUI) result.getUI(),
                scheme -> RadianceThemingCortex.GlobalScope.getIconPack().getTextDeleteActionIcon(ICON_SIZE, scheme),
                ComponentStateFacet.ARM, "radiance.theming.internal.widget.editcontext.delete");
        result.setIcon(icon);

        result.addActionListener(actionEvent -> jcomp.replaceSelection(null));
        return result;
    }

    private JMenuItem getSelectAllItem() {
        JMenuItem result = new JMenuItem(
                RadianceThemingCortex.GlobalScope.getLabelBundle().getString("EditMenu.selectAll"));
        result.setEnabled(jcomp.isEnabled() && (jcomp.getDocument().getLength() > 0));

        HighlightableTransitionAwareIcon icon = new HighlightableTransitionAwareIcon(result,
                () -> (TransitionAwareUI) result.getUI(),
                scheme -> RadianceThemingCortex.GlobalScope.getIconPack().getTextSelectAllActionIcon(ICON_SIZE, scheme),
                ComponentStateFacet.ARM, "radiance.theming.internal.widget.editcontext.selectall");
        result.setIcon(icon);

        result.addActionListener(actionEvent -> jcomp.selectAll());
        return result;
    }
}

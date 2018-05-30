package com.xshalk.proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    URL imageURL;
    Thread thread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.imageURL = url;
    }


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
            return;
        }
        g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
        doRetrieving(c);
    }

    // only retrieving once;
    private synchronized void doRetrieving(Component c) {
        if (retrieving) {
            return;
        }
        if (imageURL == null) {
            return;
        }
        retrieving = true;
        thread = new Thread(
                () ->
                {
                    imageIcon = new ImageIcon(imageURL, "CD Cover");
                    c.repaint();
                });
        thread.start();
    }


    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }
}

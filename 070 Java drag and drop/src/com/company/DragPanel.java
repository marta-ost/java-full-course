package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("smile.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point previousPoint;
    boolean dragValid = false;

    DragPanel() {
        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) { //repaints our image after we update the new positioning of it
        super.paintComponent(g);
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter { //waits until we click the mouse
        public void mousePressed(MouseEvent e) {
            previousPoint = e.getPoint(); //updates the previousPoint to wherever we click
            dragValid = (e.getPoint().getX() > imageCorner.getX()
                    && (e.getPoint().getX() < imageCorner.getX() + WIDTH))
                    && (e.getPoint().getY() > imageCorner.getY())
                    && (e.getPoint().getY() < imageCorner.getY() + HEIGHT);
        }
    }

    private class DragListener extends MouseMotionAdapter { //moves our image as we move our mouse around
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();
            if (dragValid) {
                imageCorner.translate(
                        (int) (currentPoint.getX() - previousPoint.getX()),
                        (int) (currentPoint.getY() - previousPoint.getY()));
                //translates our imageCorner to the new position wherever our currentPoint is after dragging our mouse
                previousPoint = currentPoint;
                repaint();
            }
        }
    }
}

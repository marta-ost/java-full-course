package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;

    MyPanel() {
        image = new ImageIcon("sun.png").getImage(); //creates the image out of the imageIcon
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.blue);
        //g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0, 0, 500, 500);

        //g2D.setPaint(Color.pink);
        //g2D.drawRect(0, 0, 100, 200);
        //g2D.fillRect(0, 0, 100, 200);
        //anything that is more recently created is going to overlap any previously created ones
        //g2D.setPaint(Color.orange);
        //g2D.drawOval(0, 0, 100, 100);
        //g2D.fillOval(0, 0, 100, 100);
        //g2D.drawArc(0, 0, 100, 100, 0, 180);

        //g2D.setPaint(Color.red);
        //g2D.fillArc(0, 0, 100, 100, 0, 180);
        //g2D.setPaint(Color.white);
        //g2D.fillArc(0, 0, 100, 100, 180, 180);

        //int[] xPoints = {150, 250, 350};
        //int[] yPoints = {300, 150, 300};
        //g2D.setPaint(Color.yellow);
        //g2D.drawPolygon(xPoints, yPoints, 3);
        //g2D.fillPolygon(xPoints, yPoints, 3);

        //g2D.drawString("You are a winner!", 0, 0); //off-screen - the starting point of the text is the bottom left corner
        g2D.setPaint(Color.magenta);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("You are a winner!", 50, 50);

        g2D.drawImage(image, 200, 200, null);
    }
}

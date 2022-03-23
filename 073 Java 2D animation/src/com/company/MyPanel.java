package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    //final int PANEL_WIDTH = 400;
    //final int PANEL_HEIGHT = 400;
    final int PANEL_WIDTH;
    final int PANEL_HEIGHT;
    Image smile;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        //this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        //this.setBackground(Color.black);
        smile = new ImageIcon("smile.png").getImage();
        backgroundImage = new ImageIcon("sky.png").getImage();
        PANEL_WIDTH = backgroundImage.getWidth(null);
        PANEL_HEIGHT = backgroundImage.getHeight(null);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        timer = new Timer(5, this); //time in milliseconds
        timer.start();
    }

    public void paint(Graphics g) { //called behind the scenes when we instantiate our panel
        super.paint(g); //paints background
        Graphics2D g2D = (Graphics2D) g; //casts to Graphics2D object
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(smile, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x >= PANEL_WIDTH - smile.getWidth(null) || (x < 0)) {
            xVelocity = xVelocity * -1; //changes direction
        }
        x = x + xVelocity;

        if (y >= PANEL_HEIGHT - smile.getHeight(null) || (y < 0)) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();  //we need to call the paint method everytime we update the position
    }
}

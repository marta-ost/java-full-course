package com.company;

import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame() {
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null); //frame appears in the middle of the computer screen
        this.setVisible(true);
    }

    //public void paint(Graphics g) {
    //paint method is invoked behind the scenes - called automatically when we instantiate a component
    //Graphics2D g2D = (Graphics2D) g; // casting to Graphics2D object - updated subclass of Graphics class

    //g2D.drawLine(0, 0, 500, 500); //but the size of the frame also includes the window bar at the top
    //so better to create a panel, draw on the panel, and then add the panel to the frame
}


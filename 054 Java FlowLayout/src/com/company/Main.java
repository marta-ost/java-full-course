package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Layout Manager = defines the natural layout for components within a container

        // FlowLayout =     places component in a row, sized at their preferred size.
        //                  If the horizontal space in the container is too small,
        //                  the FLowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); //LEADING - components stick to the left side,
        //CENTER - default, TRAILING - stick to the right side // + spacing between buttons

        //we can also add layout managers to the panel, then add buttons to the panel and the panel to the frame
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout()); //actually it is default layout to panels

        //JButton button1 = new JButton();
        //frame.add(button1);

        panel.add(new JButton("1")); //shortcut
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        //frame.add(new JButton("1"));
        //frame.add(new JButton("2"));
        //frame.add(new JButton("3"));
        //frame.add(new JButton("4"));
        //frame.add(new JButton("5"));
        //frame.add(new JButton("6"));
        //frame.add(new JButton("7"));
        //frame.add(new JButton("8"));
        //frame.add(new JButton("9"));

        frame.add(panel);

        frame.setVisible(true); //sometimes components don't display if you set the visibiliy to true before adding them
    }
}

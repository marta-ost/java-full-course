package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Layout Manager = defines the natural layout for components within a container

        // 3 common managers

        // BorderLayout = a BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER.
        //                All extra space is placed in the center area.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 30)); //you can pass gaps between panels
        //need to setLayout for other layout managers - this is the default for frame
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel5.setLayout(new BorderLayout()); //now panel5 is another container and has its own layout manager

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //------------SUB PANELS - PANELS INSIDE OF A CENTRAL PANEL

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.DARK_GRAY);
        panel8.setBackground(Color.GRAY);
        panel9.setBackground(Color.LIGHT_GRAY);
        panel10.setBackground(Color.ORANGE);

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH); //panels within another (central) panel
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

        //------------SUB PANELS - PANELS INSIDE OF A CENTRAL PANEL

        frame.add(panel1, BorderLayout.NORTH); //to set this component to one of the borders - to the top
        frame.add(panel2, BorderLayout.WEST); // will expand vertically
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH); // will expand horizontally
        frame.add(panel5, BorderLayout.CENTER);
    }
}

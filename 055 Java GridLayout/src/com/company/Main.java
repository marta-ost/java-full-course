package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Layout Manager = defines the natural layout for components within a container

        // GridLayout =     places components in a grid of cells.
        //                  Each component takes all the available space within its cell,
        //                  and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //by default border layout manager in frames, so the components like to take up as much space as they can
        frame.setLayout(new GridLayout(3, 3, 5, 10));
        //we can specify the amount of rows and columns that we want, then spacing between components

        //JButton button1 = new JButton("1");
        //frame.add(button1);

        frame.add(new JButton("1")); //shortcut
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        //frame.add(new JButton("10")); //then it creates another column
        //and it tries to make this as evenly balanced as possible

        frame.setVisible(true);
    }
}

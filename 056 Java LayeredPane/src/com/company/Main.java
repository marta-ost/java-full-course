package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JLayered Pane = Swing container that provides a
        //                 third dimension for positioning components
        //                 ex. depth, Z-index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        //layeredPane.add(label1); //on the top, next underneath and so on. but we can change that pattern
        //layeredPane.add(label2);
        //layeredPane.add(label3);

        //specific names for all layers: 1st: Drag, 2nd: PopUp, 3rd: Modal, 4th: Palette, 5th: Default
        //we can specify in which layer we want to add a component

        //layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); //base layer
        //layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER); //base layer
        //layeredPane.add(label3, JLayeredPane.DRAG_LAYER); //on the top

        layeredPane.add(label1, Integer.valueOf(0)); //base layer
        layeredPane.add(label2, Integer.valueOf(2)); //on the top - the higher the number, the higher the placement is
        layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane); //is invisible, attached to the frame and we can add components to it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

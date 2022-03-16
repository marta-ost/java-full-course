package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("picture.png");
        Border border = BorderFactory.createLineBorder(Color.blue, 5);

        //JLabel label = new JLabel("this is a letter icon");
        JLabel label = new JLabel(); //create a label
        label.setText("this is a letter icon"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of ImageIcon
        //label.setForeground(Color.green);
        label.setForeground(new Color(0x002447)); //set font color of text
        label.setFont(new Font("Lato", Font.PLAIN, 35)); //set font of text
        label.setIconTextGap(-70); //set gap of text to image
        label.setBackground(new Color(100, 150, 250)); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //set border of label (not image + text)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text within label
        //label.setBounds(100, 100, 250, 250); //set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}

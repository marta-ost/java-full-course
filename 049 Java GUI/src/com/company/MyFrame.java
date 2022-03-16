package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    //the other way to create a JFrame

    MyFrame() {
        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        //      (by default: HIDE_ON_CLOSE,
        //      otherwise DO_NOTHING_ON_CLOSE, but then you can't close by hitting the x button)
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420, 420); //sets the x-dimension and y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        //this.getContentPane().setBackground(Color.blue); //change color of background
        //this.getContentPane().setBackground(new Color(255, 255, 255)); //RGB values - red, green, blue
        this.getContentPane().setBackground(new Color(0x350626)); //hexadecimal values
        //      0x000000 - black, 0xFFFFFF - white
    }
}

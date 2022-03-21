package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("plane.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        label.setIcon(icon);

        this.getContentPane().setBackground(new Color(0x00536999));
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY()); //will go left 10px when we type a
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10); //will go up 10x when we type w
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10); //will go down 10px when we type s
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY()); //will go right 10px when we type d
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY()); //will go left when we click on the left arrow
                break;                                                 //which has a code 37
            case 38:
                label.setLocation(label.getX(), label.getY() - 10); //will go up when we click on the up arrow
                break;                                                 //which has a code 38
            case 39:
                label.setLocation(label.getX() + 10, label.getY()); //will go right when we click on the right arrow
                break;                                                 //which has a code 39
            case 40:
                label.setLocation(label.getX(), label.getY() + 10); //will go down when we click on the down arrow
                break;                                                 //which has a code 40
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar()); //You released key char: q
        System.out.println("You released key code: " + e.getKeyCode()); //You released key code: 81
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon right;
    ImageIcon left;
    ImageIcon down;
    ImageIcon up;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        right = new ImageIcon("right.png");
        left = new ImageIcon("left.png");
        down = new ImageIcon("down.png");
        up = new ImageIcon("up.png");

        label.setIcon(up);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null); //frame will appear in the middle of the computer screen
        this.setVisible(true);

        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500, 500);
        //this.setLayout(null);

        //label = new JLabel();
        //label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        //label.addMouseListener(this); //now this label can respond to different mouse events
        //this.addMouseListener(this); //now this whole frame responds to different mouse events

        //this.add(label);
        //this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when a mouse button has been clicked (pressed and released) on a component
        //System.out.println("You clicked the mouse");
    } //need to click on the label - if we added MouseListener to the label, not to the frame

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        label.setIcon(down);
        //System.out.println("You pressed the mouse");
        //label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        label.setIcon(left);
        //System.out.println("You released the mouse");
        //label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component (the area of the component)
        label.setIcon(right);
        //System.out.println("You entered the component"); //without clicking the mouse button
        //label.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component (the area of the component)
        label.setIcon(up);
        //System.out.println("You exited the component"); //without clicking the mouse button
        //label.setBackground(Color.red);
    }
}

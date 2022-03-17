package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {       //without lambda
    // public class MyFrame extends JFrame {                          //when lambda

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("icon.png");
        ImageIcon icon2 = new ImageIcon("picture.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(70, 130, 400, 400);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 150);
        button.addActionListener(this);                             //without lambda
        //button.addActionListener(e -> System.out.println("action")); //lambda
        button.setText("Click to write a letter!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Century Gothic", Font.BOLD, 18));
        button.setIconTextGap(-10);
        button.setForeground(new Color(7225000));
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); //to disable a button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override                                                           //without lambda
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("action");
            //button.setEnabled(false); //when we put it here - we can only click button once then it gets disabled
            label.setVisible(true);
        }
    }
}

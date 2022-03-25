package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON 1");
    JButton myButton2 = new JButton("MY BUTTON 2");

    MyFrame() {

        myButton.setBounds(100, 100, 200, 100);
        //myButton.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        System.out.println("This is the first button");
        //    }
        //});
        myButton.addActionListener(
                (e) -> System.out.println("This is the first button")
        );

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(
                (e) -> System.out.println("This is the second button")
        );

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}

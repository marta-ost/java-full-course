package com.company;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 500, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);

            try {
                Thread.sleep(50); //going to pause our program for 5 milliseconds (0,05s) after each iteration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter += 1;
        }
        bar.setString("Done! :)");
    }
}

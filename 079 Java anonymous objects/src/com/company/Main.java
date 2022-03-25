package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //JLabel label1 = new JLabel();
        //new JLabel();

        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        //ImageIcon AC = new ImageIcon("src\\cards\\1.png");
        //JLabel AClabel = new JLabel(AC);
        //deck.add(AClabel);

        //ImageIcon twoC = new ImageIcon("src\\cards\\2.png");
        //JLabel twoClabel = new JLabel(twoC);
        //deck.add(twoClabel);

        //deck.add(new JLabel(new ImageIcon("src\\cards\\1.png")));
        //deck.add(new JLabel(new ImageIcon("src\\cards\\2.png")));

        //frame.add(deck.get(0));
        //frame.add(deck.get(1));

        for (int i = 1; i <= 52; i++) {
            deck.add(new JLabel(new ImageIcon("src\\cards\\" + i + ".png")));
            frame.add(deck.get(i - 1));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}

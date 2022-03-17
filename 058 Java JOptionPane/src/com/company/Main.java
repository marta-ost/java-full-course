package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs them of something

        //JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Here is more info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Do you want to quit?", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Warning!", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Something went wrong", "title", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(answer);
        //returns values - yes = 0, no = 1, cancel = 2, x button = -1

        //String input = JOptionPane.showInputDialog("What is your name?: ");
        //System.out.println("Hello " + input);

        String[] responses = {"You're awesome!", "Thank you!"};
        ImageIcon icon = new ImageIcon("icon.png");
        JOptionPane.showOptionDialog(null, "You are awesome", "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}

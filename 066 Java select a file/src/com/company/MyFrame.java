package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select file");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(".")); //set to current project folder
            //I can also for example set to file path to Desktop

            //System.out.println(fileChooser.showOpenDialog(null));
            //prints 0 when we select a file or 1 when we click on Cancel or x button

            //int response = fileChooser.showOpenDialog(null); //select file to open
            int response = fileChooser.showSaveDialog(null); //select file to save
            // (attempts to, just prints the file location currently - need to do more steps to actually save a file)

            if (response == JFileChooser.APPROVE_OPTION) { //when somebody successfully selects a file (response = 0)
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file); //prints out the file path for this file
            }
        }
    }
}

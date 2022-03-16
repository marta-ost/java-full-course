package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("textfile.txt");
            writer.write("First line \nSecond line");
            writer.append("\nThird line");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // recursion = the process in which a method calls itself continuously
        // a method that calls itself is called a recursive method
        // useful for factorials, transversing trees and simplifying a complex task

        Scanner scan = new Scanner(System.in);
        //System.out.println("How many times do you want to print this");
        //int number = scan.nextInt();

        //HelloWorld(number);

        System.out.println("How far do you want to walk (meters)?: ");
        int distance = scan.nextInt();

        takeAStep(0, distance);
    }

    static void HelloWorld(int n) {
        if (n > 0) {
            System.out.println("Hello World! " + n);
            n--;
            HelloWorld(n);
        }
    }

    static void takeAStep(int i, int distance) {
        if (i < distance) {
            i++;
            System.out.println("*You take a step* : " + i + " meter/s");
            takeAStep(i, distance);
        } else {
            System.out.println("You are done walking!");
        }
    }
}


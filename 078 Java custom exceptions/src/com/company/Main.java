package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // exception = an event, after execution, that disrupts the normal flow of a program
        // ex. ArithmeticException, ArrayIndexOutOfBoundsException, FileNotFoundException

        // user defined exceptions = custom exceptions
        // ex. DuplicateEmailException, InvalidCreditException, AgeException

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occured: " + e); //shows which exception (e) it is
        }
    }

    static void checkAge(int age) throws AgeException { //then list the condition which will throw a new AgeException
        if (age < 18) {
            throw new AgeException("\n" + "You must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up");
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        // method overriding = declaring a method in subclass,
        //                     which is already present in parent class.
        //                     done so that a child class can give its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();
    }
}

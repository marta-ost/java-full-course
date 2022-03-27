package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        MyIntegerClass myInt = new MyIntegerClass(1);
//        MyDoubleClass myDouble = new MyDoubleClass(3.14);
//        MyCharacterClass myChar = new MyCharacterClass('@');
//        MyStringClass myString = new MyStringClass("Hello");

//        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
//        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
//        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
//        MyGenericClass<String> myString = new MyGenericClass<>("Hello");
//
//        ArrayList<String> myFriends = new ArrayList<>(); //also a generic class with one generic parameter

//        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 9);
//        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);
//        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
//        MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '!');
//
//        HashMap<Integer, String> users = new HashMap<>(); //also a generic class with two generic parameters


        // bounded types = you can create the objects of a generic class to have data
        //                 of specific derived types ex. Number

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
    }
}

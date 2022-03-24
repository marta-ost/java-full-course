package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name, email), (username, userID), (country, capital)

        HashMap<String, String> countries = new HashMap<String, String>();

        //add a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Germany", "Berlin");
        countries.put("China", "Beijing");

        //countries.remove("USA");
        //System.out.println(countries.get("Germany"));
        //countries.clear();
        //System.out.println(countries.size());
        //countries.replace("USA", "Detroit");
        //System.out.println(countries.containsKey("England"));
        //System.out.println(countries.containsValue("Beijing"));
        //System.out.println(countries);

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }
    }
}

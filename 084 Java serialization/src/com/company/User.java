package com.company;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1; //we can add default one - recommended
    String name;
    //String password;
    transient String password;

    public void sayHello() {
        //public void greeting() { // now we have different serialVersionUID -
        // they don't match, different version of the User class compared to our deserializer
        // if we want to deserialize - InvalidClassException
        System.out.println("Hello " + name);
    }
}

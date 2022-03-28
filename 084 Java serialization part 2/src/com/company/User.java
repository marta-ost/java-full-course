package com.company;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1;
    String name;
    //String password;
    transient String password;

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
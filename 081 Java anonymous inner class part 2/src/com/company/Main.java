package com.company;

public class Main {

    public static void main(String[] args) {

        // anonymous class = an inner class without a name
        //                   only a single object is created from one
        //                   the object may have "extras" or "changes"
        //                   and no need to create a separate inner class
        //                   when it only need it once.
        //                   Helps us to avoid cluttering code with a class names

        //                   Syntax is similar to a constructor,
        //                   except that there is also a class definition
        //                   within a block of code
        //                   GREAT FOR LISTENERS

        MyFrame myFrame = new MyFrame();
    }
}

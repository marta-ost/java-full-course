package com.company;

import javax.management.ObjectName;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Serialization =    The process of converting an object into a byte stream.
        //                    Persists (saves the state) the object after program exits
        //                    This byte stream can be saved as a file or sent over a network
        //                    Can be sent to a different machine
        //                    Byte stream can be saved as a file (.ser) which is platform independent
        //                    (Think of this as if you're saving a file with the object's information)

        //                    Steps to Serialize
        //                    1. Your object class should implement Serializable interface
        //                    2. add import java.io.Serializable;
        //                    3. FileOutputStream fileOut = new FileOutputStream(file path)
        //                    4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //                    5. out.writeObject(objectName)
        //                    6. out.close(); fileOut.close();

        // Deserialization = The reverse process of converting a byte stream into an object.
        //                    (Think of this as if you're loading a saved file)\

        //                    Steps to Deserialize
        //                    1. Declare your object (don't instantiate)
        //                    2. Your class should implement Serializable interface
        //                    3. add import java.io.Serializable;
        //                    4. FileInputStream fileIn = new FileInputStream (file path);
        //                    5. ObjectInputStream in = new ObjectInputStream (fileIn);
        //                    6. objectName = (Class) in.readObject();
        //                    7. in.close(); fileIn.close():

        // important notes    1. children classes of a parent class that implements Serializable will do so as well
        //                    2. static fields are not serialized (they belong to the class, not an individual object)
        //                    3. the class's definition ("class file") itself is not recorded, cast it as the object type
        //                    4. Fields declared as "transient" aren't serialized, they're ignored
        //                    5. serialVersionUID is a unique version ID

        // serialVersionUID = serialVersionUID is a unique ID that functions like a version #
        //                    verifies that the sender and receiver of a serialized object
        //                    have loaded classes for that object that match
        //                    Ensures object will be compatible between machines
        //                    Number must match. Otherwise this will cause a InvalidClassException
        //                    A SerialVersionUID will be calculated based on class properties, members etc.
        //                    A serializable class can declare its own serialVersionUID explicitly (recommended)

        User user = null; //declaring but not instantiating

        FileInputStream fileIn = new FileInputStream
                ("C:\\...\\084 Java serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject(); //3.
        in.close();
        fileIn.close();

        System.out.println(user.name); //values were not assigned this time - converted from a byte stream
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}

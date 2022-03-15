package package1;

import package2.*;

public class A {

    public static void main(String[] args) {

        C c = new C();
        //System.out.println(c.defaultMessage); //is not visible - different package
        System.out.println(c.publicMessage); // is visible - even from other packages

        B b = new B();
        //System.out.println(b.privateMessage); // is not visible - different class, even if from the same package
    }

    protected String protectedMessage = "This is protected";
}

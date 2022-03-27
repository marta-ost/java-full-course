package com.company;

public class MyGenericClass<Thing extends Number, Thing2 extends Number> {
    //the scope is limited to the subclasses of the Number class

    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue() {
        return y;
    }
}

//public class MyGenericClass<Thing, Thing2> { //more often MyGenericClass<T, V>
//
//    Thing x;
//    Thing2 y;
//
//    MyGenericClass(Thing x, Thing2 y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Thing2 getValue() {
//        return y;
//    }
//}

//public class MyGenericClass<Thing> {
//
//    Thing x;
//
//    MyGenericClass(Thing x) {
//        this.x = x;
//    }
//
//    public Thing getValue() {
//        return x;
//    }
//}


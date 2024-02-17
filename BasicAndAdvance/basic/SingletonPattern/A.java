package singleInstance;

public class A {
    // define an object for A
    private static A a = new A();

    // private constructor
    private A(){}

    // define a class method to return object of class
    public static A getObject(){
        return a;
    }
}

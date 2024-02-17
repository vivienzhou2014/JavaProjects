package singleInstance;

public class B {
    // define a class variable to store class object
    private static B b;

    // private constructor
    private B(){}

    // define a class method to ensure creating an object only when first using
    public static B getInstance(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}

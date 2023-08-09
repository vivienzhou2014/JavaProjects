package Demo01FunctionalInterface;

public class MyFunctionalInterfaceImpl implements MyFunctionalInterface{
    @Override
    public void method() {
        System.out.println("Use implemented class to override abstract method in interface");
    }
}

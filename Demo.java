package Demo01FunctionalInterface;

public class Demo {
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("Use anonymous inner class to override abstract method in interface");
            }
        });

        show(new MyFunctionalInterfaceImpl());

        show(()->{
            System.out.println("Use Lambda to override abstract method in interface");
        });

        show(()->System.out.println("Use Lambda to override abstract method in interface"));
    }
}

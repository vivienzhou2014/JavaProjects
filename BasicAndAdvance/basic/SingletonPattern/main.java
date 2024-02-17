package singleInstance;

public class main {
    public static void main(String[] args) {
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1);
        System.out.println(a2);

        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1 == b2);
    }
}

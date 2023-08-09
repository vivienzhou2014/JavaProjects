package Demo01FunctionalInterface;

import java.util.function.Consumer;

public class Demo01Consumer {
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("Alice", n->System.out.println(n) );
        method("Will", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        method("RevErse",(String r)->{
            /*StringBuilder bu = new StringBuilder(r);
            System.out.println(bu.reverse());*/
            String reName = new StringBuilder(r).reverse().toString();
            System.out.println(reName);
        });
    }
}

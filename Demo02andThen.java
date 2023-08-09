package Demo01FunctionalInterface;

import java.util.function.Consumer;

public class Demo02andThen {
    public static void method(String s, Consumer<String> con1, Consumer<String> con2){
        /*con1.accept(s);
        con2.accept(s);*/
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello",
                (t)->{
                    System.out.println(t.toLowerCase());
                },
                (t)->{
                    System.out.println(t.toUpperCase());
                });
    }
}

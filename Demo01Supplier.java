package Demo01FunctionalInterface;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String string = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "3455";
            }
        });
        String s = getString(() ->  "123");
        System.out.println(string);
        System.out.println(s);
    }
}

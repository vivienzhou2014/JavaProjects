package Demo01FunctionalInterface;

import java.util.function.Predicate;

public class Demo01Predicate_test_negate {
    public static boolean islong(String s, Predicate<String> prd){
        //return prd.test(s);
        //return prd.negate().test(s);
        return !prd.test(s);
    }

    public static void main(String[] args) {
        boolean result = islong("Hello", (t) -> {
            return t.length() > 5;
        });
        System.out.println(result);
    }
}

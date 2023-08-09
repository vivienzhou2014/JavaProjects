package Demo01FunctionalInterface;

import java.util.function.Predicate;

public class Demo01Predicate_and_or {
    public static boolean checkString(String s, Predicate<String> p1, Predicate<String> p2){
        //return p1.test(s) && p2.test(s);
        //return p1.and(p2).test(s);
        //return p1.test(s) || p2.test(s);
        return p1.or(p2).test(s);

    }

    public static void main(String[] args) {
        String s = "Nihgggg";
        Boolean result = checkString(s,
                (t)->{return s.length()>5;},
                (t)->{return s.contains("a");});
        System.out.println(result);
    }
}

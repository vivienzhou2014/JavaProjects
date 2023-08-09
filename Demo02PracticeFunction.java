package Demo01FunctionalInterface;

import java.util.function.Function;

public class Demo02PracticeFunction {
    public static int change(String s, Function<String,String> fun1,
                             Function<String,Integer> fun2, Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }
    public static void main(String[] args) {
        String str = "Alice,20";
        int result = change(str, (String t) -> {
            return t.split(",")[1];
        }, (String r) -> {
            return Integer.parseInt(r);
        }, (Integer i) -> {
            return i+100;
        });
        System.out.println(result);

    }
}

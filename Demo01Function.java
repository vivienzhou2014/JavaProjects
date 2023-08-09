package Demo01FunctionalInterface;

import java.util.function.Function;

public class Demo01Function {
    public static void change(String s, Function<String, Integer> fun){
        //Integer in = fun.apply(s);
        int in = fun.apply(s);//auto unboxing
        System.out.println(in+56);
    }
    public static void addString(String s, Function<String,Integer> fun1, Function<Integer,String> fun2){
        String result = fun1.andThen(fun2).apply(s);
        //System.out.println(s);
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "20";
        change(str, (String t)->{
            return Integer.parseInt(t);
        });

        String ss = "123";
        Integer i = 30;
        addString(ss, (String r)->{
            Integer in = Integer.parseInt(r)+i;
            return in;
        }, (inn)->{
            return inn.toString();
        });
    }
}

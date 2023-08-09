package Demo01FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo03PracticePredicate {
    public static void forInfo(String[] arr, Predicate<String> p1, Predicate<String> p2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if(p1.and(p2).test(s)){
                list.add(s);
            };
        }
        //System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Alice,Female", "Belle,Female", "Will,Male"};
        forInfo(arr, (t)->{
                return t.split(",")[0].length()==5;
            }, (t)->{
            return t.split(",")[1].equals("Female");
        });


    }
}

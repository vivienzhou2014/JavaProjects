package Demo02StreamAndMethodReference;

import java.util.ArrayList;

public class Practise01_collection {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("22");
        list1.add("3");
        list1.add("4r");
        list1.add("5g");
        list1.add("6");
        list1.add("7h");
        ArrayList<String> one = new ArrayList<>();//22,4r,5g,7h
        for(String name : list1){
            if(name.length()==2){
                one.add(name);
            }
        }
        ArrayList<String> two = new ArrayList<>();//put first 3 item in one into two    22 4r 5g
        for(int i =0; i<3; i++){
            two.add(one.get(i));
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aa");
        list2.add("b");
        list2.add("ac");
        list2.add("ad");
        list2.add("e");
        list2.add("f");
        list2.add("ag");
        ArrayList<String> three = new ArrayList<>();//aa ac ad ag
        for (String name : list2) {
            if(name.startsWith("a")){
                three.add(name);
            }
        }
        ArrayList<String> four = new ArrayList<>();//ad ag
        for (int i = 2; i < three.size(); i++) {
            four.add(three.get(i));//ad ag
        }
        ArrayList<String> all = new ArrayList<>();//combine two list into one
        all.addAll(two);
        all.addAll(four);

        ArrayList<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
        }

        for (Person person : list) {
            System.out.println(person);//22 4r 5g ad ag
        }
    }
}

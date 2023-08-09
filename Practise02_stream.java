package Demo02StreamAndMethodReference;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Practise02_stream {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("22");
        list1.add("3");
        list1.add("4r");
        list1.add("5g");
        list1.add("6");
        list1.add("7h");
        Stream<String> one = list1.stream().filter(name -> name.length() == 2).limit(3);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aa");
        list2.add("b");
        list2.add("ac");
        list2.add("ad");
        list2.add("e");
        list2.add("f");
        list2.add("ag");
        Stream<String> two = list2.stream().filter(name -> name.startsWith("a")).skip(2);

        /*Stream<String> three = Stream.concat(one, two);

        three.forEach(name-> System.out.println(new Person(name)));//22 4r 5g ad ag*/

        Stream.concat(one,two).map(name->new Person(name)).forEach(name-> System.out.println(name));
    }
}

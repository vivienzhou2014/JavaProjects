package Demo02StreamAndMethodReference;

import java.util.stream.Stream;

public class Demo03Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
        /*stream.forEach((String name)->{
            System.out.println(name);
        });*/
        stream.forEach(name-> System.out.println(name));
    }
}

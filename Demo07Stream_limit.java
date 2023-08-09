package Demo02StreamAndMethodReference;

import java.util.stream.Stream;

public class Demo07Stream_limit {
    public static void main(String[] args) {
        String[] arr = {"a","aa","aaa","b"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(3);
        //stream.forEach(name-> System.out.println(name));
        stream1.forEach(name-> System.out.println(name));
    }


}

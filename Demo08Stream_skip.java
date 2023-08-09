package Demo02StreamAndMethodReference;

import java.util.stream.Stream;

public class Demo08Stream_skip {
    public static void main(String[] args) {
        String[] arr = {"a","aa","aaa","b"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(3);
        stream1.forEach(n-> System.out.println(n));
    }
}

package Demo02StreamAndMethodReference;

import java.util.stream.Stream;

public class Demo05Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> integerStream = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        integerStream.forEach((integer -> System.out.println(integer)));
    }
}

package Demo02StreamAndMethodReference;

import java.util.stream.Stream;

public class Demo09Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        String[] arr = {"a","aa","aaa","b"};
        Stream<String> stream2 = Stream.of(arr);
        Stream<String> new_stream = Stream.concat(stream, stream2);
        new_stream.forEach(n-> System.out.println(n));
    }
}

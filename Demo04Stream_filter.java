package Demo02StreamAndMethodReference;

import java.util.stream.Stream;

public class Demo04Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        /*Stream<String> stream2 = stream.filter((String name) -> {
            return name.startsWith("张");
        });*/
        Stream<String> stream2 = stream.filter(name -> name.startsWith("张"));
        stream2.forEach(name-> System.out.println(name));
        //stream.forEach(name-> System.out.println(name));
    }
}

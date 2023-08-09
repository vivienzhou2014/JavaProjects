package Demo01FunctionalInterface;

import java.util.function.Consumer;

public class Demo03PracticeConsumer {
    public static void printInfo(String[] st, Consumer<String> con1, Consumer<String> con2){
        for (String message : st) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Alice,Female", "Belle,Female", "Will,Male"};
        printInfo(arr,(msg)->{
            String name = msg.split(",")[0];
            System.out.print("Name: "+name);
        },(msg)->{
            String age = msg.split(",")[1];
            System.out.println(". Age: "+ age);
        });
    }
}

package Demo02StreamAndMethodReference;

public class Demo01MethodReference_printable {
    public static void printString(MethodReference01_printable p){
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });
        printString(System.out::println);
    }
}

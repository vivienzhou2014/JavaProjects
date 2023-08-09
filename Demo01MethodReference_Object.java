package Demo02StreamAndMethodReference;

public class Demo01MethodReference_Object {
    public static void printString(MethodReference01_printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}

package Demo02StreamAndMethodReference;

public class Demo01MethodReference_Static {
    public static int method(int number, Calcable c){
        return c.calcAbs(number);
    }

    public static void main(String[] args) {
        int number = method(-10, (n) -> {
            return Math.abs(n);
        });
        System.out.println(number);

        System.out.println(method(-20, Math::abs));
    }
}

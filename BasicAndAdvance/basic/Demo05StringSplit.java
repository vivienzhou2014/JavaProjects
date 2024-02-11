package demo07;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str = "aaa.bbb.ccc";
        String[] array = str.split(".");
        System.out.println(array.length);

        String[] array1 = str.split("\\.");
        System.out.println(array1.length);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}

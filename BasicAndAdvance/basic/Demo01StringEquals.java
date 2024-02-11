package demo07;

public class Demo01StringEquals {
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str2));

        String str4 = "hello";
        System.out.println(str4.equals(str2));
        System.out.println(str4.equalsIgnoreCase(str2));

    }
}

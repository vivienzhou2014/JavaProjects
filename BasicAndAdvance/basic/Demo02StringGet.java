package demo07;

public class Demo02StringGet {
    public static void main(String[] args) {
        int length = "sdfgadshgherljoewihgbirjkdnsfkaLBG".length();
        System.out.println(length);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        char ch = "Hello".charAt(1);
        System.out.println(ch);

        String original = "HelloWorld";
        System.out.println(original.indexOf("h"));
        System.out.println(original.indexOf("lo"));
    }
}

package demo07;

public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("First String: "+str1);

        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println("Second String: "+str2);

        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("Third String: "+str3);

    }
}

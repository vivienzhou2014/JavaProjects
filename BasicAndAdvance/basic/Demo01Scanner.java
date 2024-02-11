package demo05;

import java.util.Scanner;

public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("int: " + num);

        String str = sc.next();
        System.out.println("string: " + str);
    }
}

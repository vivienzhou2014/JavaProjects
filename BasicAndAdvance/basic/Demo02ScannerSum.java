package demo06;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        int a = sc.nextInt();
        System.out.println("Input second number:");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("Result is: " + result);
    }
}

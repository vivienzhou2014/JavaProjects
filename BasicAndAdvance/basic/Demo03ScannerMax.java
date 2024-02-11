package demo06;

import java.util.Scanner;

public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number:");
        int a = sc.nextInt();
        System.out.println("Second number:");
        int b = sc.nextInt();
        System.out.println("Third number:");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        System.out.println("The max number is: " + max);
    }
}

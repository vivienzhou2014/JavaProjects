package demo07;

import java.util.Scanner;

public class Demo07StringCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a String: ");
        String str = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            if('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if('a' <= ch && ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNum++;
            }else{
                countOther++;
            }
        }
        System.out.println("Upper: " + countUpper);
        System.out.println("Lower: "+ countLower);
        System.out.println("Number: "+ countNum);
        System.out.println("Other: " + countOther);
    }
}

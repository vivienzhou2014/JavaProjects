package demo06;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; //1~100
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please put in a number: ");
            int guessNum = sc.nextInt();

            if (guessNum > randomNum) {
                System.out.println("Too big! Try again!");
            } else if (guessNum < randomNum) {
                System.out.println("Too small! Try again!");
            } else {
                System.out.println("You got it right!");
                break; //game over
            }
        }

        System.out.println("Game over!");
    }
}

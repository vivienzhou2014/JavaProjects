package Cases;

import java.util.Scanner;

public class JudgesScore {
    /*in singing contest, many judges will score singers, score is integer between 0 and 100,
    * singer final score is average score of subtracting highest and lowest score
    * write a program to record judges' scores and calculate final score*/
    /*analysis:
    1.receiving data? number of judges
    2.returning data? singer's final score
    3.logic define: initiate an array, record scores to array, loop through scores
                    get highest and lowest score, return final score
    * */
    public static void main(String[] args) {
        //target: complete judge score case
        System.out.println("Current singer's score is: " + getAverageScore(6));
    }

    public static double getAverageScore(int number){
        //1.Define a dynamically initialized array, responsible for later storing the judges’ scores.
        int [] scores = new int[number];
        //2. loop through each spot in array, record scores from each judge
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("please record the "+ (i + 1) +"th judge's score: ");
            int score = sc.nextInt();
            scores[i] = score;
        }

        //3. get highest and lowest score
        int sum = 0; //to get total of scores
        int max = scores[0]; // get highest score
        int min = scores[0]; // get lowest score

        //loop though array to get above data
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            //get sum
            sum += score;
            // get max
            if(score > max){
                max = score;
            }
            //get min
            if(score < min){
                min = score;
            }
        }
        //4.get average score and return
        return 1.0 * (sum - min - max) / (number - 2);
    }
}

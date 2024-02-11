package object;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. design a movie class
        //2. design a operator class for movie
        //3. prepare for all movie info
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "a", 38.9, 9.8, "Luke", "Jing", "120,000 people interested");
        movies[1] = new Movie(2, "b", 39, 7.8, "Bai", "Tian", "35,000 people interested");
        movies[2] = new Movie(3, "c", 42, 7.9, "Lan", "Rui", "179,000 people interested");
        movies[3] = new Movie(4, "d", 35, 8.7, "Yu", "Ran", "108,000 people interested");
        // 4. create a movieoperator object, receive movie info and operate
        MovieOperator operator = new MovieOperator(movies);
        /*operator.printAllMovies();
        operator.searchMovieById(3);*/

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===Movie Info System===");
            System.out.println("1. Get all movie info");
            System.out.println("2. Get a movie's detailed info based on Id");
            System.out.println("Please select 1 or 2: ");

            int command = sc.nextInt();
            switch (command){
                case 1:
                    // show all movie info
                    operator.printAllMovies();
                    break;
                case 2:
                    // show one specific movie based on Id
                    System.out.println("Please enter the movie id you want to search for: ");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break;
                default:
                    System.out.println("The command you entered can not be recognized!");
            }
        }
    }
}

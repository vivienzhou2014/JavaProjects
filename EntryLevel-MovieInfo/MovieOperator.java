package object;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    // 1. showing all movies' information in the system  movies=[m1,m2,m3,...]
    public void printAllMovies(){
        System.out.println("-----All movies' information is as follows: -----");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("Id: " + m.getId());
            System.out.println("Name: " + m.getName());
            System.out.println("Price: " + m.getPrice());
            System.out.println("------------------------------");
        }
    }

    // 2. get detailed movie information based on movie id
    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println("The detailed information about the movie you are searching is as below: ");
                System.out.println("Id: " + m.getId());
                System.out.println("Name: " + m.getName());
                System.out.println("Price: " + m.getPrice());
                System.out.println("Score: " + m.getScore());
                System.out.println("Director: " + m.getDirector());
                System.out.println("Main cast: " + m.getActor());
                System.out.println("Other info: " + m.getInfo());
                return; // no need to run this method anymore since we have found what we need
            }
        }
        System.out.println("No related movie information!");
    }
}

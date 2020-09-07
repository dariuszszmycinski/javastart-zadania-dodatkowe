import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MovieDatabase {
    public static void main(String[] args) {
        List<Movie> movielist = createMovieList();
        Comparator<Movie> sortAlgorithm = getSortAlgorithm();
        movielist.sort(sortAlgorithm);
        print(movielist);
    }

    private static List<Movie> createMovieList(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jumanji", "Johnston Joe", 1995, 6.8));
        movies.add(new Movie("The Shawshank Redemption", "Johnston Joe", 1994, 8.75));
        movies.add(new Movie("The Green Mile", "Darabont Frank", 1999, 8.61));
        movies.add(new Movie("Spider Man", "Raimi Sam", 2002, 6.7));
        movies.add(new Movie("Transformers", "Bay Michael", 2007, 7.3));
        movies.add(new Movie("Alien", "Scott Ridley", 1979, 7.8));
        movies.add(new Movie("Home Alone", "Columbus Chris", 1979, 7.1));
        return movies;
    }

    private static Comparator<Movie> getSortAlgorithm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz kryterium sortowania:\n" +
                ">[T]itle\n"+
                ">[R]ating\n"+
                ">[Y]ear");
        String option = sc.nextLine();
        switch (option){
            case "T":
                return Comparator.comparing(Movie::getTitle);
            case "R":
                return Comparator.comparingDouble(Movie::getRating).reversed();
            case "Y":
                return Comparator.comparingInt(Movie::getYear).reversed();
            default:
                System.err.println("Brak takiej opcji. Posortowano alfabetycznie.");
                return Movie::compareTo;
        }
    }

    private static void print(List<Movie> movies){
        System.out.println("Lista filmów:");
        movies.forEach(System.out::println);
    }
}

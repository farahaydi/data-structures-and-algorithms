package sorting;
import java.util.List;
public class App {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("The Shawshank Redemption", 1994, List.of("Drama")),
                new Movie("A Clockwork Orange", 1971, List.of("Crime", "Drama", "Sci-Fi")),
                new Movie("Gladiator", 2000, List.of("Action", "Drama")),
                new Movie("The Godfather", 1972, List.of("Crime", "Drama")),
                new Movie("Avatar", 2009, List.of("Action", "Adventure", "Fantasy", "Sci-Fi"))
        );
        List<Movie> sortedByYear = MovieSorter.sortByRecentYear(movies);
        List<Movie> sortedAlphabetically = MovieSorter.sortAlphabetically(movies);
        System.out.println("Sorted by Year:");
        for (Movie movie : sortedByYear) {
            System.out.println(movie);
        }
        System.out.println("\nSorted Alphabetically:");
        for (Movie movie : sortedAlphabetically) {
            System.out.println(movie);
        }
    }
}
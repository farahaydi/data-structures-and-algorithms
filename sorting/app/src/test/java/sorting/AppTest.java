package sorting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class AppTest {
    @Test
    public void testSortByRecentYear() {
        List<Movie> movies = List.of(
                new Movie("The Shawshank Redemption", 1994, List.of("Drama")),
                new Movie("A Clockwork Orange", 1971, List.of("Crime", "Drama", "Sci-Fi")),
                new Movie("Gladiator", 2000, List.of("Action", "Drama")),
                new Movie("The Godfather", 1972, List.of("Crime", "Drama")),
                new Movie("Avatar", 2009, List.of("Action", "Adventure", "Fantasy", "Sci-Fi"))
        );
        List<Movie> sortedByYear = MovieSorter.sortByRecentYear(movies);

        assertEquals("Avatar", sortedByYear.get(0).title);
        assertEquals("Gladiator", sortedByYear.get(1).title);
        assertEquals("The Shawshank Redemption", sortedByYear.get(2).title);
        assertEquals("The Godfather", sortedByYear.get(3).title);
        assertEquals("A Clockwork Orange", sortedByYear.get(4).title);
    }
    @Test
    public void testSortAlphabetically() {
        List<Movie> movies = List.of(
                new Movie("The Shawshank Redemption", 1994, List.of("Drama")),
                new Movie("A Clockwork Orange", 1971, List.of("Crime", "Drama", "Sci-Fi")),
                new Movie("Gladiator", 2000, List.of("Action", "Drama")),
                new Movie("The Godfather", 1972, List.of("Crime", "Drama")),
                new Movie("Avatar", 2009, List.of("Action", "Adventure", "Fantasy", "Sci-Fi"))
        );
        List<Movie> sortedAlphabetically = MovieSorter.sortAlphabetically(movies);
        assertEquals("Avatar", sortedAlphabetically.get(0).title);
        assertEquals("A Clockwork Orange", sortedAlphabetically.get(1).title);
        assertEquals("Gladiator", sortedAlphabetically.get(2).title);
        assertEquals("The Godfather", sortedAlphabetically.get(3).title);
        assertEquals("The Shawshank Redemption", sortedAlphabetically.get(4).title);
    }
}

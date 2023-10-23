package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class MovieSorter {
    static class CompareByYear implements Comparator<Movie> {
        @Override
        public int compare(Movie a, Movie b) {
            return b.year - a.year;
        }
    }

    static class CompareAlphabetically implements Comparator<Movie> {
        @Override
        public int compare(Movie a, Movie b) {
            String ignoreArticles = "(?i)^(a|an|the)\\s+";
            String titleA = a.title.replaceAll(ignoreArticles, "");
            String titleB = b.title.replaceAll(ignoreArticles, "");

            return titleA.compareToIgnoreCase(titleB);
        }
    }

    public static List<Movie> sortByRecentYear(List<Movie> movies) {
        List<Movie> sortedMovies = new ArrayList<>(movies);
        Collections.sort(sortedMovies, new CompareByYear());
        return sortedMovies;
    }

    public static List<Movie> sortAlphabetically(List<Movie> movies) {
        List<Movie> sortedMovies = new ArrayList<>(movies);
        Collections.sort(sortedMovies, new CompareAlphabetically());
        return sortedMovies;
    }
}
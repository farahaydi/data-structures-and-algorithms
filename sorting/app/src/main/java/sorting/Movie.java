package sorting;

import java.util.List;

public class Movie {
    String title;
    int year;
    List<String> genres;

    public Movie(String title, int year, List<String> genres) {
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genres=" + genres +
                '}';
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    MoviesManager manager1 = new MoviesManager();
    MoviesManager manager2 = new MoviesManager(12);
    MoviesManager manager3 = new MoviesManager(10);
    MoviesManager manager4 = new MoviesManager(16);


    @Test
    public void moviesAdded() {

        manager1.add("movie1");
        manager1.add("movie2");
        manager1.add("movie3");

        String[] actual = manager1.findAll();
        String[] expected = {"movie1", "movie2", "movie3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void listingMoviesOrderTheyWereAdded() {

        manager2.add("movie1");
        manager2.add("movie2");
        manager2.add("movie3");
        manager2.add("movie4");
        manager2.add("movie5");
        manager2.add("movie6");
        manager2.add("movie7");
        manager2.add("movie8");
        manager2.add("movie9");
        manager2.add("movie10");
        manager2.add("movie11");
        manager2.add("movie12");

        String[] actual = manager2.findAll();
        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8",
                "movie9", "movie10", "movie11", "movie12"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void tenLatestAddedMovies() {

        manager3.add("movie1");
        manager3.add("movie2");
        manager3.add("movie3");
        manager3.add("movie4");
        manager3.add("movie5");
        manager3.add("movie6");
        manager3.add("movie7");
        manager3.add("movie8");
        manager3.add("movie9");
        manager3.add("movie10");
        manager3.add("movie11");
        manager3.add("movie12");

        String[] actual = manager3.findLast();
        String[] expected = {"movie12", "movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5",
                "movie4", "movie3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fiveLatestAddedMovies() {

        manager1.add("movie1");
        manager1.add("movie2");
        manager1.add("movie3");
        manager1.add("movie4");
        manager1.add("movie5");

        String[] actual = manager1.findLast();
        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastLimitExceeded() {

        manager4.add("movie1");
        manager4.add("movie2");
        manager4.add("movie3");
        manager4.add("movie4");
        manager4.add("movie5");
        manager4.add("movie6");
        manager4.add("movie7");
        manager4.add("movie8");
        manager4.add("movie9");
        manager4.add("movie10");
        manager4.add("movie11");
        manager4.add("movie12");

        String[] actual = manager4.findLast();
        String[] expected = {"movie12", "movie11", "movie10", "movie9", "movie8", "movie7", "movie6",
                "movie5", "movie4", "movie3", "movie2", "movie1",};

        Assertions.assertArrayEquals(expected, actual);
    }

}

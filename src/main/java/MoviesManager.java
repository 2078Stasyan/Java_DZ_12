public class MoviesManager {

    protected int limit;
    private String[] movies = new String[0];

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public MoviesManager() {
        limit = 10;
    }

    public void add(String films) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = films;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }


    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] lastMovie = new String[resultLength];
        for (int i = 0; i < lastMovie.length; i++) {
            lastMovie[i] = movies[movies.length - 1 - i];
        }
        return lastMovie;
    }

}

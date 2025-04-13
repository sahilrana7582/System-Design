import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Screen {

    private String screenId;
    private String screenName;
    private int numberOfSeats;
    private HashMap<LocalDateTime, Movie> movieMap;
    private List<Seat> seats;

    public Screen(String screenId, String screenName, int numberOfSeats, List<Movie> movies) {
        this.screenId = screenId;
        this.screenName = screenName;
        this.numberOfSeats = numberOfSeats;
        this.movieMap = new HashMap<>();
        initializeSeats();
        initializeMovies(movies); // ✅ Add passed movies to the screen
    }

    public void initializeMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            addMovie(movie);
        }
    }

    public void addMovie(Movie movie) {
        if (movieMap.containsKey(movie.getMovieStartTime())) {
            System.out.println("Movie already scheduled at " + movie.getMovieStartTime());
        } else {
            movieMap.put(movie.getMovieStartTime(), movie);
        }
    }

    private void initializeSeats() {
        seats = new ArrayList<>();
        int premiumSeats = (int) (numberOfSeats * 0.2);
        int semiPremiumSeats = (int) (numberOfSeats * 0.3);
        int generalSeats = numberOfSeats - premiumSeats - semiPremiumSeats;

        for (int i = 1; i <= premiumSeats; i++) {
            seats.add(new Seat("P" + i, "Premium", "Available", "200"));
        }
        for (int i = 1; i <= semiPremiumSeats; i++) {
            seats.add(new Seat("SP" + i, "Semi-Premium", "Available", "150"));
        }
        for (int i = 1; i <= generalSeats; i++) {
            seats.add(new Seat("G" + i, "General", "Available", "100"));
        }
    }

    // Getters and Setters
    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public HashMap<LocalDateTime, Movie> getMovieMap() {
        return movieMap;
    }

    public void setMovieMap(HashMap<LocalDateTime, Movie> movieMap) {
        this.movieMap = movieMap;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}

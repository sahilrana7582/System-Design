import java.time.LocalDateTime;

public class Movie {

    private String movieId;
    private String movieName;
    private String movieDescription;
    private String movieLanguage;
    private String movieGenre;
    private String movieDuration;
    private String movieRating;
    private String movieCast;
    private LocalDateTime movieStartTime;

    public Movie(String movieId, String movieName, String movieDescription, String movieLanguage, String movieGenre,
                 String movieDuration, String movieRating, String movieCast, LocalDateTime movieStartTime) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.movieLanguage = movieLanguage;
        this.movieGenre = movieGenre;
        this.movieDuration = movieDuration;
        this.movieRating = movieRating;
        this.movieCast = movieCast;
        this.movieStartTime = movieStartTime;
    }

    // Getters and Setters
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(String movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieCast() {
        return movieCast;
    }

    public void setMovieCast(String movieCast) {
        this.movieCast = movieCast;
    }

    public LocalDateTime getMovieStartTime() {
        return movieStartTime;
    }

    public void setMovieStartTime(LocalDateTime movieStartTime) {
        this.movieStartTime = movieStartTime;
    }
}

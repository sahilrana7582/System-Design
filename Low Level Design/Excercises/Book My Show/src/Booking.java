import java.time.LocalDateTime;

class Booking {
    private String bookingId;
    private String movieName;
    private String screenName;
    private LocalDateTime showTime;
    private String userName;
    private int seatsBooked;

    public Booking(String bookingId, String movieName, String screenName, LocalDateTime showTime, String userName, int seatsBooked) {
        this.bookingId = bookingId;
        this.movieName = movieName;
        this.screenName = screenName;
        this.showTime = showTime;
        this.userName = userName;
        this.seatsBooked = seatsBooked;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getScreenName() {
        return screenName;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public String getUserName() {
        return userName;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + ", Movie: " + movieName + ", Screen: " + screenName + ", Show Time: " + showTime + ", Seats Booked: " + seatsBooked;
    }
}

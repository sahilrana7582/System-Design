import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // HashMap to store cities
        HashMap<String, City> cityMap = new HashMap<>();

        // Create and add cities
        City city1 = new City("C1", "Mumbai", "400001");
        City city2 = new City("C2", "Delhi", "110001");
        City city3 = new City("C3", "Bangalore", "560001");
        City city4 = new City("C4", "Chennai", "600001");
        City city5 = new City("C5", "Kolkata", "700001");

        addTheatresToCity(city1);
        addTheatresToCity(city2);
        addTheatresToCity(city3);
        addTheatresToCity(city4);
        addTheatresToCity(city5);

        // Add cities to city map
        cityMap.put(city1.getCityId(), city1);
        cityMap.put(city2.getCityId(), city2);
        cityMap.put(city3.getCityId(), city3);
        cityMap.put(city4.getCityId(), city4);
        cityMap.put(city5.getCityId(), city5);

        // Show available cities
        System.out.println("Available Cities: ");
        for (String cityId : cityMap.keySet()) {
            City city = cityMap.get(cityId);
            System.out.println(city.getCityId() + " - " + city.getCityName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the city ID to view its theatres (e.g., C1, C2, C3, C4, C5): ");
        String userCityId = scanner.nextLine();

        City selectedCity = cityMap.get(userCityId);

        if (selectedCity != null) {
            System.out.println("\nYou selected: " + selectedCity.getCityName());
            System.out.println("Theatres in " + selectedCity.getCityName() + ":");

            // Display theatres in selected city
            int count = 1;
            for (Theatre theatre : selectedCity.getTheatres()) {
                System.out.println(count + ". " + theatre.getTheatreName());
                count++;
            }

            System.out.println("\nEnter the number to select a theatre:");
            int theatreSelection = Integer.parseInt(scanner.nextLine()) - 1;

            if (theatreSelection >= 0 && theatreSelection < selectedCity.getTheatres().size()) {
                Theatre selectedTheatre = selectedCity.getTheatres().get(theatreSelection);
                System.out.println("\nYou selected: " + selectedTheatre.getTheatreName());

                // Show available screens in the selected theatre
                System.out.println("\nAvailable Screens in " + selectedTheatre.getTheatreName() + ":");
                List<Screen> screens = selectedTheatre.getScreens();
                for (int i = 0; i < screens.size(); i++) {
                    System.out.println((i + 1) + ". " + screens.get(i).getScreenName());
                    List<Movie> englishMovies = List.of(
                            new Movie("E1", "Inception", "Mind-bending thriller", "English", "Sci-Fi", "2h 28m", "8.8", "Leonardo DiCaprio", LocalDateTime.now().plusHours(1)),
                            new Movie("E2", "Interstellar", "Space-time journey", "English", "Sci-Fi", "2h 49m", "8.6", "Matthew McConaughey", LocalDateTime.now().plusHours(4)),
                            new Movie("E3", "The Dark Knight", "Batman vs Joker", "English", "Action", "2h 32m", "9.0", "Christian Bale", LocalDateTime.now().plusHours(7)),
                            new Movie("E4", "Avengers: Endgame", "Final battle of Avengers", "English", "Superhero", "3h 1m", "8.4", "Robert Downey Jr.", LocalDateTime.now().plusHours(10)),
                            new Movie("E5", "Joker", "Rise of Arthur Fleck", "English", "Drama", "2h 2m", "8.5", "Joaquin Phoenix", LocalDateTime.now().plusHours(13)),
                            new Movie("E6", "Oppenheimer", "Father of atomic bomb", "English", "Biography", "3h", "8.7", "Cillian Murphy", LocalDateTime.now().plusHours(16))
                    );
                    List<Movie> hindiMovies = List.of(
                            new Movie("H1", "3 Idiots", "College life with a twist", "Hindi", "Comedy", "2h 45m", "9.1", "Aamir Khan", LocalDateTime.now().plusHours(2)),
                            new Movie("H2", "Dangal", "Wrestling sisters", "Hindi", "Drama", "2h 41m", "8.4", "Aamir Khan", LocalDateTime.now().plusHours(5)),
                            new Movie("H3", "PK", "Alien questions religion", "Hindi", "Comedy", "2h 33m", "8.1", "Aamir Khan", LocalDateTime.now().plusHours(8)),
                            new Movie("H4", "Pathaan", "Spy thriller", "Hindi", "Action", "2h 26m", "7.0", "Shah Rukh Khan", LocalDateTime.now().plusHours(11)),
                            new Movie("H5", "Drishyam", "Crime mystery", "Hindi", "Thriller", "2h 43m", "8.2", "Ajay Devgn", LocalDateTime.now().plusHours(14)),
                            new Movie("H6", "Zindagi Na Milegi Dobara", "Road trip life lessons", "Hindi", "Drama", "2h 35m", "8.2", "Hrithik Roshan", LocalDateTime.now().plusHours(17))
                    );
                    List<Movie> southMovies = List.of(
                            new Movie("S1", "Bahubali", "Epic tale of two brothers", "Telugu", "Action", "2h 39m", "8.0", "Prabhas", LocalDateTime.now().plusHours(3)),
                            new Movie("S2", "RRR", "Revolutionary warriors", "Telugu", "Action", "3h 7m", "8.3", "Ram Charan, NTR", LocalDateTime.now().plusHours(6)),
                            new Movie("S3", "Pushpa", "Rise of a red sandalwood smuggler", "Telugu", "Action", "2h 59m", "7.9", "Allu Arjun", LocalDateTime.now().plusHours(9)),
                            new Movie("S4", "Vikram", "Undercover cop action", "Tamil", "Action", "2h 54m", "8.4", "Kamal Haasan", LocalDateTime.now().plusHours(12)),
                            new Movie("S5", "KGF: Chapter 2", "Kolar Gold Fields saga", "Kannada", "Action", "2h 48m", "8.3", "Yash", LocalDateTime.now().plusHours(15)),
                            new Movie("S6", "Jailer", "Father’s revenge", "Tamil", "Action", "2h 30m", "7.9", "Rajinikanth", LocalDateTime.now().plusHours(18))
                    );
                    if(screens.get(i).getScreenName().equals("Hollywood Screen"))
                    {

                        screens.get(i).initializeMovies(englishMovies);
                    }else if(screens.get(i).getScreenName().equals("Bollywood Screen"))
                    {

                        screens.get(i).initializeMovies(hindiMovies);
                    }else if(screens.get(i).getScreenName().equals("Tollywood Screen"))
                    {

                        screens.get(i).initializeMovies(southMovies);
                    }
                }

                // Get user input for screen selection
                System.out.println("\nEnter the number to select a screen:");
                int screenSelection = Integer.parseInt(scanner.nextLine()) - 1;

                if (screenSelection >= 0 && screenSelection < screens.size()) {
                    Screen selectedScreen = screens.get(screenSelection);
                    System.out.println("\nYou selected: " + selectedScreen.getScreenName());

                    List<Movie> movies = selectedScreen.getMovieMap().values().stream().collect(Collectors.toList());

                    if (movies != null && !movies.isEmpty()) {
                        System.out.println("\nMovies playing on " + selectedScreen.getScreenName() + ":");
                        for (Movie movie : movies) {
                            System.out.println("------------------------------------------------");
                            System.out.println("Movie Name: " + movie.getMovieName());
                            System.out.println("Description: " + movie.getMovieDescription());
                            System.out.println("Language: " + movie.getMovieLanguage());
                            System.out.println("Genre: " + movie.getMovieGenre());
                            System.out.println("Duration: " + movie.getMovieDuration());
                            System.out.println("Rating: " + movie.getMovieRating());
                            System.out.println("Cast: " + movie.getMovieCast());
                            System.out.println("Show Time: " + movie.getMovieStartTime());
                        }
                        System.out.println("------------------------------------------------");

                        // Booking part
                        System.out.println("\nEnter the number to book a movie:");
                        int movieSelection = Integer.parseInt(scanner.nextLine()) - 1;

                        if (movieSelection >= 0 && movieSelection < movies.size()) {
                            Movie selectedMovie = movies.get(movieSelection);
                            System.out.println("\nYou selected: " + selectedMovie.getMovieName());

                            // Get user name and number of seats to book
                            System.out.println("Enter your name: ");
                            String userName = scanner.nextLine();

                            System.out.println("Enter number of seats to book: ");
                            int seatsToBook = Integer.parseInt(scanner.nextLine());

                            // Generate booking ID (using UUID)
                            String bookingId = UUID.randomUUID().toString();

                            // Create a booking instance
                            Booking booking = new Booking(bookingId, selectedMovie.getMovieName(), selectedScreen.getScreenName(), selectedMovie.getMovieStartTime(), userName, seatsToBook);

                            // Confirm the booking
                            System.out.println("\nBooking Confirmed!");
                            System.out.println(booking);

                        } else {
                            System.out.println("\nInvalid movie selection.");
                        }

                    } else {
                        System.out.println("No movies available on this screen.");
                    }

                } else {
                    System.out.println("\nInvalid screen selection.");
                }



            } else {
                System.out.println("\nInvalid theatre selection.");
            }
        } else {
            System.out.println("\nInvalid City ID.");
        }

        scanner.close();
    }

    // Method to add theatres to a city
    private static void addTheatresToCity(City city) {
        if (city.getCityId().equals("C1")) {
            Theatre theatre1 = new Theatre("T1", "PVR Cinemas", city);
            city.addTheatre(theatre1);

            Theatre theatre2 = new Theatre("T2", "INOX", city);
            city.addTheatre(theatre2);

            Theatre theatre3 = new Theatre("T3", "Cinepolis", city);

            city.addTheatre(theatre3);
        }
    }
}

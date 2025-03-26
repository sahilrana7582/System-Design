import Without_Fascade.DVDPlayer;
import Without_Fascade.HomeTheature;
import Without_Fascade.Light;
import Without_Fascade.MovieSelection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * What is the Fascade Design Pattern?
        * Fascade design pattern give the very simplified version for the client. So, the client can
        * interact with the code to get the result.
        *
        *
        *
        * */

        // Before Fascade Design Pattern


        DVDPlayer dvdPlayer = new DVDPlayer();
        MovieSelection movieSelection = new MovieSelection();
        Light light = new Light();

        dvdPlayer.on();
        movieSelection.movieSelection();
        light.on();
        movieSelection.movieSelection();
        System.out.println("Moving Watching Movie");
        light.off();
        dvdPlayer.off();
        System.out.println("Movie Watched");

        System.out.println("--------------------------------------");

        System.out.println("With Fascade Design Pattern");
        HomeTheature homeTheature = new HomeTheature();

        homeTheature.watchMovie();
        homeTheature.endMovie();
    }




}
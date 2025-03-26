package Simple_Home_Theature_Example;

public class HomeTheature {

    private DVDPlayer dvdPlayer;
    private MovieSelection movieSelection;
    private Light light;
    public HomeTheature(){
        this.dvdPlayer = new DVDPlayer();
        this.movieSelection = new MovieSelection();
        this.light = new Light();
    }


    public void watchMovie(){
        dvdPlayer.on();
        movieSelection.movieSelection();
        light.on();
        movieSelection.movieSelection();
        System.out.println("Moving Watching Movie");
    }

    public  void endMovie(){
        light.off();
        dvdPlayer.off();
        System.out.println("Movie Watched");
    }
}

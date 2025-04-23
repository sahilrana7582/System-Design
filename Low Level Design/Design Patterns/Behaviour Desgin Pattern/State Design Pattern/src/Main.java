//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.pressPlay();  // “Starting playback”
        player.pressPause(); // “Pausing playback”
        player.pressPlay();  // “Resuming playback”
        player.pressStop();  // “Stopping playback”

    }
}
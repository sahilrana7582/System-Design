public class PlayingState implements MusicPlayerState {


    @Override
    public void play(MusicPlayer musicPlayer) {
        System.out.println("Already playing");

    }

    @Override
    public void stop(MusicPlayer musicPlayer) {
        System.out.println("Stopping playback");
        musicPlayer.setState(new ReadyState());
    }

    @Override
    public void pause(MusicPlayer musicPlayer) {
        System.out.println("Pausing playback");
        musicPlayer.setState(new PausedState());
    }
}
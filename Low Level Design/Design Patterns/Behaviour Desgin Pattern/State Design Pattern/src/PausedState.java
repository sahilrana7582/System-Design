public class PausedState implements MusicPlayerState {


    @Override
    public void play(MusicPlayer musicPlayer) {
        System.out.println("Resuming playback");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void stop(MusicPlayer musicPlayer) {
        System.out.println("Stopping playback");
        musicPlayer.setState(new ReadyState());
    }

    @Override
    public void pause(MusicPlayer musicPlayer) {
        System.out.println("Already paused");

    }
}
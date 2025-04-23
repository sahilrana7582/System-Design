public class PlayState implements MusicPlayerState {
    @Override
    public void play(MusicPlayer musicPlayer) {
        System.out.println("Music is playing");
        musicPlayer.setState(new PausedState());


    }

    @Override
    public void stop(MusicPlayer musicPlayer) {
        System.out.println("Music is stopped");

    }

    @Override
    public void pause(MusicPlayer musicPlayer) {
        System.out.println("Music is paused");

    }
}

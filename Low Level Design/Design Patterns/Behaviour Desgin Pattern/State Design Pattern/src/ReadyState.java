public class ReadyState implements MusicPlayerState {
    @Override
    public void play(MusicPlayer player) {
        System.out.println("Starting playback");
        player.setState(new PlayingState());
    }
    @Override public void stop(MusicPlayer player) { /* no-op */ }
    @Override public void pause(MusicPlayer player)  { /* no-op */ }
}
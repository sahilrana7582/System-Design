public class MusicPlayer {
    private MusicPlayerState state;

    public MusicPlayer() {
        state = new ReadyState();
    }

    public void setState(MusicPlayerState state) {
        this.state = state;
    }

    // User actions delegate to current state
    public void pressPlay()  { state.play(this);  }
    public void pressPause() { state.pause(this); }
    public void pressStop()  { state.stop(this);  }
}

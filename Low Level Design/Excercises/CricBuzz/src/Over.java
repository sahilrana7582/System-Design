import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single over in a cricket match.
 */
public class Over {

    private final int overNumber;
    private final List<Ball> balls;
    private final Player bowler;
    private Scorecard scorecard;

    private static final int MAX_BALLS = 6;

    public Over(int overNumber, Player bowler, Scorecard scorecard) {
        this.overNumber = overNumber;
        this.balls = new ArrayList<>();
        this.bowler = bowler;
    }

    public void addBall(Ball ball) {
        if (isComplete()) {
            throw new IllegalStateException("Over is already complete");
        }
        balls.add(ball);
        scorecard.updateWithBall(ball);
    }

    public boolean isComplete() {
        // You can add logic to only count legal deliveries
        return balls.size() >= MAX_BALLS;
    }

    public int getTotalRuns() {
        return balls.stream().mapToInt(b -> b.getRun() + b.getExtra()).sum();
    }

    public int getWicketsInOver() {
        return balls.stream().mapToInt(Ball::getWicket).sum();
    }

    public List<Ball> getBalls() {
        return new ArrayList<>(balls); // defensive copy
    }

    public Player getBowler() {
        return bowler;
    }

    public int getOverNumber() {
        return overNumber;
    }

    @Override
    public String toString() {
        return String.format("Over %d by %s: %d balls, %d runs, %d wickets",
                overNumber, bowler.getName(), balls.size(), getTotalRuns(), getWicketsInOver());
    }
}

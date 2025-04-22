import java.util.logging.Logger;

/**
 * Mutable Scorecard class for ball-by-ball updates in a cricket match.
 */
public class Scorecard {

    private int currentScore;
    private int totalScore;
    private int wicketDown;
    private int overNumber;
    private int totalOver;

    private static final Logger LOG = Logger.getLogger(Scorecard.class.getName());

    public Scorecard() {
        this.totalOver = 0;
        this.totalOver = totalOver;
        this.currentScore = 0;
        this.totalScore = 0;
        this.wicketDown = 0;
        this.overNumber = 1;
    }

    // Setters
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setWicketDown(int wicketDown) {
        if (wicketDown < 0 || wicketDown > 10) {
            throw new IllegalArgumentException("Wickets down must be between 0 and 10");
        }
        this.wicketDown = wicketDown;
    }

    public void setOverNumber(int overNumber) {
        if (overNumber < 0 || overNumber > totalOver) {
            throw new IllegalArgumentException("Invalid over number");
        }
        this.overNumber = overNumber;
    }

    public void setTotalOver(int totalOver) {
        if (totalOver <= 0) {
            throw new IllegalArgumentException("Total overs must be positive");
        }
        this.totalOver = totalOver;
    }

    // Getters
    public int getCurrentScore() {
        return currentScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getWicketDown() {
        return wicketDown;
    }

    public int getOverNumber() {
        return overNumber;
    }

    public void updateWithBall(Ball ball) {
        int runsFromBall = ball.getRun() + ball.getExtra();
        this.currentScore += runsFromBall;

        if (ball.getWicket() == 1) {
            this.wicketDown++;
        }

        if(ball.getFour() == 1) {
            this.totalScore += 4;
        }

        if(ball.getSix() == 1) {
            this.totalScore += 6;
        }

        this.totalScore += runsFromBall;
    }


    public int getTotalOver() {
        return totalOver;
    }

    public void printCurrentSummary() {
        LOG.info(String.format("Current Score: %d, Wickets Down: %d, Over: %d/%d",
                currentScore, wicketDown, overNumber, totalOver));
    }

    @Override
    public String toString() {
        return String.format("Scorecard[Current Score=%d, Total Score=%d, Wickets=%d, Over=%d/%d]",
                currentScore, totalScore, wicketDown, overNumber, totalOver);
    }
}

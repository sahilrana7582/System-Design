import java.util.ArrayList;
import java.util.List;

public class Ininning {

    private int inningNumber;
    private Team team1;
    private Team team2;
    private int totalOvers;
    private List<Over> overs;
    private Scorecard scorecard;

    public Ininning(int inningNumber, Team team1, Team team2, int totalOvers, Scorecard scorecard) {
        this.inningNumber = inningNumber;
        this.team1 = team1;
        this.team2 = team2;
        this.totalOvers = totalOvers;
        this.overs = new ArrayList<>();
        this.scorecard = scorecard;
    }

    public boolean addOver(Over over) {
        if (overs.size() >= totalOvers) {
            System.out.println("Inning already completed. Can't add more overs.");
            return false;
        }

        overs.add(over);
        return true;
    }

    public void currentScoreCard() {
        scorecard.printCurrentSummary();
    }

    public boolean isInningComplete() {
        return overs.size() >= totalOvers || scorecard.getWicketDown() >= 10;
    }

    public int getTotalRuns() {
        return scorecard.getCurrentScore();
    }

    public int getWickets() {
        return scorecard.getWicketDown();
    }

    public int getOversBowled() {
        return overs.size();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Match {

    private Team team1;
    private Team team2;
    private int matchNumber;
    public List<Ininning> innings;
    private int currentInningIndex;

    public Match(Team team1, Team team2, int matchNumber) {
        this.team1 = team1;
        this.team2 = team2;
        this.matchNumber = matchNumber;
        this.innings = new ArrayList<>();
        this.currentInningIndex = -1;
    }

    public void startFirstInning(int totalOvers, Scorecard scorecard) {
        Ininning firstInning = new Ininning(1, team1, team2, totalOvers, scorecard);
        scorecard.setTotalOver(totalOvers);
        innings.add(firstInning);
        currentInningIndex = 0;
    }

    public void startSecondInning(int totalOvers, Scorecard scorecard) {
        Ininning secondInning = new Ininning(2, team2, team1, totalOvers, scorecard);
        scorecard.setTotalOver(totalOvers);
        innings.add(secondInning);
        currentInningIndex = 1;
    }

    public boolean addOverToCurrentInning(Over over) {
        if (currentInningIndex >= 0 && currentInningIndex < innings.size()) {
            return innings.get(currentInningIndex).addOver(over);
        }
        return false;
    }

    public void printCurrentInningScore() {
        if (currentInningIndex >= 0 && currentInningIndex < innings.size()) {
            innings.get(currentInningIndex).currentScoreCard();
        }
    }

    public void printMatchSummary() {
        System.out.println("Match #" + matchNumber + " Summary:");
        for (Ininning inning : innings) {
            System.out.println("Inning " + inning.getTotalRuns() + "/" + inning.getWickets()
                    + " in " + inning.getOversBowled() + " overs");
        }
    }

    public boolean isMatchOver() {
        return innings.size() == 2 && innings.get(1).isInningComplete();
    }
}

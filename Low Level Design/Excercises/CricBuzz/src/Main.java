import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create players for both teams with realistic cricket player data
        List<Player> indianPlayers = createIndianTeam();
        List<Player> australianPlayers = createAustralianTeam();

        // Create teams and add players
        Team india = new Team("India");
        Team australia = new Team("Australia");

        // Add players to teams
        for (Player player : indianPlayers) {
            india.addPlayer(player);
        }

        for (Player player : australianPlayers) {
            australia.addPlayer(player);
        }

        // Create match (India vs Australia)
        Match match = new Match(india, australia, 1);

        // Simulate first innings (India batting)
        System.out.println("\n===== MATCH STARTS: INDIA VS AUSTRALIA =====");
        System.out.println("\n===== FIRST INNINGS: INDIA BATTING =====");

        Scorecard scorecard1 = new Scorecard();
        match.startFirstInning(20, scorecard1); // T20 match with 20 overs

        // Current batsmen for India
        Player striker = indianPlayers.get(0);  // Opener 1
        Player nonStriker = indianPlayers.get(1);  // Opener 2
        int nextBatsmanIndex = 2;

        // Simulate first innings
        simulateInnings(match, australianPlayers, striker, nonStriker, nextBatsmanIndex, indianPlayers, scorecard1, 20);

        int target = scorecard1.getCurrentScore() + 1;
        System.out.println("\nIndia finished with " + scorecard1.getCurrentScore() + "/" + scorecard1.getWicketDown()
                + " in " + match.innings.get(0).getOversBowled() + " overs");
        System.out.println("Australia needs " + target + " runs to win!");

        // Simulate second innings (Australia batting)
        System.out.println("\n===== SECOND INNINGS: AUSTRALIA BATTING =====");
        System.out.println("Target: " + target + " runs");

        Scorecard scorecard2 = new Scorecard();
        match.startSecondInning(20, scorecard2);

        // Current batsmen for Australia
        striker = australianPlayers.get(0);  // Opener 1
        nonStriker = australianPlayers.get(1);  // Opener 2
        nextBatsmanIndex = 2;

        // Simulate second innings
        simulateInnings(match, indianPlayers, striker, nonStriker, nextBatsmanIndex, australianPlayers, scorecard2, 20);

        // Print match summary and result
        System.out.println("\n===== MATCH SUMMARY =====");
        System.out.println("India: " + scorecard1.getCurrentScore() + "/" + scorecard1.getWicketDown()
                + " in " + match.innings.get(0).getOversBowled() + " overs");
        System.out.println("Australia: " + scorecard2.getCurrentScore() + "/" + scorecard2.getWicketDown()
                + " in " + match.innings.get(1).getOversBowled() + " overs");

        // Determine winner
        if (scorecard2.getCurrentScore() >= target) {
            int wicketsRemaining = 10 - scorecard2.getWicketDown();
            System.out.println("\nAustralia wins by " + wicketsRemaining + " wickets!");
        } else if (scorecard2.getCurrentScore() < target - 1) {
            int runsShort = target - 1 - scorecard2.getCurrentScore();
            System.out.println("\nIndia wins by " + runsShort + " runs!");
        } else {
            System.out.println("\nMatch ended in a tie!");
        }
    }

    private static void simulateInnings(Match match, List<Player> bowlingTeam, Player striker, Player nonStriker,
                                        int nextBatsmanIndex, List<Player> battingTeam, Scorecard scorecard, int totalOvers) {
        Random rand = new Random();

        for (int overNum = 1; overNum <= totalOvers; overNum++) {
            // Select a bowler
            Player bowler = selectBowler(bowlingTeam, overNum);
            System.out.println("\nOver " + overNum + ": Bowled by " + bowler.getName());

            // Create new over
            Over over = new Over(overNum, bowler, scorecard);

            // Simulate balls in the over
            for (int ballNum = 1; ballNum <= 6; ballNum++) {
                // Check if innings is over (all out)
                if (scorecard.getWicketDown() >= 10) {
                    System.out.println("All out! Innings completed.");
                    break;
                }

                // Determine ball outcome based on batsman and bowler skills
                int runChance = rand.nextInt(100);
                int wicketChance = rand.nextInt(100);

                // Build the ball
                Ball.Builder ballBuilder = new Ball.Builder()
                        .speed(rand.nextInt(50) + 120); // Speed between 120-170 km/h

                // Process ball outcome
                if (wicketChance < 8) { // ~8% chance of wicket
                    // WICKET
                    ballBuilder.wicket(1).run(0);
                    Ball ball = ballBuilder.build();
                    over.addBall(ball);

                    System.out.println("Ball " + ballNum + ": WICKET! " + striker.getName() + " is out!");

                    // Get next batsman if available
                    if (nextBatsmanIndex < battingTeam.size() && nextBatsmanIndex < 11) {
                        striker = battingTeam.get(nextBatsmanIndex);
                        nextBatsmanIndex++;
                        System.out.println("New batsman: " + striker.getName());
                    }
                } else {
                    // Determine runs
                    int runs = 0;
                    boolean isSix = false;
                    boolean isFour = false;

                    if (runChance < 50) { // 50% chance of 0 runs
                        runs = 0;
                    } else if (runChance < 70) { // 20% chance of 1 run
                        runs = 1;
                    } else if (runChance < 80) { // 10% chance of 2 runs
                        runs = 2;
                    } else if (runChance < 85) { // 5% chance of 3 runs
                        runs = 3;
                    } else if (runChance < 95) { // 10% chance of 4 runs
                        runs = 4;
                        isFour = true;
                    } else { // 5% chance of 6 runs
                        runs = 6;
                        isSix = true;
                    }

                    // Update ball information
                    ballBuilder.run(runs);
                    if (isFour) ballBuilder.four(1);
                    if (isSix) ballBuilder.six(1);

                    Ball ball = ballBuilder.build();
                    over.addBall(ball);

                    // Update batsman stats
                    striker.updateRuns(runs);

                    // Print ball result
                    String runDisplay = runs + (runs == 1 ? " run" : " runs");
                    if (isFour) runDisplay += " (FOUR!)";
                    if (isSix) runDisplay += " (SIX!)";
                    System.out.println("Ball " + ballNum + ": " + striker.getName() + " scores " + runDisplay);

                    // Rotate strike if odd runs
                    if (runs % 2 == 1) {
                        Player temp = striker;
                        striker = nonStriker;
                        nonStriker = temp;
                    }
                }

                // Display current score after each ball
                System.out.println("Score: " + scorecard.getCurrentScore() + "/" + scorecard.getWicketDown());
            }

            // Add over to the innings
            match.addOverToCurrentInning(over);

            // Display over summary
            System.out.println("End of Over " + overNum + ": " + scorecard.getCurrentScore() + "/" +
                    scorecard.getWicketDown() + " (" + striker.getName() + " " +
                    striker.getRunsScored() + "*, " + nonStriker.getName() + " " +
                    nonStriker.getRunsScored() + "*)");

            // Rotate strike at the end of over
            Player temp = striker;
            striker = nonStriker;
            nonStriker = temp;
        }
    }

    private static Player selectBowler(List<Player> team, int overNumber) {
        return team.get(0);
    }

    private static List<Player> createIndianTeam() {
        List<Player> players = new ArrayList<>();

        // Add players with realistic names and roles
        players.add(new Player("Rohit Sharma", 34, PlayerRole.BATSMAN));
        players.add(new Player("KL Rahul", 29, PlayerRole.BATSMAN));
        players.add(new Player("Virat Kohli", 33, PlayerRole.BATSMAN));
        players.add(new Player("Rishabh Pant", 24, PlayerRole.BATSMAN));
        players.add(new Player("Suryakumar Yadav", 31, PlayerRole.BATSMAN));
        players.add(new Player("Hardik Pandya", 28, PlayerRole.ALLROUNDER));
        players.add(new Player("Ravindra Jadeja", 33, PlayerRole.ALLROUNDER));
        players.add(new Player("R Ashwin", 35, PlayerRole.BOWLER));
        players.add(new Player("Mohammed Shami", 31, PlayerRole.BOWLER));
        players.add(new Player("Jasprit Bumrah", 28, PlayerRole.BOWLER));
        players.add(new Player("Yuzvendra Chahal", 31, PlayerRole.BOWLER));

        return players;
    }

    private static List<Player> createAustralianTeam() {
        List<Player> players = new ArrayList<>();

        // Add players with realistic names and roles
        players.add(new Player("David Warner", 35, PlayerRole.BATSMAN));
        players.add(new Player("Aaron Finch", 35, PlayerRole.BATSMAN));
        players.add(new Player("Steve Smith", 32, PlayerRole.BATSMAN));
        players.add(new Player("Glenn Maxwell", 33, PlayerRole.ALLROUNDER));
        players.add(new Player("Marcus Stoinis", 32, PlayerRole.ALLROUNDER));
        players.add(new Player("Alex Carey", 30, PlayerRole.BATSMAN));
        players.add(new Player("Pat Cummins", 28, PlayerRole.BOWLER));
        players.add(new Player("Mitchell Starc", 32, PlayerRole.BOWLER));
        players.add(new Player("Josh Hazlewood", 31, PlayerRole.BOWLER));
        players.add(new Player("Adam Zampa", 30, PlayerRole.BOWLER));
        players.add(new Player("Nathan Lyon", 34, PlayerRole.BOWLER));

        return players;
    }
}
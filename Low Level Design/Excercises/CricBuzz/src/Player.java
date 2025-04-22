public class Player {

    private String name;
    private int age;
    private PlayerRole role;
    private int runsScored;   // for batsman
    private int wicketsTaken; // for bowler
    private int ballsFaced;   // for batsman
    private int ballsBowled;  // for bowler

    public Player(String name, int age, PlayerRole role) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.runsScored = 0;
        this.wicketsTaken = 0;
        this.ballsFaced = 0;
        this.ballsBowled = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PlayerRole getRole() {
        return role;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public int getBallsBowled() {
        return ballsBowled;
    }

    // Add methods to update stats based on the game
    public void updateRuns(int runs) {
        this.runsScored += runs;
        this.ballsFaced++;
    }

    public void updateWickets() {
        this.wicketsTaken++;
        this.ballsBowled++;
    }
}

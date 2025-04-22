import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    public String getName() {
        return this.name;
    }

    // Get a player by name
    public Player getPlayerByName(String playerName) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                return player;
            }
        }
        return null; // Player not found
    }

    // Get total runs scored by all players
    public int getTotalRuns() {
        int totalRuns = 0;
        for (Player player : players) {
            totalRuns += player.getRunsScored();
        }
        return totalRuns;
    }

    // Get total wickets taken by all players
    public int getTotalWickets() {
        int totalWickets = 0;
        for (Player player : players) {
            totalWickets += player.getWicketsTaken();
        }
        return totalWickets;
    }

    // Get all players for a specific role
    public List<Player> getPlayersByRole(PlayerRole role) {
        List<Player> rolePlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getRole() == role) {
                rolePlayers.add(player);
            }
        }
        return rolePlayers;
    }
}

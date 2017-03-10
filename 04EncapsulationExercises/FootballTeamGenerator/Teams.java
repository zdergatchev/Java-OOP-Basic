package FootballTeamGenerator;

import java.util.HashMap;

public class Teams {
    HashMap<String, Team> teamsMap;

    public Teams() {
        this.teamsMap = new HashMap<>();
    }

    public void addPlayerToTeam(String teamName, String playerName, int endurance
            , int sprint, int dribble, int passing, int shooting) {
        if (!this.teamsMap.containsKey(teamName)) {
            throw new IllegalArgumentException("Team " + teamName + " does not exist.");
        }
        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
        this.teamsMap.get(teamName).addPlayer(player);
    }

    public void removePlayerFromTeam(String teamName, String playerName) {
        if (!this.teamsMap.containsKey(teamName)) {
            throw new IllegalArgumentException("Team " + teamName + " does not exist.");
        }
        this.teamsMap.get(teamName).removePlayer(playerName);
    }

    public Double getAverageStat(String teamName) {
        if (!this.teamsMap.containsKey(teamName)) {
            throw new IllegalArgumentException("Team " + teamName + " does not exist.");
        }

        return this.teamsMap.get(teamName).getPlayersMap().entrySet().stream()
                .mapToDouble(p -> (p.getValue().getAverageStat())).average().orElse(0d);

    }

    public void addTeam(String teamName) {
        if (!this.teamsMap.containsKey(teamName)) {
            Team team = new Team(teamName);
            this.teamsMap.put(teamName, team);
        }
    }
}

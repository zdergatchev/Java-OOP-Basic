package FootballTeamGenerator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;
    private HashMap<String, Player> playersMap;

    public Team(String name) {
        setName(name);
        this.playersMap = new HashMap<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public Map<String, Player> getPlayersMap() {
        return Collections.unmodifiableMap(this.playersMap);
    }

    public void addPlayer(Player player) {
        this.playersMap.put(player.getName(), player);
    }

    public void removePlayer(String playerName) {
        if (!this.playersMap.containsKey(playerName)) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name + " team.");
        }
        this.playersMap.remove(playerName);
    }
}

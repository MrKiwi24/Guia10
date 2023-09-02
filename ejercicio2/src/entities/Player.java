package entities;

public class Player {
    private int playerID;
    private String playerName;
    private boolean isSoaked;

    public Player(int playerID, String playerName, boolean isSoaked) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.isSoaked = isSoaked;
    }

    public Player() {
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isSoaked() {
        return isSoaked;
    }

    public void setSoaked(boolean soaked) {
        isSoaked = soaked;
    }
}

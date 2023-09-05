import services.GameService;

import java.util.ArrayList;

public class Main {
    public static GameService gameService = new GameService();
    public static void main(String[] args) {
        gameService.createNewGame();
    }
}
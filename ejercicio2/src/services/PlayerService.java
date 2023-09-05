package services;

import entities.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerService {

    Scanner read = new Scanner(System.in);
    public ArrayList<Player> loadPlayers(){
        int numberOfPlayers;
        int count = 1;
        ArrayList<Player> players = new ArrayList<>();

        while (true){
            System.out.println("in: number of players (min 2, up to 6)");
            numberOfPlayers = Integer.parseInt(read.nextLine());

            if(numberOfPlayers <= 6 && numberOfPlayers >= 2){
                break;
            }
            else {
                System.out.println("Incorrect number of players. Try again");
            }
        }

        for(int i = 0; i < 6; i++){
            String playerName = "Player";

            if (count <= numberOfPlayers){
                Player player = new Player();
                player.setPlayerID(count);
                playerName = playerName.concat(String.valueOf(count));
                player.setPlayerName(playerName);
                count ++;
                players.add(player);

            } else {
                count = 1;
                i --;
            }
        }


        return players;
    }
}

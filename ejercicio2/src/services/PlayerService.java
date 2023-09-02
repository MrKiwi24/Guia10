package services;

import entities.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerService {

    Scanner read = new Scanner(System.in);
    public ArrayList<Player> loadPlayers(){
        ArrayList<Player> players = new ArrayList<>();

        while (true){
            System.out.println("in: number of players (up to 6)");
            int numberOfPlayers = Integer.parseInt(read.nextLine());

            if(numberOfPlayers <= 6 || numberOfPlayers >= 1){
                break;
            }
            else {
                System.out.println("Incorrect number of players. Try again");
            }
        }




        return players;
    }
}

import entities.WaterGun;
import services.WaterGunService;

import java.util.ArrayList;

public class Main {
    public static WaterGunService waterGunService = new WaterGunService();
    public static ArrayList<WaterGun> loadedGun = waterGunService.loadGun();
    public static void main(String[] args) {

        for(int i = 0; i < loadedGun.size(); i++){
            System.out.println("Chamber n.:" + loadedGun.get(i).getCurrentChamber());
            System.out.println("Is loaded?: " + loadedGun.get(i).isLoaded());
            System.out.println();
        }
    }
}
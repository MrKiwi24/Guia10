package entities;

import java.util.ArrayList;

public class WaterGun {
    private int currentChamber;
    private boolean isLoaded;

    public WaterGun() {
    }

    public WaterGun(int currentChamber, boolean isLoaded) {
        this.currentChamber = currentChamber;
        this.isLoaded = isLoaded;
    }

    public int getCurrentChamber() {
        return currentChamber;
    }

    public void setCurrentChamber(int currentChamber) {
        this.currentChamber = currentChamber;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
}

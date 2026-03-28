package model;

import java.util.List;

public class Game {
    
    private List<Player> players ;
    private WaterGun waterGun;

    public Game() {
    }

    public Game(List<Player> players, WaterGun waterGun) {
        this.players = players;
        this.waterGun = waterGun;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public WaterGun getWaterGun() {
        return waterGun;
    }

    public void setWaterGun(WaterGun waterGun) {
        this.waterGun = waterGun;
    }
    
    
}

package service;

import interfaces.IGame;
import java.util.List;
import model.Game;
import model.Player;
import model.WaterGun;

public class GameService implements IGame{

    @Override
    public void fillGame(List<Player> players, WaterGun waterGun,Game game) {
        game.setPlayers(players);
        game.setWaterGun(waterGun);
    }

    @Override
    public Boolean round(Game game) {
        
        List<Player> playerInGame = game.getPlayers();
        PlayerService ps = new PlayerService(); 
        WaterGun wg = game.getWaterGun();

        while (true) { 
            for (Player player : playerInGame) {
                Boolean gotWet = ps.shot(player, wg);
                if (gotWet) {
                    System.out.println(player.getName() + " ha sido mojado, fin del juego.");
                    return true;
                }
            }
        }
        

    }
    
}

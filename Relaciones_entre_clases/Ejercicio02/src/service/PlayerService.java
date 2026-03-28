package service;

import interfaces.IPlayer;
import model.Player;
import model.WaterGun;

public class PlayerService implements IPlayer{
    WaterGunService gunService = new WaterGunService();

    @Override
    public Boolean shot(Player player, WaterGun waterGun) {
        if(player.getDamp()) return false;
        
        Boolean gotWet = gunService.toGetWet(waterGun);
        player.setDamp(gotWet);
        gunService.nextSquirt(waterGun);
        return gotWet;

    }
    
}

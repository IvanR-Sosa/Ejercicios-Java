package service;

import interfaces.IWaterGun;
import java.util.Random;
import model.WaterGun;

public class WaterGunService implements IWaterGun{

    @Override
    public void toFillTheWaterGun(WaterGun waterGun) {
        Random random = new Random();
        Integer wPosition =random.nextInt(6) +1;
        Integer cPosition;
        waterGun.setWaterPosition(wPosition) ;
        do {            
            cPosition = random.nextInt(6) + 1;
        } while (cPosition == wPosition);
        waterGun.setCurrentPosition(cPosition);
        
    }

    @Override
    public Boolean toGetWet(WaterGun waterGun) {
        if (waterGun.getCurrentPosition() == waterGun.getWaterPosition()) return true;
        return false;
    }

    @Override
    public void nextSquirt(WaterGun waterGun) {
        if (waterGun.getCurrentPosition() == 6) {
            waterGun.setCurrentPosition(1);
        }else{
            waterGun.setCurrentPosition(waterGun.getCurrentPosition()+1);
        }
       
    }
    
}

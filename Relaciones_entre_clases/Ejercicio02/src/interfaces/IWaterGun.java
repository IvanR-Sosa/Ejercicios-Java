package interfaces;

import model.WaterGun;

public interface IWaterGun {
    
    void toFillTheWaterGun(WaterGun waterGun);
    Boolean toGetWet (WaterGun waterGun);
    void nextSquirt(WaterGun waterGun);
    
}

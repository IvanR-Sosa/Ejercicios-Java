package interfaces;

import java.util.List;
import model.Game;
import model.Player;
import model.WaterGun;

public interface IGame {
    void fillGame(List<Player> players,WaterGun waterGun,Game game);
    Boolean round (Game  game);
}

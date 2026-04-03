package interfaces;

import model.Cinema;
import model.Screen;
import model.Spectator;

public interface ICinema {

    Boolean occupiedScreen (Spectator spectator,Cinema cinema);
    
}

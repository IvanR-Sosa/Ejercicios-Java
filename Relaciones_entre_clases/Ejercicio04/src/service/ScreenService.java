package service;

import interfaces.IScreen;
import java.util.Random;
import model.Screen;

public class ScreenService implements IScreen{
    private String seat = "";

    @Override
    public void showScreen(Screen screen) {
        for (int i = 0; i < screen.getSeats().length; i++) {
                for (int j = 0; j < screen.getSeats()[i].length; j++) {
                        if (screen.getSeats()[i][j] == null) {
                            System.out.print("[" + screen.getColumn()[i] + screen.getRow()[j]+" ]");
                    }else{
                            System.out.print("[" + screen.getColumn()[i] + screen.getRow()[j]+"X]");
                        }
                }
            System.out.println("");
        }

    }

    @Override
    public Boolean takeASeat(Screen screen) {
        Random random = new Random();
        for (int i = 0; i < 48; i++) {
            Integer x = random.nextInt(screen.getColumn().length);
            Integer y = random.nextInt(screen.getRow().length);
            
            if (screen.getSeats()[x][y]== null) {
                screen.getSeats()[x][y] = true;
                seat = "[" + screen.getColumn()[x] + screen.getRow()[y]+"]\n";
                System.out.println(seat);
                return true;
            }
            
        }
        System.out.println("No se pudo asignar mas asientos");
        return false;
    }
    
}

package service;

import interfaces.ICinema;
import model.Cinema;
import model.Screen;
import model.Spectator;

public class CinemaService implements ICinema{
    
    private ScreenService screenService = new ScreenService();

    @Override
    public Boolean occupiedScreen(Spectator spectator, Cinema cinema) {
        Integer age = cinema.getMovie().getMinimumAge();
        if(spectator.getAge() < age) return false;
        if(spectator.getAvailbleMoney() < cinema.getPrice()) return false;
        
        System.out.println("Asiento reservado para : " + spectator.getName());
        Boolean flag = screenService.takeASeat(cinema.getScreen());
        screenService.showScreen(cinema.getScreen());
        System.out.println("-----------------------------------------------------------------------");
        return flag;

    }

    
    
}

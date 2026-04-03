package ejercicio04;

import java.util.ArrayList;
import java.util.List;
import model.Cinema;
import model.Movie;
import model.Screen;
import model.Spectator;
import service.CinemaService;

public class Ejercicio04 {

    public static void main(String[] args) {
         
        List<Spectator> spectators = new ArrayList<>();
        spectators.add(new Spectator("Jose", 27, 24.7));
        spectators.add(new Spectator("Mario", 17, 34.7));
        spectators.add(new Spectator("Jose", 14, 12.1));//no ingresa
        spectators.add(new Spectator("Frank", 18, 24.7));
        spectators.add(new Spectator("Paulina", 27, 3.1));//no ingresa
        spectators.add(new Spectator("Maria", 27, 11.1));
        spectators.add(new Spectator("Perez", 27, 34.1));
        spectators.add(new Spectator("Joselin", 27, 34.1));
        spectators.add(new Spectator("Ana", 27, 36.1));
        
        
        Movie movie = new Movie("Pajaro", 1.56, 15, "vector");
        Screen screen = new Screen();
        Cinema cinema = new Cinema(movie, screen, 3.5);
        CinemaService cinemaService = new CinemaService();
        
        for (Spectator spectator : spectators) {
                cinemaService.occupiedScreen(spectator, cinema);
        }

    }
    
}

package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Game;
import model.Player;
import model.WaterGun;
import service.GameService;
import service.PlayerService;
import service.WaterGunService;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameService gameService= new GameService();
        WaterGunService waterGunService = new WaterGunService();
        PlayerService playerService = new PlayerService();
        
        Game game = new Game();
        
        WaterGun waterGun = new WaterGun();
        waterGunService.toFillTheWaterGun(waterGun);
        
        Integer numPlayers = 0;
        do {            
            System.out.println("Ingrese numero de jugadores");
            numPlayers = Integer.parseInt(scanner.nextLine());
        } while (numPlayers< 1 || numPlayers > 6);
        
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            Player player = new Player(i, "Jugador " + i, false);
            players.add(player);
        }
        
        gameService.fillGame(players, waterGun, game);
        
        System.out.println(" Incia la partida");
        gameService.round(game);
    
        
    }
    
}

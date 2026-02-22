package ejercicio04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.Movie;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Movie> movies = new ArrayList<>();
        String answer = " ";
        
        do {
            System.out.println("Ingrese el titulo de la Pelicula");
            String tittle = scanner.nextLine();
            System.out.println("Ingrese el nombre del director");
            String director = scanner.nextLine();
            System.out.println("Ingrese la duracion de la pelicula");
            Double duration = Double.parseDouble(scanner.nextLine());
            
            movies.add(new Movie(tittle, director, duration));
            
            System.out.println("Desea Ingresar otra pelicula  (si/no)");
            answer = scanner.nextLine();
            
        } while (answer.equalsIgnoreCase("si"));
        
        System.out.println("=========TODAS LAs PELICULAS==================");
        movies.forEach(System.out::println);
        System.out.println("=========PELICULAS CON DURACION MAYOR A 1 HORA==================");
        movies.stream().filter(m -> m.getDuration() > 1).forEach(System.out::println);
        System.out.println("=========ORDEN DE DURACION : MAYOR A MENOR==================");
        movies.sort(Comparator.comparingDouble(Movie::getDuration).reversed());
        movies.forEach(System.out::println);
        System.out.println("=========ORDEN DE DURACION : MENOR A MAYOR==================");
        movies.sort(Comparator.comparingDouble(Movie::getDuration));
        movies.forEach(System.out::println);
        System.out.println("=========ORDEN ALFABETICO POR TITULO==================");
        movies.sort(Comparator.comparing(Movie::getTittle));
        movies.forEach(System.out::println);
        System.out.println("=========ORDEN ALFABRTICO POR DIRECTOR==================");
        movies.sort(Comparator.comparing(Movie::getDirector));
        movies.forEach(System.out::println);

    }
    
}

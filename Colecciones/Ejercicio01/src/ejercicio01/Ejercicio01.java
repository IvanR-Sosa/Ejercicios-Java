package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dogBreeds = new ArrayList<>();
        String breed ;
        Boolean flag = false;
        do {
            System.out.println("Ingrese una raza de perro por favor: ");
            breed = scanner.nextLine().toLowerCase();
            dogBreeds.add(breed);
            char next = ' ';
            do {
                System.out.println("Desea ingresar otra raza ?   Si = s  No = n");
                next =  scanner.nextLine().toLowerCase().charAt(0);
            } while (next != 's' && next != 'n');
            if (next == 'n')flag = true;
        } while (!flag);

        dogBreeds.forEach(dogBreed -> System.out.println("raza: " + dogBreed));
        
        
        //Inicio ejercicio 2
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese una raza para eliminar de la lista");
        String option = scanner.nextLine().toLowerCase();
        
        Iterator <String>iterBreeds = dogBreeds.iterator();
        Boolean found = false;
        while (iterBreeds.hasNext()) {
            String breedDelete = iterBreeds.next();
            if(breedDelete.equals(option)) iterBreeds.remove(); found=true;
        }
        
        if (found) {
            System.out.println("Eliminado exitosamente");
            dogBreeds.forEach(dogBreed -> System.out.println("raza: " + dogBreed));
        }else{
            System.out.println("Raza no encontrada");
        }
        
        
        
        
    }
    
}

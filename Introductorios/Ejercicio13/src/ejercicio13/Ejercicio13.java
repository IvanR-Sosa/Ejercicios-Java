package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. */
        Scanner scanner = new Scanner(System.in);
        Integer note=-1;
        do {
                System.out.println("Ingrese una nota valida");
                note = scanner.nextInt();
        } while (note < 0 || note >10);
        System.out.println("FIN");


    }
    
}

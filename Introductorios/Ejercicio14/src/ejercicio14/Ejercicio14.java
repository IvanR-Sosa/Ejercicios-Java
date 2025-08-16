package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial.*/
        Scanner scanner = new Scanner(System.in);
        Integer number;
        Integer anotherNumber;
        Integer addNumber = 0;
        do {
            
        System.out.println("Ingrese un numero entero positivo");
         number = scanner.nextInt();
        } while (number < 0);
        System.out.println("----------------------------------------------------------------------");
        
        while (addNumber <= number ) {
            System.out.println("Ingresa un numero entero");
            anotherNumber = scanner.nextInt();
            addNumber += anotherNumber;
        }
        System.out.println("La suma supero o igualo al numero original   "+addNumber);
        
        

    }
    
}

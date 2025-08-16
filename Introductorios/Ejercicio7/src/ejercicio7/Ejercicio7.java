package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        /*Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero (# entero)");
        Integer numberOne = scanner.nextInt();
        System.out.println("Ingrese el primer numero (# entero)");
        Integer numberTwo = scanner.nextInt();
        
        if (numberOne > numberTwo) {
            System.out.println("El numero mayor es: " + numberOne);
        }else if (numberTwo > numberOne) {
            System.out.println("El numero mayor es: " + numberTwo);
        }else{
            System.out.println("Los dos numeros son iguales");
        }
    }
    
}
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt(). */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero");
        Integer number = scanner.nextInt();
        Integer numberDouble = number * 2;
        Integer numberTriple = number * 3;
        Double numberSquared = Math.sqrt(number);
        System.out.println("El doble de "+ number + " es " +numberDouble);
        System.out.println("El triple de "+ number + " es " +numberTriple);
        System.out.println("La raiz cuadrada de " + number + " es " + numberSquared);

    }
    
}

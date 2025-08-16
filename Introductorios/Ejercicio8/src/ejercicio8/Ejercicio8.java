package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        /*Crear un programa que dado un numero determine si es par o impar. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero Entero");
        Integer number = scanner.nextInt();
        
        if (number % 2 ==0){
            System.out.println(number + " es Par");
        }else{
            System.out.println(number + " es Impar");
        }

    }
    
}

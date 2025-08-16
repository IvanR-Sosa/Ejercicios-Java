package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase (Alterna mayusculas y minusculas)");
        String sentence = scanner.nextLine();
        String upperCaseSentence = sentence.toUpperCase();
        String lowerCaseSentence = sentence.toLowerCase();

        System.out.println("En Mayusculas: \n" + upperCaseSentence);
        System.out.println("En Mayusculas: \n" + lowerCaseSentence);
    }
    
}

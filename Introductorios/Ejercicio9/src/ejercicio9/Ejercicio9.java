package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java. */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String sentence = scanner.nextLine();
        if(sentence.equals("eureka")){//si usamos .equals() la frase debe se totalmente identica peor si cambias a .equalsIgnoreCase() lo unico que debe ser igual es la frase no importa si ha mayusculas o minusculas 
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}

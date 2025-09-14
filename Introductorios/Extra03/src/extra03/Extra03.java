package extra03;

import java.util.Scanner;

public class Extra03 {

    public static void main(String[] args) {

        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String. */
        Scanner scanner = new Scanner(System.in);
        String[] vowel = {"A","E","I","O","U"};
        String letter = " ";
        do {
            
        System.out.println("Ingrese una letra");
        letter = scanner.nextLine();
        } while (letter.length() > 1);
        for (String var : vowel) {
            if (var.equalsIgnoreCase(letter)) {
                System.out.println("Tu letra es una vocal");
                break;
            }
        }
    }
    
}
package extra12;

import java.util.Scanner;

public class Extra12 {

    public static void main(String[] args) {
        /*Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la altura de 
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:  
1 
12 
123 
        */
        Scanner scanner = new Scanner (System.in);
        Integer height;
        do {
            System.out.println("Ingrese la altura de la escalera de numeros");
            height = scanner.nextInt();
        } while (height < 3);
        System.out.println("Imprimiendo la escalera");
        printLadder(height);
    }
    public static void printLadder (Integer height){
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    
}

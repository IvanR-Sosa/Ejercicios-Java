
package ejercicio20;

import java.util.Scanner;


public class Ejercicio20 {

  
    public static void main(String[] args) {
        /* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo: 
5 ***** 
3 *** 
11 *********** 
2 **
        */
        
        Scanner scanner = new Scanner (System.in);
    
    Integer counter = 0;
    Integer number = 0;
    do {
            System.out.println("Ingrese un numero");
            number = scanner.nextInt();
            if (number > 1 && number < 20){
                paintAsterisks(number);
                counter ++;
            }
            
    } while (counter != 4);
    }
    
    public static void paintAsterisks(Integer number){
        System.out.print(number +" ");
        for (int i = 0; i < number; i ++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    
}

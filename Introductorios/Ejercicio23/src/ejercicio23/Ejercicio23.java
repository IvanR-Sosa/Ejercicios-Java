package ejercicio23;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio23 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido */
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Integer sizeN = random.nextInt(100)+1;
        Integer[] vector = new Integer[sizeN];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(101);
        }
        System.out.println("Ingrese un numero entero");
        Integer number = scanner.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        
        numberLocation(number, vector);
    }
    
    
    public static void numberLocation ( Integer number, Integer[] vector ){
        String positionNumber = " ";
        Integer counter = 0;
        for (int i = 0; i < vector.length; i++) {
            if ( number == vector[i]){
                positionNumber = vector[i] +" - " ;
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Numero no encontrado");
        }else{
            System.out.println(positionNumber);
            System.out.println("¿ el numero esta repetido?: "+ recurringNumber(counter));
        }
        
    }
    public static Boolean recurringNumber (Integer counter){
        if ( counter > 1){
            return true;
        }
        return false;
    }
    
}

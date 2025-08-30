package ejercicio24;

import java.util.Random;

public class Ejercicio24 {

    public static void main(String[] args) {

        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        
        Random random = new Random();
        Integer[] vector = new Integer[random.nextInt(95)+5];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(99998)+1;
            System.out.println("Vector [" + i + "] : "+ vector[i]);
            System.out.println("Digitos del numero: " + verifyCheckNumberDigits(vector[i] )+"\n" );
        }
        
        
    }
    public static Integer verifyCheckNumberDigits (Integer number){
        Integer newNumber = number;
        Integer counter = 0;
        do {
                newNumber = newNumber/10;
                counter ++;
        } while (newNumber > 0);
        return counter;
    }
    
}

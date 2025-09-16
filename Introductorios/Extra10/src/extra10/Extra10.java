package extra10;

import java.util.Random;
import java.util.Scanner;

public class Extra10 {

    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe 
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea 
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para 
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
        */
        Random random = new Random();
        System.out.println("Se multiplicaran dos numero aleatorios Adivina su resultado");
        Integer numberOne = random.nextInt(11);
        Integer numberTwo = random.nextInt(11);
        Integer result = numberOne * numberTwo;
        guessNumber(result);

    }
    public static void guessNumber (Integer result){
        Scanner scanner = new Scanner (System.in);
        Integer aux ;
        Integer counter = 1;
        do {
            System.out.println("Intento N°: " + counter);
            aux = scanner.nextInt();
            if (aux > result) System.out.println("Numero por encima"); 
            if (aux < result) System.out.println("Numero por debajo");
            counter ++;
        } while (aux != result);
        System.out.println("Lo lograste ");
    }
    
}

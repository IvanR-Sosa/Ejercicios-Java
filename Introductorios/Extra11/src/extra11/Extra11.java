package extra11;

import java.util.Random;

public class Extra11 {

    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el 
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo entero 
truncan los números o resultados. 
        */
        Random random = new Random();
        Integer number = random.nextInt(99999)+1;
        System.out.println("Numero escogido: " + number);
        Integer digit = numberOfDigits(number);System.out.println("Ese numero tiene " + digit + " digitos");

    }
    public static Integer numberOfDigits (Integer number){
        if (number == 0) return 0;
        Integer counter = 0;
        do {
            number /=10;
            counter ++;
        } while (number != 0);
        return counter;
    }
    
}

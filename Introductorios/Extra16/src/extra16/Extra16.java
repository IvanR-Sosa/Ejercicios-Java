package extra16;

import java.util.Scanner;

public class Extra16 {

    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver	true	si es primo, sino	false. 
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo. 
        */
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        Integer number = scanner.nextInt();
        System.out.println("Numero ingresado es primo?  :   " + isPrime(number));

    }
    public static Boolean isPrime (Integer number){
        if( number < 2 ) return false;
        for (int i = 2; i < number; i++) {
            if ( number % i == 0) return false;
        }
        return true;
    }
    
}

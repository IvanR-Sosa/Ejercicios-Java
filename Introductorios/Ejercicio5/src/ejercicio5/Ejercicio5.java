package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cantidad de grados Celsius");
        Double celcius = scanner.nextDouble();
        Double fahrenheit = 32 + ( 9*celcius /5 );
        System.out.println(celcius + "°C corresponden a " + fahrenheit+"°F");

    }
    
}

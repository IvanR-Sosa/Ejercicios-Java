
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma 
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Primer numero para Sumar");
        Integer numberOne = scanner.nextInt();
        System.out.println("Segundo numero para Sumar");
        Integer numberTwo = scanner.nextInt();

        System.out.println("La suma de " + numberOne + " + " + numberTwo +" es : "+ (sumar(numberOne,numberTwo)));
    }    
    public static Integer sumar(Integer numberOne,Integer numberTwo){
        return numberOne + numberTwo;
    }
    
}

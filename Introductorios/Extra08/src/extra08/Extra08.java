package extra08;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra08 {

    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break. 
        */
        Scanner scanner = new Scanner(System.in);
        Integer number = 0;
        Integer pair = 0;
        Integer odd = 0;
        ArrayList <Integer> numberList = new ArrayList<>();
        do {
            System.out.println("Ingrese un numero");
            number = scanner.nextInt();
            if (number %5 == 0) break;
            if (number > 0){
                if(number % 2 == 0) pair ++ ;
                if(number %2 != 0) odd ++ ;
                numberList.add(number);
            }    
            
        } while (number %5 !=0);
        System.out.println("Cantidad de numeros leidos:  " + numberList.size());
        System.out.println("Cantida de numeros pares leidos:  " + pair);
        System.out.println("Cantida de numeros impares leidos:  " + odd);

    }
    
}

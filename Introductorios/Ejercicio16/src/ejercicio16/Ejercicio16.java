package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break. */
        
        Scanner scanner = new Scanner(System.in);
        Integer number;
        Integer addNumber = 0;
        Boolean isZero=false;
        Integer counter=1;
        do {
            System.out.println("Indice "+ counter);
            number = scanner.nextInt();
               
            if (number == 0 || counter == 20){                
                break;
                }else{
             if (number > 0){
                    addNumber += number;
                }
            }
                counter ++ ;
                System.out.println("La suma ahora es: " + addNumber);
        } while (!isZero);


    }
    
}

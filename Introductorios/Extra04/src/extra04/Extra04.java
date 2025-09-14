package extra04;

import java.util.Scanner;

public class Extra04 {

    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano. 
        */
        Scanner scanner = new Scanner (System.in);
        Integer number = 0;
        
        do {
            System.out.println("Ingrese un numero de 1 a 10");
            number = scanner.nextInt();
        } while (number < 1 || number >50);
        String romanNumber = convertToRoman(number);
        System.out.println("El numero " + number + " se escribe de la siguiente manera en romano: " + romanNumber);
    
    }
    public static String convertToRoman (Integer number){
        String romanNumber = " ";
        //Aqui aumente a 50 el rango para comprobar su escalabilidad y cuando cambias de simbolo tambien debes poner las execpciones en este caso el numero 40
        Integer[] value = {50,40,10,9,5,4,1};
        String[] simbol = {"L","XL","X","IX","V","IV","I"};
        for (int i = 0; i < value.length; i++) {
            while (number >= value[i]) {
                romanNumber += simbol[i];
                number -= value[i];
            }
        }
        return romanNumber;
    }
    
}

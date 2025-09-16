package extra07;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra07 {

    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”. 
        */
        Scanner scanner = new Scanner (System.in);
        Integer number = 0;
        do {
            System.out.println("Ingrese una cantidad para ejecutar el programa");
            number = scanner.nextInt();
        } while (number < 5 );
        
         ArrayList<Integer> numberList = fillList(number, scanner);
         System.out.println("-------------- usando WHILE---------------");
         usingWhile(numberList);
         System.out.println("--------------usando DO-WHILE-------------");
         usingDoWhile(numberList);
    }
    
    public static ArrayList<Integer> fillList (Integer number, Scanner scanner){
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Integer aux = 0;
            do {
                System.out.println("Ingrese un valor");
                aux = scanner.nextInt();
            } while (aux < 0);
            numberList.add(aux);
        }
        return numberList;
    }
    
    public static void usingWhile (ArrayList<Integer> list){
        Integer counter = 0;
        Integer max = list.get(0);
        Integer min = list.get(0);
        Integer sum = 0;
        while (counter < list.size()) {
            Integer currentValue = list.get(counter);
            if (currentValue > max ) max = currentValue;
            if (currentValue < min ) min = currentValue;
            sum += currentValue;
            counter ++ ;
        }
        Double average = sum/(double)list.size();
        System.out.println("Numero mayor:  " + max);
        System.out.println("Numero menor:  " + min);
        System.out.println("Promedio:  " + average);
    }
    public static void usingDoWhile ( ArrayList<Integer> list){
        Integer counter = 0;
        Integer max = list.get(0);
        Integer min = list.get(0);
        Integer sum = 0;
        do {
            Integer currentValue = list.get(counter);
            if (currentValue > max ) max = currentValue;
            if (currentValue < min ) min = currentValue;
            sum += currentValue;
            counter ++ ;
        } while (counter < list.size());
        Double average = sum/(double)list.size();
         System.out.println("Numero mayor:  " + max);
        System.out.println("Numero menor:  " + min);
        System.out.println("Promedio:  " + average);
    }
}

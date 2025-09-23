package extra17;

import java.util.Scanner;

public class Extra17 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario. 
        */
        Scanner scanner = new Scanner(System.in);
        Integer lengthVector = 8;
        Integer[] vector = new Integer [lengthVector];
        fillVector(vector, scanner);
        System.out.println("La suma de los numeros del vector es : " + sumValues(vector));
    }
    public static void fillVector (Integer[] vector,Scanner scanner){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Number  " + i +"  :");
            Integer aux =scanner.nextInt();
            vector[i] = aux;
        }
    }
    public static Integer sumValues (Integer[] vector){
        Integer sum = 0;
        for (Integer number : vector) {
            sum += number;
        }
        return sum;
    }
    
}

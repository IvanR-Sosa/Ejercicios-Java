package extra13;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra13 {

    public static void main(String[] args) {
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de 
todas las familias. 
        */
        Integer numberOfFamily = 5;
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer>[] listOfFamilies = new ArrayList[numberOfFamily];
        for (int i = 0; i < listOfFamilies.length; i++) {
            listOfFamilies[i] = new ArrayList<>();
        }
        discoveryAverage(listOfFamilies, scanner);
    }
    public static void discoveryAverage (ArrayList <Integer>[] listOfFamilies,Scanner scanner){
        Integer sumAge=0;
        Integer totalChildren = 0;
        for (int i = 0; i < listOfFamilies.length; i++) {
            System.out.println("Familia " + (i+1));
            System.out.println("Cantidad de hijos");
            Integer aux = scanner.nextInt();
            if (aux > 0){
            for (int j = 0; j < aux; j++) {
                System.out.println("Ingrese la edad del hijo " + (j+1));
                Integer age =scanner.nextInt();
                listOfFamilies[i].add(age);
                sumAge += age;
                totalChildren ++ ;
            }
            }
        }
        Integer average = sumAge /  totalChildren;
        System.out.println("La media de edad de los hijos de este grupo familiar es: " + average);
    }
    
}

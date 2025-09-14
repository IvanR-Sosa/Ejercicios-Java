package extra06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Extra06 {

    public static void main(String[] args) {
        /*Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general. 
        */
        Random random = new Random();
        Integer numberOfPeople = random.nextInt(10)+5;//esto es solo por dar un poco de interactividad puede ser un numero fijo o uno dado por el usuario
        ArrayList <Double>heightOfPerson = fillHeight(numberOfPeople);
        Double heightToFilter = 1.60;
        ArrayList <Double> filterList = filteredHeight(heightOfPerson, heightToFilter);
        System.out.println("Mostrar todas las estaturas");
        showheight(heightOfPerson);
        System.out.println("El promedio de estaturas general es: " + calculateAverage(heightOfPerson));
        System.out.println("-------------------------------------------------------");
        System.out.println("Mostrar estaturas menores o iguales a " + heightToFilter);
        showheight(filterList);
        System.out.println("El promedio de estaturas general es: " + calculateAverage(filterList));
    }
    public static Double calculateAverage(ArrayList <Double> list){
        if (list == null || list.isEmpty()) return 0.00;
        Double average = 0.00;
        for (Double aux : list) {
            average += aux;
        }
        average = average / list.size();
        return average;
    }
    public static ArrayList<Double> fillHeight(Integer number){
        Scanner scanner = new Scanner (System.in);
        ArrayList <Double> height = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Ingrese estatura de la persona");//asumiremos que el usuario ingresa una estatura valida despues se puedemodificar esta parte
            Double aux = scanner.nextDouble();
            height.add(aux);
        }
        return height;
    }
    public static ArrayList<Double> filteredHeight (ArrayList <Double> heightArray, Double height ){
        ArrayList <Double> filterList = new ArrayList<>();
        for (Double aux : heightArray) {
            if(aux <= height) filterList.add(aux);
        }
        if(filterList.isEmpty()) return new ArrayList<>();
        return filterList;
    }
    public static void showheight (ArrayList<Double> height){
        for (Double aux : height) {
            System.out.println("[" + aux + "] ");   
        }
    }
    
}

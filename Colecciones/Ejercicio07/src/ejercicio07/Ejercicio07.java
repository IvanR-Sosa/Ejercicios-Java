package ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        Boolean flag = false;
        do {
            System.out.println("Ingrese numero");
            Integer num = scanner.nextInt();
            if (num == -99) flag = true;
            else { numbers.add(num); }
        } while (!flag);
        System.out.println("El numero de valores leidos es : " + numbers.size());
        System.out.println("La suma de los valores es: " + sumOfValues(numbers));
        System.out.println("El promedio de los valores es: " + average(numbers));

    }
    public static Double average (ArrayList<Integer> list){
        if (list.isEmpty()) return 0.0;
        return (double) sumOfValues(list) / list.size();
    }
    public static int sumOfValues(ArrayList<Integer> list) {
    return list.stream().mapToInt(Integer::intValue).sum();
}
    
}

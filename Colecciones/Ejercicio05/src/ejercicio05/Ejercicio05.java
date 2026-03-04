package ejercicio05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet <String> countries = new HashSet<>();
        String answer ;
        
        do {            
            System.out.println("Ingrese el nombre del pais");
            String country = scanner.nextLine().toUpperCase();
            countries.add(country);
            System.out.println("Desea agregar otro pais? (si/no)");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("si"));
        
        
        System.out.println("=========MOSTRAR PAISES===========");
        System.out.println("Listado de paises:  " + countries);
        System.out.println("=========MOSTRAR PAISES ORDENADOS ALFABETICAMENTE===========");
        TreeSet <String> orderedCountries = new TreeSet<>(countries);
        System.out.println("Listado de Paises : " + orderedCountries);
        System.out.println("=========QUITAR PAIS DE LA LISTA===========");
        System.out.println("Escriba un pais para quitarlo de la lista:");
        String countryToBeDeleted = scanner.nextLine();
        Iterator<String> iterator = orderedCountries.iterator();
        Boolean flag = false;
        
        while (iterator.hasNext()) {
                String c = iterator.next();
                if (c.equalsIgnoreCase(countryToBeDeleted)) {
                iterator.remove();
                flag = true;
                break;
            }
        }
        
        if (flag) {
            System.out.println("Pais eliminado nexitosamente, listado actualizado : " + orderedCountries);
        }else{
            System.out.println("El pais no se encontro en la lista");
        }

    }
    
}

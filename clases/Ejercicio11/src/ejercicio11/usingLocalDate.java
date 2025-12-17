package ejercicio11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class usingLocalDate {
    public static void main(String[] args) {
        // Teniendo en cuenta que la clase Date esta un poco limitada y cada vez se recomienda usar menos vamos a realizar el ejercicio usando "localDate"
        
        Scanner scanner =  new Scanner(System.in);
        Integer inputDay;
        Integer inputMonth;
        Integer inputYear;
        LocalDate scannDate;
        LocalDate currentDate = LocalDate.now();
        
        System.out.println("Ingrese dia de mes");
        inputDay = scanner.nextInt();
        System.out.println("Ingrese un mes del año");
        inputMonth = scanner.nextInt();
        System.out.println("Ingrese un año");
        inputYear = scanner.nextInt();
        scannDate = LocalDate.of(inputYear, inputMonth, inputDay);
        
        Period difference = Period.between(scannDate, currentDate);
        System.out.println("La diferencia en años de la fechas ingresada a la actual es : " + difference.getYears());
    }
    
}

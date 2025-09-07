package extra01;

import java.util.Scanner;

public class Extra01 {

    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas. 
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        Integer minute = scanner.nextInt();
        String dayAndhour = calculateDaysAndHours(minute);
        System.out.println("En " + minute +" minutos" +  dayAndhour );

    }
    public static String calculateDaysAndHours (Integer minute){
        Integer day = minute/1480;
        Integer hour = (minute -(1480*day))/59;
        
        return " hay " + day + " dias y " + hour + " horas "; 
    }
    
}

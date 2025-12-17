package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {
/*
    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con 
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la 
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le 
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha 
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la 
fecha actual, que se puede conseguir instanciando un objeto Date con constructor 
vacío.  
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date(); 
Si necesiten acá tienen más información en clase Date: Documentación Oracle
    */
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Integer inputDay;
        Integer inputMonth;
        Integer inputYear;
        Integer differenceYears;
        Date scannDate;
        Date currentlyDate = new Date();
        
        System.out.println("Ingrese dia de mes");
        inputDay = scanner.nextInt();
        System.out.println("Ingrese un mes del año");
        inputMonth = scanner.nextInt();
        System.out.println("Ingrese un año");
        inputYear = scanner.nextInt();
        scannDate =  new Date(inputYear-1900, inputMonth-1, inputDay);
        
        System.out.println("Fecha Ingresada : " + scannDate.toString());
        
        
        System.out.println("Fecha Actual : " + currentlyDate.toString());
        
         differenceYears = currentlyDate.getYear() - scannDate.getYear();
        System.out.println("Diferencia de fechas en años : " + differenceYears);

    }
    
}

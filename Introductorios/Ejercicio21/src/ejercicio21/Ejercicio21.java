package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void). 
El cambio de divisas es: 
* 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/
        Scanner scanner = new Scanner (System.in);
        System.out.println("INGRESE EL TIPO DE DIVISA DE CAMBIO");
        System.out.println("-------DOLARES------");
        System.out.println("-------YENES---------");
        System.out.println("-------LIBRAS--------");
        
        String currency = scanner.nextLine().toUpperCase();
        System.out.println("iNGRESE LA CANTIDAD DE EUROS QUE DESEA CAMBIAR");
        Double euro = scanner.nextDouble();
        
        currencyConverter(currency, euro);

    }
    public static void currencyConverter(String currecncy, Double amount ){
        Double newCurrency = 0.0;
        switch (currecncy) {
            case "DOLARES":
                Double dolar = 1.28611;
                 newCurrency = dolar * amount;
                System.out.println(amount + "€  son  $" + newCurrency );
                break;
            case "YENES":
                Double yen = 129.852;
                newCurrency = yen * amount;
                System.out.println(amount + "€  son  " + newCurrency + " yenes" );
                break;
            case "LIBRAS":
                Double libra = 0.86;
                newCurrency = libra * amount;
                System.out.println(amount + "€  son  " + newCurrency + " Libras" );
                break;
            default:
                System.out.println("Moneda invalida");
                
        }
    }
    
}

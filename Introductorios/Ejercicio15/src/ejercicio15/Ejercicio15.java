package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú: 
MENU 
1. Sumar 
2. Restar 
3. Multiplicar 
4. Dividir 
5. Salir 
Elija opción: 
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú. */
        Scanner scanner = new Scanner(System.in);
        
        Integer numberOne;
        Integer numberTwo;
        Integer menuOption;
        do {
            System.out.println("Ingrese el primer numero entero Positivo");
            numberOne = scanner.nextInt();
            System.out.println("Ingrese el segundo numero entero Positivo");
            numberTwo = scanner.nextInt();
        } while (numberOne <= 0 || numberTwo <= 0);
        do {
            System.out.println("MENU \n"
                    + "1. Sumar \n"
                    + "2. Restar \n"
                    + "3. Multiplicar \n"
                    + "4. Dividir \n"
                    + "5. Salir \n"
                    + "Elija opción: ");
            menuOption = scanner.nextInt();
            switch (menuOption) {
                case 1:
                        System.out.println("La suma de "+numberOne +" y "+numberTwo+ " es:  "+(numberOne+numberTwo));
                    break;
                case 2:
                        System.out.println("La resta de "+numberOne +" y "+numberTwo+ " es:  "+(numberOne-numberTwo));
                     break;
                case 3:
                    System.out.println("La multiplicacion de "+numberOne +" y "+numberTwo+ " es:  "+(numberOne*numberTwo));
                    break;
                case 4:
                    System.out.println("La division de "+numberOne +" y "+numberTwo+ " es:  "+(numberOne/numberTwo));
                    break;

            }
        } while (menuOption != 5);


    }
    
}

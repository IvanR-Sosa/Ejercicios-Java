package extra14;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
operación matemática y deben devolver sus resultados para imprimirlos en el main.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        Integer numberOne = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        Integer numberTwo =  scanner.nextInt();
        performMathematicalOperation(numberOne, numberTwo, scanner);
    }
    public static void performMathematicalOperation (Integer numberOne, Integer numberTwo,Scanner scanner){
        Integer option;
        do {
            System.out.println("-----------------Ingrese que operacion desea realizar-----------");
        System.out.println("-----------------1->Sumar numeros-----------------------");
        System.out.println("-----------------2->Restar numeros-----------------------");
        System.out.println("-----------------3->Multiplicar Numeros-------------------");
        System.out.println("-----------------4->Dividir Numeros----------------------");
        System.out.println("-----------------5->Salir-------------------------------");
         option = scanner.nextInt();
                Integer result=0;
            switch (option) {
                case 1:
                     result = numberOne + numberTwo;
                    System.out.println("La suma de " + numberOne +" + " + numberTwo +" es : " + result);
                    break;
                case 2:
                     result = numberOne - numberTwo;
                    System.out.println("La resta de " + numberOne +" - " + numberTwo +" es : " + result);
                    break;
                case 3:
                     result = numberOne * numberTwo;
                    System.out.println("La multiplicacion de " + numberOne +" * " + numberTwo +" es : " + result);
                    break;
                case 4:
                    if ( numberOne == 0 || numberTwo==0)System.out.println("No se puede dividir por cero");
                    else{
                        Double resultOfDividion = numberOne / (double) numberTwo ;
                    System.out.println("La division de " + numberOne +" / " + numberTwo +" es : " + resultOfDividion);
                    }
                    break;
                default:
                    if (option > 5 || option < 1) {
                        System.out.println("Opcion invalida intente nuevamente");
                    }
            }
        } while (option != 5);
    }
    
}

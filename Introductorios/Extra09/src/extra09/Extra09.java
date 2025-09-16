package extra09;

import java.util.Scanner;

public class Extra09 {

    public static void main(String[] args) {
        /*Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas es el 
cociente. Por ejemplo: 50 / 13:  
50 – 13 = 37  una resta realizada  
37 – 13 = 24  dos restas realizadas  
24 – 13 = 11  tres restas realizadas  
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. 
        */
        Scanner scanner = new Scanner (System.in);
        Integer numberOne;
        Integer numberTwo;
        do {
            System.out.println("Ingrese el primer numero");
            numberOne = scanner.nextInt();
        } while (numberOne < 1);
        do {
            System.out.println("Ingrese el segundo numero");
            numberTwo = scanner.nextInt();
        } while (numberTwo < 1);
        divisionWithSubstraction(numberOne, numberTwo);
    }
        public static void divisionWithSubstraction (Integer numberOne, Integer numberTwo){
            Integer residue = numberOne;
            Integer ratio = 0;
            
            do {
                residue -= numberTwo;
                ratio ++;
            } while (residue >= numberTwo);
            System.out.println("Residuo: " + residue);
            System.out.println("ratio: " + ratio);
        }
    
}

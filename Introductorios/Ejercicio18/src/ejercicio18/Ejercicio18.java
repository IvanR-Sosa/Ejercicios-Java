package ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo: 
0-0-0 
0-0-1 
0-0-2 
0-0-E 
0-0-4 
. 
. 
0-1-2 
0-1-E 
Nota: investigar función equals() y como convertir números a String. */
        Integer firstDigit = 0;
        Integer SecondDigit = 0;
        Integer thirdDigit = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.println(replaceNumber(firstDigit)+"-"+replaceNumber(SecondDigit)+"-"+replaceNumber(thirdDigit));
            thirdDigit ++;
           if (thirdDigit ==10){
               SecondDigit ++;
               thirdDigit = 0;
           }
           if (SecondDigit==10){
               firstDigit ++;
               SecondDigit = 0;
               thirdDigit = 0;
           }
           
        }

    }
    public static String replaceNumber(Integer number){
        if(number == 3){
            return "E";
        }
        return ""+number;
    }

}

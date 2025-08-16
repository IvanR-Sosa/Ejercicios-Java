package ejercicio19;

import java.util.Random;

public class Ejercicio19 {

    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
* * * *  
*     *    
*     *
* * * * 
        */
        Random random = new Random();
        Integer sideLength = random.nextInt(7)+3;
        System.out.println("Length of square: "+sideLength);
        for (int i = 0 ;i < sideLength;i ++){
            for (int j = 0; j <sideLength;j ++){
                if ( i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
    
}

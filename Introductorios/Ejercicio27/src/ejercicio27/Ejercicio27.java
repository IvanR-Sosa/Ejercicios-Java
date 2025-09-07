package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9. 
        */
       
        Integer [][] magicSquare = new Integer [3][3];
        System.out.println("-------------Rellenar-----------");
         fillMagicSquare(magicSquare);
       
        System.out.println("-------------Mostrar------------");
        showMagicSquare(magicSquare);
        System.out.println("-------------Validar-------------");
        System.out.println("Es un cuadrado magico ?:  "+ validateMagicSquare(magicSquare));
    }
    public static void fillMagicSquare(Integer[][] magicSquare){
         Scanner scanner = new Scanner (System.in);
        Integer value=0;
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++){
                do {
                    System.out.println("valor de la posicion [" + i + "][" + j + "]");
                    value = scanner.nextInt();
                } while (value <0 || value > 9);
                magicSquare[i][j] = value;
            }
        }
        
    }
    public static void showMagicSquare (Integer[][] square){
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print("[" + square[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static Boolean validateMagicSquare (Integer [][] magicSquare){
        Integer [] sumOfRows = new Integer[magicSquare.length];
        Integer [] sumOfColumns = new Integer[magicSquare[0].length];
        Integer mainDiagonal = 0;
        Integer secondaryDiagonal = 0;
        
        for (int i = 0; i < magicSquare.length; i++) {
            sumOfRows[i] = 0;
            sumOfColumns[i] = 0;
            for (int j = 0; j < magicSquare[i].length; j++) {
                Integer value = magicSquare[i][j];  
                Integer valueColumns= magicSquare[j][i];
                sumOfRows[i] += value;
                sumOfColumns[i] +=valueColumns;
                if ( i==j) {
                    mainDiagonal += value;
                }
                if ( i + j == magicSquare.length-1) {
                    secondaryDiagonal += value;
                }
            }
        }
        
        for (int i = 0; i < magicSquare.length; i++) {
            if (sumOfRows[i] != 15 || sumOfColumns[i] != 15) {
                return false;
            }
        }
        if (mainDiagonal != 15 || secondaryDiagonal != 15) {
            return false;
        }
        return true;
    }
    
}

package ejercicio25;

import java.util.Random;

public class Ejercicio25 {

    public static void main(String[] args) {

        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y  
muestre traspuesta.
        */
        Integer[][] originalArray = new Integer[4][4];
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                originalArray [i] [j] = random.nextInt(10);
            }
            
        }
        showmatrix(originalArray);
        System.out.println("-----------------------------------------");
          Integer [][] anotherMatrix = transposeMatrix(originalArray);
          showmatrix(anotherMatrix);
       
    }
    public static void showmatrix(Integer[][] matrix){
          for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
              System.out.println("");
            
        }
          
    }
    public static Integer[][] transposeMatrix(Integer[][] matrix){
        Integer row = matrix.length;
        Integer column = matrix[0].length;
        Integer[][] copyMatrix = new Integer [row][column];
        for (int i = 0; i < copyMatrix.length; i++) {
            for (int j = 0; j < copyMatrix[i].length; j++) {
                copyMatrix[i][j] = matrix[j][i];
            }
        }
        return copyMatrix;
    }
    
    
}

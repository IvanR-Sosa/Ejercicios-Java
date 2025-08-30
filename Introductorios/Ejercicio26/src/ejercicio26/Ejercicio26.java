package ejercicio26;

import java.util.Random;
import java.util.Arrays;

public class Ejercicio26 {

    public static void main(String[] args) {

        /* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de 
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o 
viceversa).
        */
        Integer[][] OriginalMatrix = new Integer[3][3];
        fillInMatrix(OriginalMatrix);
        showMatrix(OriginalMatrix);
        System.out.println("-----------------Transpose Matrix---------------");
        Integer[][] transposeOriginalMatrix = transposeMatrix(OriginalMatrix);
        showMatrix(transposeOriginalMatrix);
        System.out.println("-----------------Negative Matrix---------------");
        Integer[][] negativeMatrixOriginal = negativeMatrix(OriginalMatrix);
        showMatrix(negativeMatrixOriginal);
        System.out.println("---------------Is asiymmetric?-------------");
        System.out.println(checkAsymmetricMatix(negativeMatrixOriginal, transposeOriginalMatrix));
    }
    public static void fillInMatrix (Integer[][] matrix){
        Random random = new Random();
        Integer maximumRange = 4;
        Integer minimumRange = -4;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(maximumRange - minimumRange) + minimumRange;
            }  
        }
    }
    public static void showMatrix(Integer[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] +"]");
            }  
            System.out.println("");
        }
    }
    public static Integer[][] transposeMatrix(Integer[][] matrix){
        Integer[][] anotherMatrix=new Integer[matrix.length][matrix[0].length] ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                anotherMatrix[i][j] = matrix[j][i];
            }
        }
        return anotherMatrix;
    }
    public static Integer[][] negativeMatrix(Integer[][] matrix){
        Integer[][] anotherMatrix=new Integer[matrix.length][matrix[0].length] ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                anotherMatrix[i][j] = -matrix[i][j];
            }
        }
        return anotherMatrix;
    }
    public static boolean checkAsymmetricMatix(Integer[][] negative,Integer[][] transpose){
        if (Arrays.deepEquals(negative, transpose)) {
            return true;
        }
        return false;
    } 
    
}

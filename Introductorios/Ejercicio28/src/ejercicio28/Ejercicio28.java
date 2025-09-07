package ejercicio28;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        /* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las 
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o 
columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
primer elemento de la submatriz P. 
        */
        Integer [][] matrixM = new Integer [10][10];
        Integer [][] matrixP = new Integer [3][3];
        fillInMatrix(matrixM);
        fillInMatrix(matrixP);
        System.out.println("------------------------------");
        showMatrix(matrixM);
        System.out.println("-------------------------------");
        showMatrix(matrixP);
        System.out.println("---------------------------------");
        findSubMatrix(matrixM, matrixP);
        
        
 

    }
    public static void fillInMatrix (Integer[][] matrix){
        Random random = new Random();
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(98)+1;
            }
        }
    }
    
    public static void showMatrix (Integer[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
    //Este metodo sirve si deseas hacer que el caso sea verdadero (para forzar los resultados de la matriz P
    public static void fillInMAtrixP (Integer[][] matrixP){
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < matrixP.length; i++) {
            for (int j = 0; j < matrixP[i].length; j++) {
                System.out.println("posicion [" + i + "][" + j +"]");
                matrixP[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void findSubMatrix (Integer[][] matrixM, Integer[][] matrixP){
        for (int i = 0; i < matrixM.length - 2; i++) {
            for (int j = 0; j < matrixM[i].length - 2; j++) {

                Boolean match = true;

                for (int k = 0; k < matrixP.length; k++) {
                    for (int l = 0; l < matrixP[k].length; l++) {

                        if (matrixM[i + k][j + l] != matrixP[k][l]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    System.out.println("Coinciencia en [" + i + "][" + j + "]");
                }
            }
        }
    }
    
}

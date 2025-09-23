package extra21;

import java.util.Random;

public class Extra21 {

    public static void main(String[] args) {
        /*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios 
y muestre la suma de sus elementos.
        */
        Integer[][] randomMatrix = new Integer[15][8];
        fillMatrix(randomMatrix);
        showMatrix(randomMatrix);
    }
    public static void fillMatrix (Integer[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }
    public static void showMatrix(Integer[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}

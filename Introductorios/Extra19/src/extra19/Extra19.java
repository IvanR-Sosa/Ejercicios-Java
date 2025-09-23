package extra19;

import java.util.Random;

public class Extra19 {

    public static void main(String[] args) {
        /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el 
vector. 
        */
    Integer lenghtVector = 6;
    Integer[] vector = new Integer [lenghtVector];
        fillVector(vector);
        showVector(vector);
    }
    public static void fillVector (Integer[] vector ){
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            Integer aux = random.nextInt(99);
            vector[i] = aux;
        }
    }
    public static void showVector (Integer[] vector){
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println("");
    }
    
}

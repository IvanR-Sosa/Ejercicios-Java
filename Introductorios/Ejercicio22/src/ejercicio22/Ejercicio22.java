package ejercicio22;

public class Ejercicio22 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
        los muestre por pantalla en orden descendente
         */
        Integer[] vector = new Integer[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
            
        }
       
        for (int i = vector.length-1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        
    }
    
}

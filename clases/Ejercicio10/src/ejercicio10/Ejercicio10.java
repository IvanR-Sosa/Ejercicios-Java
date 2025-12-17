package ejercicio10;

import java.util.Arrays;

/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo 
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por 
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos 
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 
elementos y el combinado de 20. */
public class Ejercicio10 {

    public static void main(String[] args) {
        Double[] A = new Double[50];
        Double[] B = new Double[20];
        initializerArray(A);
        System.out.println("Mostrar Arreglo A");
        showArray(A);
        System.out.println("\nArreglo A ordenado");
        orderArray(A);
        showArray(A);
        System.out.println("\nRellenar y mostrar Arreglo B");
        fillArrayB(B, A);
        showArray(B);
    }
    
    public static void initializerArray(Double[] x){
        for (int i = 0; i < x.length; i++) {
            x [i] = Math.random()*50;
        }
    }
    public static void showArray (Double[] x){
        for (int i = 0; i < x.length; i++) {
                System.out.print("[ " + x[i] + " ]");
                if (i+1%5==0 ) {
                    System.out.println("");
            }
        }
        
    }
    public static void orderArray (Double[] x){
        Arrays.sort(x);
    }
    public static void fillArrayB(Double[] x, Double[] y){
        System.arraycopy(y, 0, x, 0, 10);
        Arrays.fill(x, 10,x.length ,0.5);
    }
    
}

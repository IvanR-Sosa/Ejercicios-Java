package ejercicio02;

import Entity.Circumference;
import Entity.Operation;
import Entity.RectangleEx;
import java.awt.Rectangle;

public class Ejercicio02 {

    public static void main(String[] args) {
        /*En la siguiente parte hay  varios ejercicios similares por lo que creare la clase respectiva para cada uno 
        y las llamare en este main
        */
        //Ejercicio 2
        
        /*Circumference circle = new Circumference(Double.NaN);
        circle.createCicumference();
        System.out.println("El area es: " + circle.calculateArea());
        System.out.println("El perimetro es: " + circle.calculatePerimeter());*/
        
        //Ejercicio 3
        
        /*Operation op = new Operation();
        op.createOperation();
        System.out.println("Sumar: " + op.add());
        System.out.println("Restar: " + op.subtract());
        System.out.println("Multiplicar: " + op.multiply());
        System.out.println("Dividir: " + op.divide());
        */
        
        //Ejercicio 4
        
        RectangleEx rc = new RectangleEx();
        rc.createRectangle();
        System.out.println("Perimetro: " + rc.calculatePerimeter());
        System.out.println("Superficie: " + rc.calculateArea());
        rc.drawRectangle();
        


    }
    
}

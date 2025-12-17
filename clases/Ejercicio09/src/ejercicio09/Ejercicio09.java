package ejercicio09;

import Entity.Matematica;

public class Ejercicio09 {

    public static void main(String[] args) {
        Matematica m = new Matematica();

        
        m.setNumberOne(Math.random() * 10);
        m.setNumberTwo(Math.random() * 10);

        System.out.println("Número 1: " + m.getNumberOne());
        System.out.println("Número 2: " + m.getNumberTwo());

        System.out.println("Mayor: " + m.getMax());
        System.out.println("Potencia: " + m.calculatePower());
        System.out.println("Raíz del menor: " + m.calculateSquareRoot());


    }
    
}

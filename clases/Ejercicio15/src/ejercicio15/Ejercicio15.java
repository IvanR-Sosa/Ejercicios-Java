package ejercicio15;

import model.Roots;
import service.serviceRoots;

public class Ejercicio15 {

    public static void main(String[] args) {

        Roots r = new Roots(1,2,3);
        serviceRoots sr = new serviceRoots();
        sr.calculate(r);
        System.out.println("-----------------------------");
        Roots r2 = new Roots (1,-5,2);
        sr.calculate(r2);
        System.out.println("------------------------------");
        Roots r3 = new Roots (1,-2,1);
        sr.calculate(r3);
    }
    
}

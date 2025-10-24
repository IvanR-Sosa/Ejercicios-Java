package ejercicio06;

import Entity.CoffeeMaker;

public class Ejercicio06 {

    public static void main(String[] args) {
        
        CoffeeMaker cfm = new CoffeeMaker(5.5,5.5);
        cfm.serveCup("medium",3);
        cfm.emptyCoffePot();
        cfm.fillCoffeeMaker();
        
    }
   
}

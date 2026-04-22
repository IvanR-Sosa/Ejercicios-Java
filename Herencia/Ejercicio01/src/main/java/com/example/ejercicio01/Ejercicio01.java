
package com.example.ejercicio01;

import model.Animal;
import model.Cat;
import model.Dog;
import model.Horse;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        Animal dog = new Dog("Stitch", "Carnivoro", 15, "Doberman");
        dog.getDiet();
        
        Dog dog1 =  new Dog("Teddy", "Croquetas", 10, "Chihuahua");
        dog1.getDiet();
        
        Animal  cat= new Cat("Pelusa", "Galletas", 15, "Siames");
        cat.getDiet();
        
        Animal horse = new Horse("Spark", "Pasto", 25, "Fino");
        horse.getDiet();
        
        


    }
}

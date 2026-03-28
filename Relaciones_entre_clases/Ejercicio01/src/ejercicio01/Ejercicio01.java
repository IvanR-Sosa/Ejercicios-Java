package ejercicio01;

import model.Dog;
import model.Person;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        Person person1 = new Person("Mario", "Perez", 28, 124288889);
        Person person2 = new Person("Karina", "Suarez", 36, 124288778);
        
        Dog dog1 = new Dog("lula", "mixta", 3, "pequeño");
        Dog dog2 = new Dog("Rash", "beagle", 1, "grande");
        
        //person1.adoptDog(dog2);
        person2.adoptDog(dog1);
        
        System.out.println(person1.toString());
        System.out.println(person2);

    }
    
}

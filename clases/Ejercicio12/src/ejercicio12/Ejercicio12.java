package ejercicio12;

import model.Person;
import service.PersonService;

public class Ejercicio12 {

    public static void main(String[] args) {
        PersonService service = new PersonService();
        
        Person person = service.createPerson();
         int age = service.calculateAge(person);
         System.out.println("Edad : " + age + " años");
         
         boolean isYounger = service.lessThan(person, 36);
         System.out.println("Es menor que 36?:   " + isYounger);
         
         service.showPerson(person);


    }
    
}

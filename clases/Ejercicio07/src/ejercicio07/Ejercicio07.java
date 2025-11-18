package ejercicio07;

import Entity.Person;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio07 {

    public static void main(String[] args) {
        List <Person> listPeople = new ArrayList<>();
        
        listPeople.add(new Person("Juan",25,'H',78.2,1.75));
        listPeople.add(new Person("Mario",36,'H',58.2,1.98));
        listPeople.add(new Person("Camila",28,'M',65.0,1.80));
        Person person1 = new Person();
        person1.createPerson();
        listPeople.add(person1);
        
        for (Person person : listPeople) {
            person.showPerson();
            System.out.println("--------------------------------------------------");
        }

    }
    
}

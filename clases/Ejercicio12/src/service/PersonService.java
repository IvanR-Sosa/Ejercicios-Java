package service;

import interfaces.IPersonService;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import model.Person;

public class PersonService implements IPersonService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Person createPerson() {
        System.out.println("Ingrese el nombre de la nueva persona:  ");
        String name= scanner.nextLine();
        System.out.println("Ingrese Fecha de nacimineto en el siguiente orden  DIA --> MES --> AÑO");
        // vamos a asumir que el usuario ingresa fechas correctas siempre
        System.out.println("Dia");
        Integer day = scanner.nextInt();
        System.out.println("Mes");
        Integer month = scanner.nextInt();
        System.out.println("Año");
        Integer year = scanner.nextInt();
        
        Person person = new Person(name, LocalDate.of(year, month,day ));
        return person;

    }

    @Override
    public int calculateAge(Person person) {
        Period period = Period.between(person.getDateOfBirth(),LocalDate.now());
        Integer age = period.getYears();
        return age;
    }

    @Override
    public boolean lessThan(Person person, Integer age) {
        int personAge = calculateAge(person);
        return personAge < age;
    }

    @Override
    public void showPerson(Person person) {
        int age = calculateAge(person);
    System.out.println("HOLA!!!\nNombre: " + person.getName() +
                       "\nFecha de nacimiento: " + person.getDateOfBirth() +
                       "\nEdad: " + age + " años");
    }

    
    
}

package extra15;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra15 {

    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”. 
        */
        Scanner scanner = new Scanner (System.in);
        Integer amountPerson = 5;
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        fillListnamesAndAges(name, age, scanner, amountPerson);
        System.out.println("Ver nombres y edades");
        showListnamesAndAges(name, age, scanner, amountPerson);
    }
    public static void fillListnamesAndAges (ArrayList<String> name,ArrayList<Integer> age,Scanner scanner, Integer n){
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese Nombre");
            String namePerson = scanner.nextLine();
            name.add(namePerson);
            System.out.println("Ingrese edad");
            Integer agePerson = scanner.nextInt();
            age.add(agePerson);
            scanner.nextLine();
        }
    }
    public static void showListnamesAndAges (ArrayList<String> name,ArrayList<Integer> age,Scanner scanner, Integer n){
        Integer counter = 0; 
        String option = "";
        do {
            System.out.println("datos de la persona " + (counter+1));
            System.out.println("Nombre : " + name.get(counter));
            System.out.println("Edad : " + age.get(counter));
            verifyAge(age.get(counter));
            System.out.println("------------------------------");
            System.out.println("Desea ver los datos de  la siguiente persona? indique Si o No; si la opcion no es valida el sistema lo asumira como Si ");
            option = scanner.nextLine();
            counter ++ ;
            
        } while (counter < n && !option.equalsIgnoreCase("No"));
    }
    public static void verifyAge (Integer age){
        if (age < 18)System.out.println("MENOR DE EDAD");
        else { System.out.println("MAYOR DE EDAD"); }
    }
    
}

package Entity;

import java.util.Scanner;

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún 
otro atributo, puede hacerlo. Los métodos que se implementarán son: 
• Un constructor por defecto. 
• Un constructor con todos los atributos como parámetro. 
• Métodos getters y setters de cada atributo. 
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la 
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que el peso está por debajo de su peso ideal y la función 
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda 
hacer uso de constantes para devolver estos valores. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 
A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables, para después en el main, calcular un porcentaje de esas 4 
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por 
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y 
cuantos menores.*/
public class Person {
    
    private String name;
    private Integer age;
    private Character sex;
    private Double weight;
    private Double height;
    
    private  Integer BMI;

    public Person() {
    }

    public Person(String name, Integer age, Character sex, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.BMI = calculateBMI();
    }

    public Integer getBMI() {
        return BMI;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    
    
    public void createPerson (){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre ");
        this.name = scanner.nextLine();
        System.out.println("Ingrese Edad");
        this.age = scanner.nextInt();
        System.out.println("Ingrese sexo (solo podra ingresar las siguientes opciones H: Hombre, M: Mujer, O: otro)");
        this.sex = validateSex(scanner);
        System.out.println("Ingrese altura");
        this.height = scanner.nextDouble();
        System.out.println("Ingrese peso");
        this.weight = scanner.nextDouble();
        
        this.BMI = calculateBMI();
    }
    private Character validateSex (Scanner scanner){
        Character sexValidator ;
        do {
            System.out.println("Ingrese una opcion valida H   M   O");
            sexValidator= scanner.next().toUpperCase().charAt(0);
            
        } while (!sexValidator.equals('H') && !sexValidator.equals('M') && !sexValidator.equals('O'));

        return sexValidator;
    }
    
    public Integer calculateBMI(){
        
        Double calculate = this.weight /(this.height*this.height);
        if (calculate > 25) return 1;
        else if ( calculate >=20 && calculate <= 25) return 0;
        return -1;
    }
    
    public Boolean isOfLegalAge(){
        if ( this.age >= 18) return true;
        return false;
    }
    
    
    public void showPerson (){
        System.out.println(" Nombre : " + this.name
                               +"\n Edad : " + this.age
                               +"\n IMC : "+ this.BMI
                               +"\n ¿Mayor de edad? : " + isOfLegalAge());
    }
    
}

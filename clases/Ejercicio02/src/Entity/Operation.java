package Entity;

import java.util.Scanner;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos: 
a) Método constructor con todos los atributos pasados por parámetro. 
b) Metodo constructor sin los atributos pasados por parámetro. 
c) Métodos get y set.  
d) Método para crearOperacion(): que le pide al usuario los dos números y los 
guarda en los atributos del objeto. 
e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
f) Método restar(): calcular la resta de los números y devolver el resultado al main 
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el 
error. Si no, se hace la multiplicación y se devuelve el resultado al main 
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a 
pasar una división por cero, el método devuelve 0 y se le informa al usuario el 
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado 
al main. 
*/
public class Operation {

    private Integer numberOne;
    private Integer numberTwo;

    public Operation() {
    }
    
    public Operation(Integer numberOne, Integer numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public Integer getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Integer numberOne) {
        this.numberOne = numberOne;
    }

    public Integer getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Integer numberTwo) {
        this.numberTwo = numberTwo;
    }
    
    public void createOperation () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.numberOne = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        this.numberTwo = scanner.nextInt();
    }
    
    public Integer add (){
        return this.numberOne + this.numberTwo;
    }
    public Integer subtract (){
        return this.numberOne - this.numberTwo;
    }
    public Integer multiply (){
        if(this.numberOne == 0 || this.numberTwo == 0){
            System.out.println("No es logico multiplicar por cero ");
            return 0;
        }
        return this.numberOne * this.numberTwo;
    }
    public Double divide (){
         if(this.numberOne == 0 || this.numberTwo == 0){
            System.out.println("No es posible multiplicar por cero ");
            return 0.00;
        }
        return this.numberOne /(double) this.numberTwo;
    }
    
}

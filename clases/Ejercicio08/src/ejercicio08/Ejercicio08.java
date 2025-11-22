package ejercicio08;

import Entity.stringEj;

public class Ejercicio08 {

    public static void main(String[] args) {
    
        stringEj sc = new stringEj("Casa Blanca");
        System.out.println("-----------------INVERTIR--------------------------");
        System.out.println(sc.InvertSentence());
        System.out.println("------------------Cmparar longitud-------------------------");
        System.out.println(sc.compareLength("Armario negro"));
        System.out.println(sc.compareLength("Casa blanca"));
        System.out.println("-----------------Mostrar Volcales--------------------------");
        sc.showVowels();
        System.out.println("------------------Veces Repetidas-------------------------");
        sc.timesRepeated("a");
        System.out.println("-------------------Unir Frases------------------------");
        sc.joinSentences("Armario Negro");
        System.out.println("----------------Reemplazar Caracter---------------------------");
        sc.replaceCharacter("*");
        System.out.println("--------------------Contiene Caracter-----------------------");
        System.out.println(sc.contain("a"));
        System.out.println(sc.contain("j"));
        
        
    }
    
}

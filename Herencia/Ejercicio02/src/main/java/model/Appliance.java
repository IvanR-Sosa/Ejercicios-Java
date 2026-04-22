package model;

import interfaces.IAppliance;
import java.util.Scanner;

public class Appliance implements IAppliance{
    
    private Double price;
    private String color;
    private Character energyConsumption;
    private Double weight; 

    public Appliance() {
    }

    public Appliance(Double price, String color, Character energyConsumption, Double weight) {
        this.price = price;
        this.color = checkColor(color);
        this.energyConsumption = checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = checkColor(color);
    }

    public Character getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Character energyConsumption) {
        this.energyConsumption = checkEnergyConsumption(energyConsumption);
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public void createAppliance() {
        Scanner scanner = new Scanner(System.in);
        this.price = 1000.00;
        System.out.println("Ingrese color que desea entre los siguiente ( blanco , negro , rojo , azul , gris )");
        this.color = checkColor(scanner.nextLine());
        System.out.println("Seleccione el tipo de consumo energetico entre los siguientes (A, B, C, D, E, F)");
        this.energyConsumption = checkEnergyConsumption(scanner.nextLine().charAt(0));
        System.out.println("Ingrese el peso en Kg");
        this.weight = Double.parseDouble(scanner.nextLine());
        

    }

    @Override
    public Double finalPrice() {
        Double total = this.price;
        switch (this.energyConsumption) {
            case 'A' -> total += 1000.00;
            case 'B' -> total += 800.00;
            case 'C' -> total += 600.00;
            case 'D' -> total += 500.00;
            case 'E' -> total += 300.00;
            case 'F' -> total += 100.00;
            default -> total += 100.00;
        }
        if (this.weight >=80) total += 1000.00;
        else if (this.weight >=50 && this.weight <= 79) total += 800.00;
        else if (this.weight >=20 && this.weight <= 49) total += 500.00;
        else if (this.weight >=1 && this.weight <= 19) total += 100.00;
        
        return total;
    }
    
    
    private Character checkEnergyConsumption(Character character){
        character = Character.toUpperCase(character);
        if (character >= 'A' && character <= 'F') {
            return character;
        }
        return  'F';
    }
    
    private String checkColor (String color){
        String [] colors = {"blanco","negro","rojo","azul","gris"};
        for (String color1 : colors) {
            if (color1 .equalsIgnoreCase(color)) return color1.toLowerCase();
        }
        return "blanco";
    }

    @Override
    public String toString() {
        return "Precio base:  $ " + this.price +
                "\nColor : " + this.color +
                "\nConsumo Energetico : " + this.energyConsumption +
                "\nPeso Kg : " + this.weight; 
                
    }
    

   
    
    
    
}

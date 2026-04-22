package model;

import java.util.Scanner;

public class WashingMachine extends Appliance{
    
      private Double loadLaundry;

    public WashingMachine() {
        super();
    }

    public WashingMachine(Double loadLaundry, Double price, String color, Character energyConsumption, Double weight) {
        super(price, color, energyConsumption, weight);
        this.loadLaundry = loadLaundry;
    }

   

    public Double getLoadLaundry() {
        return loadLaundry;
    }

    public void setLoadLaundry(Double loadLaundry) {
        this.loadLaundry = loadLaundry;
    }

      @Override
    public Double finalPrice(){
        Double totalPrice = super.finalPrice();
        if (this.loadLaundry > 30 ) totalPrice += 500;
        return  totalPrice;
    } 
    
    public void createWashingMachine (){
        Scanner scanner = new Scanner(System.in);
        super.createAppliance();
        System.out.println("Ingrese la capacidad de carga de la lavadora");
        
        this.loadLaundry = Double.parseDouble(scanner.nextLine());
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga (Kg) : " + this.loadLaundry;
    }
    
    
      
    
}

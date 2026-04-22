package model;

import java.util.Scanner;

public class Tv extends Appliance {
    
    private Integer resolution;
    private Boolean tdt;

    public Tv() {
        super();
    }

    public Tv(Integer inches, Boolean tdt, Double price, String color, Character energyConsumption, Double weight) {
        super(price, color, energyConsumption, weight);
        this.resolution = inches;
        this.tdt = tdt;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }
    
    public void createTv(){
        super.createAppliance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las resolucion de su Tv (en pulgadas)");
        this.resolution = Integer.parseInt(scanner.nextLine());
        System.out.println("¿Tiene sintonizador TDT (true / false)");
        this.tdt = Boolean.parseBoolean(scanner.nextLine());
        
        scanner.close();
    }
    
    @Override
    public Double finalPrice (){
        Double totalPrice = super.finalPrice();
        if (this.resolution > 40 ){
            Double aux = totalPrice * 0.30;
            totalPrice += aux;
        }
        if (tdt == true) totalPrice += 500;
        
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "\nResolucion : " +this.resolution + " '' " +
                "\n¿Tiene TDT? : " +this.tdt;
    }
    
    
    
    
}

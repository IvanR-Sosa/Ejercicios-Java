
package com.example.ejercicio02;

import java.util.ArrayList;
import model.Appliance;
import model.Tv;
import model.WashingMachine;
import service.ServiceAppliance;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        ServiceAppliance serviceAppliance = new ServiceAppliance();
        
        ArrayList <Appliance> appliances = new ArrayList<>();
        
        appliances.add(new Tv(32,false, "blanco", 'E', 15.3));
        appliances.add(new Tv(52,true, "azul", 'A', 18.3));
        appliances.add(new WashingMachine(47.2,"rojo", 'B', 35.7));
        appliances.add(new WashingMachine(32.2, "gris", 'C', 42.5));
        
        
        for (Appliance appliance : appliances) {
            serviceAppliance.showAppliance(appliance);
        }
        System.out.printf("\nEl precio de todos los electrodomesticos es : $%.2f" , serviceAppliance.ListpriceAppliances(appliances));
        
        
        
        

    }
}

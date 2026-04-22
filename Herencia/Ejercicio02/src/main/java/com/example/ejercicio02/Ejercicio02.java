
package com.example.ejercicio02;

import model.Tv;
import model.WashingMachine;
import service.ServiceAppliance;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        ServiceAppliance serviceAppliance = new ServiceAppliance();
        
        System.out.println("Creando lavadora");
        WashingMachine wm = new WashingMachine();
        wm.createWashingMachine();
        serviceAppliance.showWashingMAchine(wm);
        
        
        System.out.println("\nCreando Televisor");
        Tv tv = new Tv();
        tv.createTv();
        
        
        serviceAppliance.showTv(tv);
        

    }
}

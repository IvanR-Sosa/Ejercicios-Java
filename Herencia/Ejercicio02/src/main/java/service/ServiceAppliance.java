package service;

import model.Tv;
import model.WashingMachine;

public class ServiceAppliance {
    
    public void showWashingMAchine(WashingMachine washingMachine){
        System.out.println("------LAVADORA------");
        System.out.println(washingMachine);
        System.out.printf("Precio Final : $ %.2f%n ",washingMachine.finalPrice());
    }
    
    public void showTv(Tv tv){
        System.out.println("-----TELEVISOR-----");
        System.out.println(tv);
        System.out.printf("Precio Final : $ %.2f%n ",tv.finalPrice());
    }
    
}

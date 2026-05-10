package service;

import java.util.ArrayList;
import model.Appliance;
import model.Tv;
import model.WashingMachine;

public class ServiceAppliance {
    
    public void showAppliance ( Appliance appliance){
        System.out.println(appliance.toString());
    }
    
   public double ListpriceAppliances (ArrayList<Appliance> appliances){
        Double total = 0.0;
        
        for (Appliance appliance : appliances) {
                total += appliance.finalPrice();
        }
        return total;       
    }
    
    
    
}

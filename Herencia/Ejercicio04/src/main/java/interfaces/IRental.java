package interfaces;

import model.Client;
import model.Rental;

public interface IRental {
    
   
    public void showRental (Rental rental);
    public Double finalPrice(Double base, Integer days);
    
}

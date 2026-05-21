package interfaces;

import java.util.List;
import model.Accommodation;
import model.ExtraHotel;
import model.Hotel;

public interface IMethodsAccommodations {

public void showMenuAccomodations(List <Accommodation> accommodations);    
public void showAllAccomodations (List <Accommodation> accommodations);
public List<Hotel> allHotels(List <Accommodation> accommodations);
public List<ExtraHotel> allCampingWithRestaurant (List <Accommodation> accommodations);
public List<Accommodation>allResidenceWithdDscount (List <Accommodation> accommodations);
}

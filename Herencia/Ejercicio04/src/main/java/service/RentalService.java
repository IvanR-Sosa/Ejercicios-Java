package service;

import interfaces.IRental;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import model.Client;
import model.Port;
import model.Rental;

public class RentalService implements IRental{
    
    private PortService portSevice = new PortService();
    Port port = new Port();

    

    @Override
    public void showRental(Rental rental) {
        portSevice.showPort(port);
        portSevice.berthAsignation(port, rental);
        
        Period period = Period.between(rental.getRentalDate(), rental.getReturnDate());
        Integer days =period.getDays();
        System.out.println("Days :  *********  " + days);
        Double base = rental.getBoat().getDailyRate();
        
        Double finalPriceRental = finalPrice(base, days);
        System.out.println("Su Contrato de renta cuenta con las siguientes especificaciones :");
        System.out.println(rental);
        System.out.println("Precio final : $ " + finalPriceRental);
        
        portSevice.showPort(port);
    }

    @Override
    public Double finalPrice(Double base, Integer days) {
        return base * days;
    }
    
}

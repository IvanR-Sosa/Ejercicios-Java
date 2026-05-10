
package com.example.ejercicio04;

import java.time.LocalDate;
import java.time.Month;
import model.Boat;
import model.Client;
import model.Rental;
import model.SailBoat;
import service.RentalService;

public class Ejercicio04 {

    public static void main(String[] args) {
        RentalService rs = new RentalService();
        Client c = new Client("Jossie", "34566787");
        Boat b = new SailBoat(5, "3544GT", 7.56, 1994);
        
        Rental r = new Rental(c, b, LocalDate.of(2026,5,15), LocalDate.of(2026,5, 25) );
        
        rs.showRental(r);
    }
}

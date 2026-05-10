package model;

import java.time.LocalDate;

public class Rental {

private Client client;
private Boat boat;
private LocalDate rentalDate;
private LocalDate returnDate;
private String berthPosition;

 public Rental(Client client, Boat boat, LocalDate rentalDate, LocalDate returnDate, String berthPosition) {
        this.client = client;
        this.boat = boat;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.berthPosition = berthPosition;
    }

    public Rental(Client client, Boat boat, LocalDate rentalDate, LocalDate returnDate) {
        this.client = client;
        this.boat = boat;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }
 

    public Rental() {
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getBerthPosition() {
        return berthPosition;
    }

    public void setBerthPosition(String berthPosition) {
        this.berthPosition = berthPosition;
    }

    @Override
    public String toString() {
        return String.format("%s \n %s \nFecha de Incio:  %s"
                + "\nFecha de retorno: %s"
                + "\nPosicion del Amarre:   %s ", client,boat,this.rentalDate,this.returnDate,this.berthPosition);
    }

   




    
}

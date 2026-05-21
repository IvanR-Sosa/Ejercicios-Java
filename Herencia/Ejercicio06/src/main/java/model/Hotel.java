package model;

public abstract class Hotel extends Accommodation{

    private Integer numberOfRooms;
    private Integer numberOfBeds;
    private Integer numberOfFloors;

    public Hotel() {
        
    }
    

    public Hotel(Integer numberOfRooms, Integer numberOfBeds, Integer numberOfFloors, String name, String address, String town, String manager) {
        super(name, address, town, manager);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBeds = numberOfBeds;
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }
    

    public abstract Integer pricePerRoom();
    
    @Override
    public String toString() {
        return String.format("%s | ️ %d habitaciones, %d camas, %d pisos\n",
                super.toString(), numberOfRooms, numberOfBeds, numberOfFloors);
    }
    
}

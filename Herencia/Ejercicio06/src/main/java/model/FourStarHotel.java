package model;

public class FourStarHotel extends Hotel{

    private Gym gym;
    private Restaurant restaurant;

    public FourStarHotel(Gym gym, Restaurant restaurant, Integer numberOfRooms, Integer numberOfBeds, Integer numberOfFloors, String name, String address, String town, String manager) {
        super(numberOfRooms, numberOfBeds, numberOfFloors, name, address, town, manager);
        this.gym = gym;
        this.restaurant = restaurant;
    }

    public Gym getGym() {
        return gym;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
    
    

    @Override
    public Integer pricePerRoom() {
        Integer pr = 50 + (1* this.getNumberOfBeds()) +(gym.calculateAddValue()) +(restaurant.calculateAddValue());
        return pr;

    }
    @Override
public String toString() {
    return String.format("**** %s | ️ Gimnasio: %s | ️ Restaurante: %s \n\n",
            super.toString(), 
            gym != null ? gym.getType() : "N/A", 
            restaurant != null ? restaurant.getName() : "N/A");
}
}

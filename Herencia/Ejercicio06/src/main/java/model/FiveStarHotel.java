package model;

import interfaces.IAddedValue;

public class FiveStarHotel extends Hotel implements IAddedValue{
    
    private Gym gym;
    private Restaurant restaurant;
    private Integer conferenceRooms;
    private Integer numberOfSuites;
    private Integer numberOfLimos;

    public FiveStarHotel(Gym gym, Restaurant restaurant, Integer conferenceRooms, Integer numberOfSuites, Integer numberOfLimos, Integer numberOfRooms, Integer numberOfBeds, Integer numberOfFloors, String name, String address, String town, String manager) {
        super(numberOfRooms, numberOfBeds, numberOfFloors, name, address, town, manager);
        this.gym = gym;
        this.restaurant = restaurant;
        this.conferenceRooms = conferenceRooms;
        this.numberOfSuites = numberOfSuites;
        this.numberOfLimos = numberOfLimos;
    }

    public Gym getGym() {
        return gym;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Integer getConferenceRooms() {
        return conferenceRooms;
    }

    public Integer getNumberOfSuites() {
        return numberOfSuites;
    }

    public Integer getNumberOfLimos() {
        return numberOfLimos;
    }
    
    

    @Override
    public Integer pricePerRoom() {
        Integer pr = 50 + (1*this.getNumberOfBeds()) + gym.calculateAddValue() + restaurant.calculateAddValue() + calculateAddValue();
        return  pr;
    }

    @Override
    public Integer calculateAddValue() {
        return (this.numberOfLimos * 15);

    }
    @Override
public String toString() {
    return String.format("***** %s | ️ Gimnasio: %s | ️ %s |  Limos: %d |  Suites: %d |  Salas Conf: %d \n\n",
            super.toString(),
            gym != null ? gym.getType() : "N/A",
            restaurant != null ? restaurant.getName() : "N/A",
            numberOfLimos, numberOfSuites, conferenceRooms);
}
    
}

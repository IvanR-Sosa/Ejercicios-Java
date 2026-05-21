package model;

public class CampingExtraHotel  extends ExtraHotel{

    private Integer tents;
    private Integer bathRooms;
    private Boolean hasARestaurant;

    public CampingExtraHotel(Integer tents, Integer bathRooms, Boolean hasARestaurant, Boolean isprivate, Double surface, String name, String address, String town, String manager) {
        super(isprivate, surface, name, address, town, manager);
        this.tents = tents;
        this.bathRooms = bathRooms;
        this.hasARestaurant = hasARestaurant;
    }

    public Integer getTents() {
        return tents;
    }

    public Integer getBathRooms() {
        return bathRooms;
    }

    public Boolean getHasARestaurant() {
        return hasARestaurant;
    }
    
    @Override
public String toString() {
    return String.format(" %s |  Tiendas: %d |  Baños: %d |  Tiene Restaurante: %s \n\n",
            super.toString(), tents, bathRooms, hasARestaurant ? "Sí" : "No");
}
    
}

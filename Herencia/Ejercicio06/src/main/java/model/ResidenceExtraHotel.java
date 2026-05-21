package model;

public class ResidenceExtraHotel extends ExtraHotel {

    private Integer numberOfRooms;
    private Boolean hasGuildDiscount;
    private Boolean hasSportFiled;

    public ResidenceExtraHotel(Integer numberOfRooms, Boolean hasGuildDiscount, Boolean hasSportFiled, Boolean isprivate, Double surface, String name, String address, String town, String manager) {
        super(isprivate, surface, name, address, town, manager);
        this.numberOfRooms = numberOfRooms;
        this.hasGuildDiscount = hasGuildDiscount;
        this.hasSportFiled = hasSportFiled;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public Boolean getHasGuildDiscount() {
        return hasGuildDiscount;
    }

    public Boolean getHasSportFiled() {
        return hasSportFiled;
    }
    
    @Override
public String toString() {
    return String.format("🏢 %s | 🛏️ Habitaciones: %d | 🎓 Descuento Gremio: %s | ⚽ Campo Deportivo: %s \n\n",
            super.toString(), numberOfRooms, 
            hasGuildDiscount ? "Sí" : "No", 
            hasSportFiled ? "Sí" : "No");
}
}

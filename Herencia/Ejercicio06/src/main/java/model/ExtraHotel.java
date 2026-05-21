package model;

public class ExtraHotel extends Accommodation{

    private Boolean isprivate;
    private Double surface;

    public ExtraHotel() {
    }
    
    

    public ExtraHotel(Boolean isprivate, Double surface, String name, String address, String town, String manager) {
        super(name, address, town, manager);
        this.isprivate = isprivate;
        this.surface = surface;
    }

    public Boolean getIsprivate() {
        return isprivate;
    }

    public Double getSurface() {
        return surface;
    }
    
@Override
public String toString() {
    return String.format("%s |  Superficie: %.2f m² |  Privado: %s\n",
            super.toString(), surface, isprivate ? "Sí" : "No");
}
    
}

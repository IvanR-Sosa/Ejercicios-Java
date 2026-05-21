package model;

public class SportsCenter extends Build{

private Boolean isRoofed;

    public SportsCenter(Boolean isRoofed, Double height, Double width, Double lenght) {
        super(height, width, lenght);
        this.isRoofed = isRoofed;
    }

    public Boolean getIsRoofed() {
        return isRoofed;
    }
    



    @Override
    public Double calculateSurface() {
        return getLenght() * getWidth();
    }

    @Override
    public Double calculateVolume() {
        return calculateSurface() * getHeight();
    }

    @Override
    public String toString() {
        return String.format("Polideportivo :\n"
                + "Superfice :  %.2f  m2\n"
                + "Volumen : %.2f  m3 \n", calculateSurface(),calculateVolume());
    }
    
    
}

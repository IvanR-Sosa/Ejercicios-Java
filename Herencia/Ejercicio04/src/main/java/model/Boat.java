package model;



public abstract class Boat {
    
    private String registrationPlate;
    private Double length;
    private int manufacturingYear;

    public Boat(String registrationPlate, Double length, int manufacturingYear) {
        this.registrationPlate = registrationPlate;
        this.length = length;
        this.manufacturingYear = manufacturingYear;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

   
    public Double baseModulus() {
        return this.length * 10.0;
    }
    
    public abstract Double getDailyRate();

    @Override
    public String toString() {
          return String.format(
            "\nMatrícula: %-10s \n   Eslora: %-6.2f m \n   Año: %-4d \n   Tarifa Diaria Base: $%.2f \n",
            registrationPlate,
            length,
            manufacturingYear,
            baseModulus() // Asumimos que getBaseModulus() existe en el padre
        );
    }
    
    
    
    
}

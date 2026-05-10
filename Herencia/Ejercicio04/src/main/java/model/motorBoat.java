package model;

public class motorBoat extends Boat {
    private Integer enginePower;

    public motorBoat(Integer CV, String registrationPlate, Double length, int manufacturingYear) {
        super(registrationPlate, length, manufacturingYear);
        this.enginePower = CV;
    }
    

    @Override
    public Double getDailyRate() {
        return baseModulus() +this.enginePower;
    }

    @Override
    public String toString() {
         return String.format(
            "[%s] %s | Potencia: %-5d CV | Tarifa Diaria Total: $%.2f",
            "Barco a motor",
            super.toString(),
            enginePower,
            getDailyRate()
        );
    }
    
    

    
}

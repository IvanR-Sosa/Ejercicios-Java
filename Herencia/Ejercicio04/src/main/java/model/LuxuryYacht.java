package model;


public class LuxuryYacht extends Boat{
    
    private Integer enginePower;
    private Integer cabinCount;

    public LuxuryYacht(Integer enginePower, Integer cabinCount, String registrationPlate, Double length, int manufacturingYear) {
        super(registrationPlate, length, manufacturingYear);
        this.enginePower = enginePower;
        this.cabinCount = cabinCount;
    }
    

    @Override
    public Double getDailyRate() {
        return baseModulus() + this.enginePower + this.cabinCount;
    }

    @Override
    public String toString() {
        return String.format(
            "[%s] %s | Potencia: %-6.1f CV | Camarotes: %-2d | Tarifa Diaria Total: $%.2f",
            "Yate de lujo",
            super.toString(),
            enginePower,
            cabinCount,
            getDailyRate()
        );
        
    }
    
    

}


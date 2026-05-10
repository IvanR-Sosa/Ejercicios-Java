package model;

public class SailBoat extends Boat{
    
    private Integer mastCount;

    public SailBoat(Integer mastCount, String registrationPlate, Double length, int manufacturingYear) {
        super(registrationPlate, length, manufacturingYear);
        this.mastCount = mastCount;
    }

    public Integer getMastCount() {
        return mastCount;
    }

    public void setMastCount(Integer mastCount) {
        this.mastCount = mastCount;
    }

    @Override
    public Double getDailyRate() {
        return baseModulus() + this.mastCount;
    }

    @Override
    public String toString() {
         return String.format(
            "[%s] %s | Mástiles: %-2d | Tarifa Diaria Total: $%.2f",
            "Velero",
            super.toString(), 
            mastCount,
            getDailyRate()
        );
    }
    
  
   
    
    
}

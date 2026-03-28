package model;

public class WaterGun {

    private Integer currentPosition;
    private Integer waterPosition;

    public WaterGun() {
    }

    public WaterGun(Integer currentPosition, Integer waterPosition) {
        this.currentPosition = currentPosition;
        this.waterPosition = waterPosition;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Integer getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(Integer waterPosition) {
        this.waterPosition = waterPosition;
    }

    @Override
    public String toString() {
        return "Posicion Actual : " + this.currentPosition + "\nPosicion del agua: " + this.waterPosition;
    }
    
    
    
}

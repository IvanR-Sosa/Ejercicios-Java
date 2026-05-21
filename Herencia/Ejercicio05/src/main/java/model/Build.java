package model;

public abstract class Build {

private Double height;
private Double width;
private Double lenght;

    public Build(Double height, Double width, Double lenght) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

public abstract Double calculateSurface();
public abstract Double calculateVolume();

    
}

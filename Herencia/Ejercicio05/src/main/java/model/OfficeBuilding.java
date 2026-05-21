package model;

public class OfficeBuilding extends Build {

private Integer numberOfOffices;
private Integer peoplePerOffice;
private Integer numberOfFloors;

    public OfficeBuilding(Integer peoplePerOffice, Integer numberOfFloors, Double height, Double width, Double lenght) {
        super(height, width, lenght);
        this.peoplePerOffice = peoplePerOffice;
        this.numberOfFloors = numberOfFloors;
        this.numberOfOffices = numberOfFloors;
    }

    public void cantPeople(){
        Integer peoplePerFloor = peoplePerOffice;
        Integer totalPeople = peoplePerFloor * this.numberOfFloors;
        
        System.out.println("Personas por oficina : " + peoplePerFloor);
        System.out.println("Total personas en el Edificio : " +totalPeople);
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
        return String.format("Edificio de oficinas :\n"
                + "Superfice :  %.2f  m2\n"
                + "Volumen : %.2f  m3 \n", calculateSurface(),calculateVolume());
    }
    
}

package model;

public class FamousSinger {


private String name;
private String recordWithTheMostSales;

    public FamousSinger() {
    }

    public FamousSinger(String name, String recordWithTheMostSales) {
        this.name = name;
        this.recordWithTheMostSales = recordWithTheMostSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordWithTheMostSales() {
        return recordWithTheMostSales;
    }

    public void setRecordWithTheMostSales(String recordWithTheMostSales) {
        this.recordWithTheMostSales = recordWithTheMostSales;
    }

    @Override
    public String toString() {
        return "Nombre Artista: " + this.name + "  Disco mas vendido: " + this.recordWithTheMostSales;
    }


}

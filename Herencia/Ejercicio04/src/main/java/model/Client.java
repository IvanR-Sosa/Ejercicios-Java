package model;

public class Client {

private String name;
private String dni;

    public Client(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("Datos del Cliente: "
                + "\nNombre :  %s"
                + "\nDNI: %s", this.name,this.dni);
    }


    
}

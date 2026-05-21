package model;

public abstract class Accommodation {

    private String name;
    private String address;
    private String town;
    private String manager;

    public Accommodation() {
    }
    

    public Accommodation(String name, String address, String town, String manager) {
        this.name = name;
        this.address = address;
        this.town = town;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTown() {
        return town;
    }

    public String getManager() {
        return manager;
    }
    
    @Override
    public String toString() {
        return String.format(" %s |  %s, %s | ️ Gerente: %s\n",
                name, address, town, manager);
    }
    
}

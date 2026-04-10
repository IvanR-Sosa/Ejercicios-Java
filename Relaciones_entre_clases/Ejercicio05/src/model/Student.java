package model;

public class Student {
    
    private String name;
    private String dni;
    private Integer votes;

    public Student() {
    }

    public Student(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.votes = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
    
    public void showName() {
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + "  DNI: " + this.dni + " Votos obtenidos: " + this.votes;
    }
    
    

    
}

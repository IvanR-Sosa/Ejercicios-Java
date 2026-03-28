package model;

public class Player {
    private Integer id;
    private String name;
    private Boolean damp;

    public Player() {
    }

    public Player(Integer id, String name, Boolean damp) {
        this.id = id;
        this.name = name;
        this.damp = damp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDamp() {
        return damp;
    }

    public void setDamp(Boolean damp) {
        this.damp = damp;
    }
    
    
}

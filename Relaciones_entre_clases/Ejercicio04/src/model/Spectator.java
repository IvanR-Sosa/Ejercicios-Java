package model;

public class Spectator {
    
    private String name;
    private Integer age;
    private Double availbleMoney;

    public Spectator() {
    }

    public Spectator(String name, Integer age, Double  availbleMoney) {
        this.name = name;
        this.age = age;
        this.availbleMoney = availbleMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double  getAvailbleMoney() {
        return availbleMoney;
    }

    public void setAvailbleMoney(Double  availbleMoney) {
        this.availbleMoney = availbleMoney;
    }
    
    
    
}

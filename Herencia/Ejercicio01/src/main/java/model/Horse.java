package model;

public class Horse extends Animal{

    public Horse() {
    }

    public Horse(String name, String food, Integer age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void getDiet() {
         super.getDiet();
        System.out.println(this.getFood());
    }


    
}

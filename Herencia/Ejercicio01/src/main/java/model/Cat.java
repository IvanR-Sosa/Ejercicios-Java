package model;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, String food, Integer age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void getDiet() {
        super.getDiet();
        System.out.println(this.getFood());
    }
    
    
}

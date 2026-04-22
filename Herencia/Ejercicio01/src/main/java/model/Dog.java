package model;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String food, Integer age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void getDiet() {
         super.getDiet();
        System.out.println(this.getFood());
    }

    

    
}

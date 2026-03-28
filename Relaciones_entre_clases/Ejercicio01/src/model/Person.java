package model;

public class Person {
    
    private String FirstName;
    private String lastName;
    private Integer age;
    private Integer id;
    private Dog dog; 
    
    public Person (){
        
    }

    public Person(String FirdtName, String lastName, int age, int id) {
        this.FirstName = FirdtName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
       
    }

    public String getFirdtName() {
        return FirstName;
    }

    public void setFirdtName(String FirdtName) {
        this.FirstName = FirdtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    
    //normalmente haria una interfaz con el metodo y de alli un servicio para implementar pero como es algo muy sencillo lo hare en esta ocasion desde la clase directamente
     
    public void adoptDog ( Dog dog){
        this.dog = dog;
    }

    @Override
    public String toString() {
        String dogData;
        if (this.dog == null) {
            dogData = "No es dueño de ninguna mascota";
        }else{
            dogData = this.dog.toString();
        }
        return "Datos de la Persona\nNombre: " + this.FirstName +"\nApellido: " + this.lastName +
                "\nDNI: " + this.id + "\nEdad: " + this.age + "\n" + dogData ;
    }
    
    
}

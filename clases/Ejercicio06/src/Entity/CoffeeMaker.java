package Entity;
/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos 
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y 
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al 
menos, los siguientes métodos:   
• Constructor predeterminado o vacío  
• Constructor con la capacidad máxima y la cantidad actual  
• Métodos getters y setters. 
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima.   
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza. 
• Método vaciarCafetera(): pone la cantidad de café actual en cero.   
*/
public class CoffeeMaker {

    private Double maximumCapacity;
    private Double currentCapacity;

    public CoffeeMaker() {
    }

    public CoffeeMaker(Double maximumCapacity, Double currentCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.currentCapacity = currentCapacity;
        showCapacity();
    }

    public Double getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public Double getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    
    
    public void fillCoffeeMaker () {
        this.currentCapacity = this.maximumCapacity;
        showCapacity();
    }
    
    public void serveCup (String cupSize, Integer amountOfCups){
        Double cupsToServe = 0.0;
        switch (cupSize) {
            case "small":
                Double smallCup = 0.5;
                 cupsToServe = smallCup * amountOfCups;
                if (cupsToServe > this.currentCapacity) {
                    System.out.println("Capacidad actual para servir : " + this.currentCapacity +  " VS tu pedido: " + cupsToServe);
                    System.out.println("Lo sentimos no tenemos esa cantidad en un momento la recargamos ");
                }else{
                    System.out.println("Pedido completado con exito");
                    System.out.println("Tus tazas de cafe : " + amountOfCups);
                    this.currentCapacity -=cupsToServe;
                }
                break;
            case "medium":
                Double mediumCup = 1.5;
                cupsToServe = mediumCup * amountOfCups;
                if (cupsToServe > this.currentCapacity) {
                    System.out.println("Capacidad actual para servir : " + this.currentCapacity +  " VS tu pedido: " + cupsToServe);
                    System.out.println("Lo sentimos no tenemos esa cantidad en un momento la recargamos ");
                }else{
                    System.out.println("Pedido completado con exito");
                    System.out.println("Tus tazas de cafe : " + amountOfCups);
                    this.currentCapacity -=cupsToServe;
                }
                break;
                 case "large":
                Double largeCup = 2.5;
                cupsToServe = largeCup * amountOfCups;
                if (cupsToServe > this.currentCapacity) {
                    System.out.println("Capacidad actual para servir : " + this.currentCapacity +  " VS tu pedido: " + cupsToServe);
                    System.out.println("Lo sentimos no tenemos esa cantidad en un momento la recargamos ");
                }else{
                    System.out.println("Pedido completado con exito");
                    System.out.println("Tus tazas de cafe : " + amountOfCups);
                    this.currentCapacity -=cupsToServe;
                }
                break;
            default:
                System.out.println("Lo sentimos no manejamos esa referencia intenta nuevamente con una de nuestras generosas opciones ;) ");
        }
        showCapacity();
    }
    public void emptyCoffePot(){
        this.currentCapacity = 0.0;
        showCapacity();
    }
    private void showCapacity (){
        System.out.println("Capacidad Maxima : " + this.maximumCapacity);
        System.out.println("Capacidad Actual : " + this.currentCapacity);
        System.out.println("---------------------------------------------------------");
    }
}

package Entity;
/*Realizar una clase llamada Matemática que tenga como atributos dos números reales 
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener 
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se 
usará el Math.random para generar los dos números y se guardaran en el objeto con 
su respectivos set.  Deberá además implementar los siguientes métodos:  
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
 elevado al menor número. Previamente se deben redondear ambos valores.
 • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número*/
public class Matematica {
    
    private Double numberOne;
    private Double numberTwo;

    public Matematica() {
    }

    
    public Matematica(Double numberOne, Double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }
    
    public Double getMax(){
        return (this.numberOne >= this.numberTwo) ? this.numberOne : this.numberTwo;
    }
    public Double calculatePower ( ){
        long n1=Math.round(this.numberOne);
        long n2=Math.round(this.numberTwo);
        
        long max = Math.max(n1, n2);
        long min = Math.min(n1, n2);
        
        return Math.pow(max, min);
    }
    public Double calculateSquareRoot (){
       Double min = Math.min(this.numberOne, this.numberTwo);
       min = Math.abs(min);
       
       return Math.sqrt(min);
    }
    

    
}

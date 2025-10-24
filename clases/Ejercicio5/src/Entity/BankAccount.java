package Entity;

import java.util.Scanner;

/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los 
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las 
operaciones asociadas a dicha clase son:  
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
• Agregar los métodos getters y setters correspondientes  
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a  
ingresar y se la sumara a saldo actual. 
• Método retirar(double retiro): el método recibe una cantidad de dinero a  retirar y 
se la restará al saldo actual. 
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar 
que el usuario no saque más del 20%. 
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.  
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */
public class BankAccount {
    
    private Integer accountNumber;
    private Long DNI;
    private Double balance;
    
    public BankAccount (){
        createAccount();
    }
    public BankAccount(Integer accountNumber, Long DNI, Double balance){
        this.accountNumber = accountNumber;
        this.DNI = DNI;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
    public void createAccount (){
        Scanner scanner = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese DNI");
        this.DNI = scanner.nextLong();
        System.out.println("Ingrese el numero asignado a su cuenta");
        this.accountNumber = scanner.nextInt();
        System.out.println("Ingrese el monto de apertura para activar su cuenta  $");
        this.balance = scanner.nextDouble();
        scanner.close();
        
    }
    public void depositMoney(Double amount){
        if (amount > 0) {
        this.balance += amount;
            System.out.println("Deposito Exitoso\n");
        }
    }
    public void withdrawMoney (Double amount){
        if (amount >= this.balance) {
            System.out.println("Fondos Insuficientes\n");
        }else{
            this.balance -= amount;
            System.out.println("Retiro Exitoso\n");
        }
    }
    public void quickWithdrawalOfMoney(){
        if (this.balance >10) {
            Double average = 0.20;
        Double cashAverage = this.balance * average;
        this.balance -= cashAverage;
            System.out.println("Retiro rapido Exitoso\n");
        }else{
            System.out.println("Transaccion no permitida\n");
        }
    }
     public void checkBalance(){
         System.out.println("Saldo actual: $ " + this.balance);
     }
     public void queryData(){
         System.out.println("------Datos relacionados al usuario------------");
         System.out.println("N° de cuenta : " + this.accountNumber);
         System.out.println("DNI : " + this.DNI);
         System.out.println("Saldo actual: " +this.balance);
     }
    
    
    
}

package ejercicio5;

import Entity.BankAccount;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount();
        ba.depositMoney(58.0);
        ba.checkBalance();
        ba.withdrawMoney(12.0);
        ba.checkBalance();
        ba.quickWithdrawalOfMoney();
        ba.queryData();
        

    }
    
}

package ex130.application;

import ex130.entities.Account;
import ex130.entities.BussinesAccount;
import ex130.entities.SavingsAccount;

public class TestHeritage {

    public static void main(String[] args) {
        
        Account acc = new Account(1001, "Alex", 0.0);
        BussinesAccount bacc = new BussinesAccount(1002, "Maria", 0.0,500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING
        BussinesAccount acc4 = (BussinesAccount)acc2;
        acc4.loan(100);

        //BussinesAccount acc5 = (BussinesAccount)acc3;//íra dar erro ao executar: Exception in thread "main" java.lang.ClassCastException: class ex130.entities.SavingsAccount cannot be cast to class ex130.entities.BussinesAccount (ex130.entities.SavingsAccount and ex130.entities.BussinesAccount are in unnamed module of loader 'app')

        if(acc3 instanceof BussinesAccount){
            BussinesAccount acc5 = (BussinesAccount)acc3;
            acc5.loan(200.0);
            System.out.println("loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc6 = new Account(1008, "Willquer", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1009, "Julio", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BussinesAccount(1010, "Sophia", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }
}

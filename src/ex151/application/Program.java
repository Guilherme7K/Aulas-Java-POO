package ex151.application;

import ex147.model.exceptions.DomainException;
import ex151.model.entites.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.println(account);

        } catch (DomainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
    }
}

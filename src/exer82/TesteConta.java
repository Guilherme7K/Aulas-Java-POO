package exer82;

import java.util.Locale;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBanco conta1 = new ContaBanco();
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        System.out.println();
        System.out.print("Is there na initial deposit (y/n)?" );
        String dp = sc.next();
        System.out.println();

        
        if(dp.equals("y")){
            System.out.println("Enter initial deposit value: ");
            double valorI = sc.nextDouble();
             conta1 = new ContaBanco(number, holder, valorI);
        }else{
             conta1 = new ContaBanco(number, holder);
            
        }
        System.out.println("Account data: ");
        System.out.println(conta1);
        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        conta1.entryDeposit(value);
        System.out.println("Update account data: ");
        System.out.println(conta1);
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        conta1.outDeposit(value);
        System.out.println("Update account data: ");
        System.out.println(conta1);
sc.close();
    }
}

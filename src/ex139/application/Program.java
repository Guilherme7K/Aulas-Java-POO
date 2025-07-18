package ex139.application;

import ex139.entities.Company;
import ex139.entities.Individual;
import ex139.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            if(ch == 'i'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double expenses = sc.nextInt();
                list.add(new Individual(name, anualIncome, expenses));
            }
            else{
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employer: ");
                int number = sc.nextInt();
                list.add(new Company(name, anualIncome, number));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for(TaxPayer tp : list){
            sum += tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }
        System.out.println();
        System.out.println("TOTAL TAXES: " + ": $ " + String.format("%.2f", sum));

        sc.close();
    }
}

package exer70;

import java.util.Locale;
import java.util.Scanner;

public class TesteEmployee {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee funcionario = new Employee();
    System.out.print("Name: ");
    funcionario.name = sc.nextLine();
    System.out.print("Gross salary: ");
    funcionario.grossSalary = sc.nextDouble();
    System.out.print("Tax: ");
    funcionario.tax = sc.nextDouble();
    System.out.println();

    System.out.println(funcionario);
    System.out.println();
    System.out.print("Wich percentage to increase salary?");
    double percentage = sc.nextDouble();
    funcionario.increaseSalary(percentage);
    System.out.println();
    System.out.println(funcionario);
    sc.close();
}
}

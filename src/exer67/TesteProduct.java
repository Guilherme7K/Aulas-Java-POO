package exer67;

import java.util.Locale;
import java.util.Scanner;

public class TesteProduct {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product = new Product();
    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.nome = sc.nextLine();
    System.out.print("Price: ");
    product.preco = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    product.quantidade = sc.nextInt();
    
    
    System.out.println();
    System.out.println("Product data: " + product);
    System.out.println();
    System.out.println("Enter the number of products to be added in stock: ");
    int quantidade = sc.nextInt();
    product.addProducts(quantidade);
    System.out.println();
    System.out.println("Updated data: " + product);
    System.out.println();
    System.out.println("Enter the number of products to be removed from stock: ");
    quantidade = sc.nextInt();
    product.removeProducts(quantidade);
    System.out.println();
    System.out.println("Updated data: " + product);
    sc.close();
}
}

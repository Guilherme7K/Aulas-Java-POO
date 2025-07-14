package ex136.application;

import ex135.entities.OutsourcedEmployee;
import ex136.entites.ImportedProduct;
import ex136.entites.Product;
import ex136.entites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used, or imported (c/u/i)");
            char ch = sc.next().charAt(0);
            if (ch == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            else if(ch == 'c'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(name, price));
            }else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manafacture date (DD/MM/YYYY)");
                Date manufactureDate= sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        System.out.println("PRICE TAGS");
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }
    }
}

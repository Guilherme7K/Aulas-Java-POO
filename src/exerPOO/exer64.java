package exerPOO;

import java.util.Scanner;

public class exer64 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the measures of triangle X: ");

    double x1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double x3 = sc.nextDouble();

    double p = (x1 + x2 + x3) /2;

    double areaX = Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
    
    

    System.out.println("Enter the measures of triangle y: ");

    double y1 = sc.nextDouble();
    double y2 = sc.nextDouble();
    double y3 = sc.nextDouble();

     p = (y1 + y2 + y3) /2;

    double areaY = Math.sqrt(p*(p-y1)*(p-y2)*(p-y3));
    
    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%",  areaY);

    if(areaX > areaY){
        System.out.println("Larger area: X");
    }else{
        System.out.println("Larger area: Y");
    }
    sc.close();
}
}

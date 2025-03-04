package ex94;

import java.util.Scanner;

public class TestePensionato {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Pensionato [] vect = new Pensionato[10];

    System.out.println("How many rooms will be rentend?: ");
    int n = sc.nextInt();
    sc.nextLine();
    for(int i=0; i<n; i++){
        System.out.println("Rent #" + (i+1) + ":");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Room: ");
        int room = sc.nextInt();
        sc.nextLine();
        vect[room] = new Pensionato(name, email);
    }

    System.out.println("Busy rooms:");
    for(int i=0; i<vect.length; i++){
        if(vect[i]!= null){
            System.out.println(i + ": " + vect[i]);
        }
    }
    sc.close();
}
}
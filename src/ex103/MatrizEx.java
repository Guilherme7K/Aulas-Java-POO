package ex103;
import java.util.Scanner;
public class MatrizEx {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [][] mat = new int [n][n];

    for(int i=0; i<mat.length; i++){
        for(int j=0; j<mat[i].length; j++){
            mat[i][j] = sc.nextInt();
        }
    }

    int sum = 0;
    System.out.println("Main diagonal: ");

    for(int i=0; i<mat.length; i++){
        for(int j=0; j<mat[i].length; j++){
            if(i == j){
                System.out.print(mat[i][j] + " ");
            }
            if(mat[i][j] < 0){
                sum++;
            }
        }
    }
    System.out.println();
    System.out.println("Negative numbers = " + sum);

    sc.close();
}
}

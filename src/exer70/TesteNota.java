package exer70;

import java.util.Locale;
import java.util.Scanner;

public class TesteNota {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    CalcNota aluno = new CalcNota();
    aluno.nome = sc.nextLine();
    aluno.nota1 = sc.nextDouble();
    aluno.nota2 = sc.nextDouble();
    aluno.nota3 = sc.nextDouble();
    System.out.println(aluno);

    sc.close();

}
}

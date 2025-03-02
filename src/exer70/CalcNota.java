package exer70;

public class CalcNota {
public String nome;
public double nota1;
public double nota2;
public double nota3;

public double calc(){
    return nota1 + nota2 + nota3;
}

public String verifica(){
    if(calc()>=60){
        return "PASS";
    }
    else{
        double falta = 60.0 - calc();
        return "FAILED \n" + "MISSING " + falta + " POINTS";
    }
}
public String toString(){
    return "FINAL GRADE = " + calc() + "\n" + verifica();
}
}

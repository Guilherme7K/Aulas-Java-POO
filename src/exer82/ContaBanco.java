package exer82;

public class ContaBanco {
private int number;
private String holder;
private double deposit;

public ContaBanco(){

}

public ContaBanco(int number, String holder) {
    this.number = number;
    this.holder = holder;
}


public ContaBanco(int number, String holder, double initialDeposit) {
    this.number = number;
    this.holder = holder;
    entryDeposit(initialDeposit);
}


public String getHolder() {
    return holder;
}


public void setHolder(String holder) {
    this.holder = holder;
}


public int getNumber() {
    return number;
}


public double getDeposit() {
    return deposit;
}

public void entryDeposit(double valor){
    this.deposit += valor;
}

public void outDeposit(double valor){
    this.deposit -= valor +5;
}


public String toString(){
    return "Account " + getNumber() + ", Holder: " + getHolder() + ", Balance: $ " + getDeposit();
}

}

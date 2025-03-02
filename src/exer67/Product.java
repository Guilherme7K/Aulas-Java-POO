package exer67;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public double vlrStock(){
        return preco * quantidade;
    }

    public void addProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        
        return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " units, Total: $ " + String.format("%.2f", vlrStock());
    }

    
}

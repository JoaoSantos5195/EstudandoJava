package ProdutoCRUD;

public class Produto {
    String nome, desc;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, String desc, int quantidade){
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }public String getDesc(){
        return desc;
    }public double getPreco(){
        return preco;
    }public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "nome= " + nome + "\nPreço= " + preco + "\nDescrição= " + desc + "\nQuantidade= " + quantidade;
    }
}

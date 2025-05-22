package Atividade3;

public abstract class Produto {
    String nome;
    double precoBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==""){
            throw new IllegalArgumentException("Nome vazio nao aceito");
        }
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if(precoBase<=0){
            throw new IllegalArgumentException("Preco menor igual a zero nao aceito");
        }
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco();
}

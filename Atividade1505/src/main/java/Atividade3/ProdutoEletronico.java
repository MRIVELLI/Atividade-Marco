package Atividade3;

public class ProdutoEletronico extends Produto {
    double precoVarejo;

    public double getPrecoVarejo() {
        return precoVarejo;
    }

    public void setPrecoVarejo() {
        this.calcularPreco();
    }

    public double calcularPreco(){
        this.precoVarejo = this.precoBase*0.90f;
        return this.precoVarejo;
    }
}

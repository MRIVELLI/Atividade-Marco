package Atividade3;

public class ProdutoRoupa extends Produto {
    double precoEtiqueta;

    public double getPrecoEtiqueta() {
        return precoEtiqueta;
    }

    public void setPrecoEtiqueta() {
        this.calcularPreco();
    }

    public double calcularPreco(){
        this.precoEtiqueta = this.precoBase*0.8;
        return this.precoEtiqueta;
    }
}

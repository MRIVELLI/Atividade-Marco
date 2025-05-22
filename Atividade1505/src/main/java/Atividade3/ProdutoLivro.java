package Atividade3;

public class ProdutoLivro extends Produto{
    double precoCapa;

    public double getPrecoCapa() {
        return precoCapa;
    }

    public void setPrecoCapa(double precoCapa) {
        this.precoCapa = precoCapa;
    }
    public double calcularPreco(){
        this.precoCapa = this.precoBase*0.95f;
        return this.precoCapa;
    }
}

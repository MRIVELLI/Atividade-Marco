package Aula1505;

public class Retangulo extends FormaGeometrica{
double largura;
double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura<=0){
            throw  new IllegalArgumentException("Largura negativa nao aceita");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<=0){
            throw  new IllegalArgumentException("Altura negativa nao aceita");
        }
        this.altura = altura;
    }

    public double calcularArea() {
    return largura*altura;
    }


    public double calcularPerimetro() {

        return 2*(largura+altura);
    }
}

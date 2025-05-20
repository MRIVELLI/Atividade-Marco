package Aula1505;

public class Circulo extends FormaGeometrica{

    double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio<=0){
            throw new IllegalArgumentException("Raio nao pode ser negativo");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return 3.14f*this.raio*this.raio ;

    }

    public double calcularPerimetro() {
        return 3.14f*2*raio;
    }
}

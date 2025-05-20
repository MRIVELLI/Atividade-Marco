package Atividade2;

public abstract class Funcionario {
    double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal<=0){
            throw new IllegalArgumentException("Salario nao aceito");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract double calcularPagamento();
    //public abstract double calcularPagamento(double bonus);
}

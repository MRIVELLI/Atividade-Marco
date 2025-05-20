package Atividade2;

public class Diretor extends Funcionario{
    double lucroEmpresa;

    public double getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(double lucroEmpresa) {
        if(lucroEmpresa<0){
            throw new IllegalArgumentException("Lucro da empresa nao aceito");
        }
        this.lucroEmpresa = lucroEmpresa;
    }

    public double calcularPagamento() {
        return this.salarioMensal+ 0.01*lucroEmpresa;
    }
}

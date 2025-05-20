package Atividade2;

public class Gerente extends Funcionario{
    double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if(bonus<0){
            throw new IllegalArgumentException("Bonus negativo nao aceito");
        }
        this.bonus = bonus;
    }

    public double calcularPagamento(){
        return this.salarioMensal + this.bonus;
    }

}

package Atividade2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {


    @Test
    void deveTestarSetSalarioMensal(){
        Gerente gerente = new Gerente();
        gerente.setSalarioMensal(1);
        assertEquals(1,gerente.getSalarioMensal());
    }
    @Test
    void deveTestarSetSalarioMensalNegativo(){
        Gerente gerente = new Gerente();
        try {
            gerente.setSalarioMensal(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Salario nao aceito",e.getMessage());
        }
    }
    
    @Test
    void deveTestasetBonusNegativo() {
        Gerente gerente = new Gerente();
        try{
            gerente.setBonus(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Bonus negativo nao aceito", e.getMessage());
        }
    }
    @Test
    void deveTestasetBonus() {
        Gerente gerente = new Gerente();
        gerente.setBonus(1);
        assertEquals(1,gerente.getBonus());
    }

    @Test
    void calcularPagamento() {
        Gerente gerente = new Gerente();
        gerente.setSalarioMensal(1);
        gerente.setBonus(1);
        assertEquals(2,gerente.calcularPagamento());
    }
}
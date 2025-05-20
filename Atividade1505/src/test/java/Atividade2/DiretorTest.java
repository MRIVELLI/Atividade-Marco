package Atividade2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveTestarSetSalarioMensal(){
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(1);
        assertEquals(1,diretor.getSalarioMensal());
    }
    @Test
    void deveTestarSetSalarioMensalNegativo(){
        Diretor diretor = new Diretor();
        try {
            diretor.setSalarioMensal(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Salario nao aceito",e.getMessage());
        }
    }

    @Test
    void setLucroEmpresa() {
    Diretor diretor = new Diretor();
    try {
        diretor.setLucroEmpresa(-1);
        fail();
    }
    catch (IllegalArgumentException e){
        assertEquals("Lucro da empresa nao aceito", e.getMessage());
    }
    }
    @Test
    void calcularPagamento(){
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(1);
        diretor.setLucroEmpresa(100);
        assertEquals(2,diretor.calcularPagamento());
    }
    
}
package Atividade2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {
    @Test
    void deveTestarSetSalarioMensal(){
        FuncionarioComum funcionarioComum = new FuncionarioComum();
        funcionarioComum.setSalarioMensal(1);
        assertEquals(1,funcionarioComum.getSalarioMensal());
    }
    @Test
    void deveTestarSetSalarioMensalNegativo(){
        FuncionarioComum funcionarioComum = new FuncionarioComum();
        try {
            funcionarioComum.setSalarioMensal(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Salario nao aceito",e.getMessage());
        }
    }
}
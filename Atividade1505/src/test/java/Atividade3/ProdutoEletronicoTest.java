package Atividade3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveTestarsetNomeVazio(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        try {
            produtoEletronico.setNome("");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Nome vazio nao aceito", e.getMessage());
        }
    }
    @Test
    void deveTestarsetNome(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setNome("Marco Antônio");
        assertEquals("Marco Antônio",produtoEletronico.getNome());
    }
    @Test
    public void deveTestarpreoBaseMenosIgualAZero(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        try{
            produtoEletronico.setPrecoBase(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Preco menor igual a zero nao aceito", e.getMessage());
        }
    }
    @Test
    public void deveTestarpreoBasePositivo(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setPrecoBase(1.00f);
        assertEquals(1.00f,produtoEletronico.getPrecoBase());
    }
    @Test
    public void DevetestarCalcularPreco(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setPrecoBase(1.00f);
        produtoEletronico.calcularPreco();
        assertEquals(0.90f,produtoEletronico.getPrecoVarejo());
    }
}
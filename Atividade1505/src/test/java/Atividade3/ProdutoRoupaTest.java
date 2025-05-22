package Atividade3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {
    @Test
    void deveTestarsetNomeVazio(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        try {
            produtoRoupa.setNome("");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Nome vazio nao aceito", e.getMessage());
        }
    }
    @Test
    void deveTestarsetNome(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setNome("Marco Antônio");
        assertEquals("Marco Antônio",produtoRoupa.getNome());
    }
    @Test
    public void deveTestarpreoBaseMenosIgualAZero(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        try{
            produtoRoupa.setPrecoBase(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Preco menor igual a zero nao aceito", e.getMessage());
        }
    }
    @Test
    public void deveTestarpreoBasePositivo(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setPrecoBase(1);
        assertEquals(1,produtoRoupa.getPrecoBase());
    }
    @Test
    public void DevetestarCalcularPreco(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setPrecoBase(1);;
        produtoRoupa.calcularPreco();
        assertEquals(0.8,produtoRoupa.getPrecoEtiqueta());
    }
}
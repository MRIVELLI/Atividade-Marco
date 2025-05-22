package Atividade3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {
    @Test
    void deveTestarsetNomeVazio(){
        ProdutoLivro produtoLivro = new ProdutoLivro();
        try {
            produtoLivro.setNome("");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Nome vazio nao aceito", e.getMessage());
        }
    }
    @Test
    void deveTestarsetNome(){
        ProdutoLivro produtoLivro = new ProdutoLivro();
        produtoLivro.setNome("Marco Antônio");
        assertEquals("Marco Antônio",produtoLivro.getNome());
    }
    @Test
    public void deveTestarpreoBaseMenosIgualAZero(){
        ProdutoLivro produtoLivro = new ProdutoLivro();
        try{
            produtoLivro.setPrecoBase(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Preco menor igual a zero nao aceito", e.getMessage());
        }
    }
    @Test
    public void deveTestarpreoBasePositivo(){
        ProdutoLivro produtoLivro = new ProdutoLivro();
        produtoLivro.setPrecoBase(1.00f);
        assertEquals(1.00f,produtoLivro.getPrecoBase());
    }
    @Test
    public void DevetestarCalcularPreco(){
        ProdutoLivro produtoLivro = new ProdutoLivro();
        produtoLivro.setPrecoBase(1.00f);
        produtoLivro.calcularPreco();
        assertEquals(0.95f,produtoLivro.getPrecoCapa());
    }
}
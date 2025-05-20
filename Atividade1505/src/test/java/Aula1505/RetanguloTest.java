package Aula1505;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveTestarLarguraNegativa(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setLargura(0.f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Largura negativa nao aceita", e.getMessage());
        }
    }

    @Test
    void deveTestarLargura(){
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(1.f);
    }

    @Test
    void deveTestarAlturaNegativa(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(0.f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Altura negativa nao aceita", e.getMessage());
        }
    }

    @Test
    void deveTestarAltura(){
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(1.f);
    }

    @Test
    void deveTestarCalcularArea(){
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(1.f);
        retangulo.setLargura(1.f);
        assertEquals(1,retangulo.calcularArea());
    }

    @Test
    void deveTestarCalcularPerimetro(){
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(1.f);
        retangulo.setLargura(1.f);
        assertEquals(4,retangulo.calcularPerimetro());
    }
}
package Aula1505;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveTestarRaioNegativo(){

        try {
            Circulo circulo = new Circulo();
            circulo.setRaio(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
        assertEquals("Raio nao pode ser negativo",e.getMessage());
        }
    }

    @Test
    void deveTestarRaioPositivo(){
        Circulo circulo = new Circulo();
        circulo.setRaio(1.0f);
        assertEquals(1.0f, circulo.getRaio());
    }

    @Test
    void deveCalcularArea(){
        Circulo circulo = new Circulo();
        circulo.setRaio(1);
        assertEquals(3.14f,circulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetro(){
        Circulo circulo = new Circulo();
        circulo.setRaio(1);
        assertEquals(6.28f,circulo.calcularPerimetro());
    }

}
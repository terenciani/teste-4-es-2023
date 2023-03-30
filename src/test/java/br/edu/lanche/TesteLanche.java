package br.edu.lanche;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifpr.lanche.Lanche;

public class TesteLanche {

    @Test
    public void testaXBacon(){
        int codigo = 3;
        int quantidade = 2;
        double saidaEsperada = 10;

        double respostaObtida = Lanche.calculaValorFinal(codigo, quantidade);

        assertEquals(saidaEsperada, respostaObtida, 2);
    }

    @Test
    public void testaTorradaSimples() {
        int codigo = 4;
        int quantidade = 3;
        double saidaEsperada = 6;

        double respostaObtida = Lanche.calculaValorFinal(codigo, quantidade);

        assertEquals(saidaEsperada, respostaObtida, 2);
    }
    
}

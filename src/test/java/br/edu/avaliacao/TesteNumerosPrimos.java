package br.edu.avaliacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.edu.ifpr.avaliacao.NumerosPrimos;

public class TesteNumerosPrimos {

    @Test
    public void numerosMenoresOuIguaisAUm(){
        for(int i = -5000; i <= 1; i++){
            assertFalse(NumerosPrimos.ehPrimo(i));
        }
    }

    @Test
    public void numerosPrimos() {
        int[] primos = {2, 3, 5, 7, 11, 17, 19};
        for (int i = 0; i < primos.length; i++) {
            assertTrue(NumerosPrimos.ehPrimo(primos[i]));
        }
    }

    @Test
    public void numerosNaoPrimos() {
        int[] primos = { 6, 8, 9, 10, 12, 14, 15, 16 };
        for (int i = 0; i < primos.length; i++) {
            assertFalse(NumerosPrimos.ehPrimo(primos[i]));
        }
    }    
}

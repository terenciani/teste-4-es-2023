package br.edu.ifpr.avaliacao;

public class NumerosPrimos {

    public static boolean ehPrimo(int n) {

        for (int i = 2; i < n; i++) {
            if( n % i == 0)
                return false;
        }

        return n <= 1 ? false : true;
    }
}

package br.edu.ifpr.avaliacao;

public class Triangulo {

    public static Object qualTriangulo(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return "Invalido";
        
        if( a + b <= c || a + c <= b || b + c <= a){
            return "Invalido";
        } else if( a == b && b == c){
            return "Valido-Equilatero";
        } else if (a != b && a != c && b != c){
            return "Valido-Escaleno";
        }
        
        return "Valido-Isoceles";
    }

}

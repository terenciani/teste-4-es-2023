package br.edu.avaliacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifpr.avaliacao.Triangulo;

public class TesteTriangulo {
    @Test
    public void naoEhTriangulo(){
        assertEquals("Invalido", Triangulo.qualTriangulo(0, 0 ,0)); // 6.1 -> 18
        assertEquals("Invalido", Triangulo.qualTriangulo(4, 0, 0)); // 6.1 -> 6.2 -> 18
        assertEquals("Invalido", Triangulo.qualTriangulo(4, 4, 0)); // 6.1 -> 6.2 -> 6.3 -> 18
        
        assertEquals("Invalido", Triangulo.qualTriangulo(4, 6, 2)); //
        assertEquals("Invalido", Triangulo.qualTriangulo(2, 4, 6)); //
        assertEquals("Invalido", Triangulo.qualTriangulo(6, 2, 4)); //
    }

    @Test
    public void trianguloEquilatero() {
        assertEquals("Valido-Equilatero", Triangulo.qualTriangulo(3, 3, 3));
    }

    @Test
    public void trianguloIsosceles() {
        assertEquals("Valido-Isoceles", Triangulo.qualTriangulo(3, 3, 4));
        assertEquals("Valido-Isoceles", Triangulo.qualTriangulo(4, 3, 3));
        assertEquals("Valido-Isoceles", Triangulo.qualTriangulo(3, 4, 3));
    }

    @Test
    public void trianguloEscaleno() {
        assertEquals("Valido-Escaleno", Triangulo.qualTriangulo(3, 5, 4));
        assertEquals("Valido-Escaleno", Triangulo.qualTriangulo(4, 3, 5));
        assertEquals("Valido-Escaleno", Triangulo.qualTriangulo(5, 4, 3));
    }
}

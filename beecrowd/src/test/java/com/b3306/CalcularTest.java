package com.b3306;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularTest {

    @Test
    public void testeParticao() {
        int[] vetor = {0, 2, 4, 6}; 
        Calcular calcula = new Calcular(vetor);

        calcula.adicionar(1, 2, 2); 
        assertEquals(2, calcula.maximoDivisorComum(1, 3));
    }

    @Test
    public void testeValorLimite() {
	// limite = 1
        int[] vetor = {0, 7}; 
        Calcular calcula = new Calcular(vetor);

        assertEquals(7, calcula.maximoDivisorComum(1, 1));
        calcula.adicionar(1, 1, 3); 
        assertEquals(10, calcula.maximoDivisorComum(1, 1));
    }

}

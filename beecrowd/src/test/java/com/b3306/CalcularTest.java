package com.b3306;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularTest {

    @Test
    public void testeParticaoValida() {
        int[] vetor = {0, 2, 4, 6}; // começa do índice 1
        Calcular processor = new Calcular(vetor);

        processor.adicionar(1, 2, 2); // vetor vira [0, 4, 6, 6]
        assertEquals(2, processor.maximoDivisorComum(1, 3));
    }

}

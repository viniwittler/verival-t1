package com.b3306;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class CalcularTest {

	//Partição  
	@Test
	public void testeMDC_MesmoDivisor() {
	    int[] entrada = {4, 6, 8};
	    Calcular calcular = new Calcular(entrada);
	    assertEquals(2, calcular.maximoDivisorComum(0, 2));
	}
	
	@Test
	public void testeMDC_ValoresSemDivisor() {
	    int[] entrada = {5, 9, 14};
	    Calcular calcular = new Calcular(entrada);
	    assertEquals(1, calcular.maximoDivisorComum(0, 2));
	}
	
	@Test
	public void testeMDC_Iguais() {
	    int[] entrada = {6, 6, 6};
	    Calcular calcular = new Calcular(entrada);
	    assertEquals(6, calcular.maximoDivisorComum(0, 2));
	}

    //Valor Limite
    @Test
    void testeMDC__ValorLimite() {
        int[] entrada = new int[100_000];
        Arrays.fill(entrada, 1000); 
        Calcular calcular = new Calcular(entrada);

        assertEquals(1000, calcular.maximoDivisorComum(0, entrada.length - 1));
    }

	//Contrato
	@Test
	public void testeContrato() {
		int[] entrada = {4, 6, 8};
		Calcular calcular = new Calcular(entrada);
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			calcular.maximoDivisorComum(-1, 2);
		});

		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			calcular.maximoDivisorComum(0, 5); 
		});

		assertEquals(2, calcular.maximoDivisorComum(0, 2));
	}

		
	//propriedade
	@Test
	public void testePropriedade() {
		int[] vetor = {5, 8};
		Calcular calcular = new Calcular(vetor);
		assertEquals(5, calcular.maximoDivisorComum(0, 0));
		assertEquals(8, calcular.maximoDivisorComum(1, 1));
	}

	// @Test
	// public void testeMDC_MesmoDivisor_Erro() {
	//     int[] entrada = {4, 6, 8};
	//     Calcular calcular = new Calcular(entrada);
	//     assertEquals(1, calcular.maximoDivisorComum(0, 2));
	// }
	
	// @Test
    // void testeMDC__ValorLimite_Erro() {
    //     int[] entrada = new int[100_001];
    //     Arrays.fill(entrada, 1000); 
    //     Calcular calcular = new Calcular(entrada);

    //     assertEquals(1000, calcular.maximoDivisorComum(0, entrada.length - 1));
    // }

	// @Test
	// public void testePropriedade_Erro() {
	// 	int[] vetor = {5, 8};
	// 	Calcular calcular = new Calcular(vetor);
	// 	assertEquals(1, calcular.maximoDivisorComum(0, 0));
	// 	assertEquals(2, calcular.maximoDivisorComum(1, 1));
	// }
		
	// @Test
	// public void testeContrato_Invalido_Erro() {
	// 	int[] entrada = {4, 6, 8};
	// 	Calcular calcular = new Calcular(entrada);
		
	// 	assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
	// 		calcular.maximoDivisorComum(-1, 2);
	// 	});

	// 	assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
	// 		calcular.maximoDivisorComum(0, 2); 
	// 	});

	// 	assertEquals(2, calcular.maximoDivisorComum(0, 2));
	// }
	
}

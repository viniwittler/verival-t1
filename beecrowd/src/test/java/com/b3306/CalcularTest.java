package com.b3306;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularTest {

	//Partição de equivalencia
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

}

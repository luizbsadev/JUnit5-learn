package com.samples.assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.domain.Calculadora;

public class AssertionsSampleTeste {

	
	/*
	 * Assertions comuns exemplos
	 */
	@Test
	public void comuns() {
		Assertions.assertEquals(6, Calculadora.somarStatico(5, 1));
		Assertions.assertNotEquals(5, Calculadora.somarStatico(1,5));
		
		Boolean bool1 = Calculadora.somarStatico(1, 2) == 3;
		Assertions.assertTrue(bool1);
		
		Boolean bool2 = Calculadora.somarStatico(1, 2) == 4;
		Assertions.assertFalse(bool2);
		
		Assertions.assertThrows(ArithmeticException.class, () -> Calculadora.dividir(0, 0));
		
		Assertions.assertAll(
			() -> assertEquals(0, 0),
			() -> assertNotEquals(0, 1)
		);
	}
}

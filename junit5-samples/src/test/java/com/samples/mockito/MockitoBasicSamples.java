package com.samples.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.domain.Calculadora;

public class MockitoBasicSamples {

	
	@Test
	/*
	 * Mock de metodo statico
	 */
	public void testarSomarStaticoComMock() {
		try(MockedStatic<Calculadora> mockStatic = Mockito.mockStatic(Calculadora.class)){
			mockStatic.when(() -> Calculadora.somarStatico(1, 2)).thenReturn(4);
			
			assertEquals(4, Calculadora.somarStatico(1, 2));
		}
	}
	/*
	 * Mock de metodo não estatico
	 */
	@Test
	public void testarSomarNaoStaticoComMock() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.somarNaoStatico(1, 2)).thenReturn(4);
		
		assertEquals(4, calc.somarNaoStatico(1, 2));
	}
	
	/*
	 * Quando usamos thenReturn mais de uma vez
	 */
	@Test
	public void testarThenReturnRepetidasVezes() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.somarNaoStatico(1, 2))
		.thenReturn(4)
		.thenReturn(5);
		
		assertEquals(4, calc.somarNaoStatico(1, 2));
		assertEquals(5, calc.somarNaoStatico(1, 2));
		assertEquals(5, calc.somarNaoStatico(1, 2));
	}
	
	/*
	 * Mostrando que é possivel centralizar a criacao de um mock
	 */
	
	@Mock private Calculadora calc2;
	
	public void centralizarCriacaoDoMock() {
		/*
		 * normalmente a linha "MockitoAnnotations.openMocks(this);" fica em um @BeforeEach
		 */
		MockitoAnnotations.openMocks(this);
		when(calc2.somarNaoStatico(1, 1)).thenReturn(10);
		
		assertEquals(10, calc2.somarNaoStatico(1, 1));
	}
}

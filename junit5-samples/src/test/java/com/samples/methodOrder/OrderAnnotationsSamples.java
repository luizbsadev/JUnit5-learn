package com.samples.methodOrder;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationsSamples {
	private static Integer numero = 0;
	
	
	@Test
	@Order(1)
	public void test1() {
		numero++;
		System.out.println("teste 1: numero = "+numero);
	}
	@Test
	@Order(3)
	public void test2() {
		numero++;
		System.out.println("teste 2: numero = "+numero);
		}
	@Test
	@Order(2)
	public void test3() {
		numero++;
		System.out.println("teste 3: numero = "+numero);
	}
}

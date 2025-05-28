package com.domain;

public class Calculadora {
	
	public static int somarStatico(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public static int subtrair(int valor1, int valor2) {
		return valor1 - valor2;
	}
	
	public static int dividir(int valor1, int valor2) {
		return valor1 / valor2;
	}
	
	public static int multiplicar(int valor1, int valor2) {
		return valor1 * valor2;
	}
	public int somarNaoStatico(int valor1, int valor2) {
		return valor1 + valor2;
	}
}

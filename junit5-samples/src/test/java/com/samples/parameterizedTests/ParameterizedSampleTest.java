package com.samples.parameterizedTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedSampleTest {

	@ParameterizedTest
	@ValueSource(strings = {"teste1", "teste2"})
	public void testarValueSource(String param) {
		System.out.println(param);
	}
	
	@ParameterizedTest
	@CsvSource(value= {
			"1, 2, 3",
			"4, 5, 6",
			"10, 20, 30"
	})
	public void testarCSVSource(int i, int z, int x) {
		System.out.println(i + z + x);
	}
}

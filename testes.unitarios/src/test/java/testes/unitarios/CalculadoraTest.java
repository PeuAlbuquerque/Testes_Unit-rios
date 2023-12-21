package testes.unitarios;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void testSomar() {
		int resultado = Calculadora.somar(10, 10);
		assertEquals(20, resultado);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivisaoPorZerp() {
		int resultado = Calculadora.dividir(10, 0);
		
	}
	@Test
	public void testDividir() {
		int resultado = Calculadora.dividir(10, 2);
		assertEquals(5, resultado);
	}
}

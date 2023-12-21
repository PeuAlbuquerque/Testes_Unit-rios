package testes.unitarios;

import static org.junit.Assert.*;

import org.junit.Test;

public class cadastrarEmailTest {

	@Test
	public void testEmailValido() {
		assertTrue(cadastrarEmail.validarEmail("professores@e2etreinamentos.com.br"));
		assertTrue(cadastrarEmail.validarEmail("professor@e2etreinamentos.com"));
		assertTrue(cadastrarEmail.validarEmail("aluno@e2etreinamentos.com.br"));
		
	}
	@Test
	public void testEmaiInvalido() {
		assertFalse(cadastrarEmail.validarEmail("e2etreinamentos.com.br"));
		assertFalse(cadastrarEmail.validarEmail("professor@"));
		
	}
}

package br.edu.ordenacao;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifpr.ordenacao.OrdenaVetor;

public class Introducao {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void init() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void finish() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}
	
	@Test
	public void caminhoABG() {
		int[] valores = { 2, 4 };
		OrdenaVetor.recebeDados(2, valores);
		assertEquals("2,42,4", outContent.toString().replaceAll("\\s+", ""));
	}

}
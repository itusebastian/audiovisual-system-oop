package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.Investigador;

class InvestigadorTest {

	@Test
	void testConstructorAndGetters() {
		Investigador inv = new Investigador("Carlos", "Biología");
		assertEquals("Carlos", inv.getNombre());
		assertEquals("Biología", inv.getEspecialidad());
	}

	@Test
	void testSetters() {
		Investigador inv = new Investigador("", "");
		inv.setNombre("Laura");
		inv.setEspecialidad("Química");
		assertEquals("Laura", inv.getNombre());
		assertEquals("Química", inv.getEspecialidad());
	}
}

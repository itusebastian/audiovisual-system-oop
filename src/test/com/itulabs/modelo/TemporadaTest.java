package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.Temporada;

class TemporadaTest {

	@Test
	void testConstructorAndGetters() {
		Temporada temp = new Temporada(2, 12);
		assertEquals(2, temp.getNumero());
		assertEquals(12, temp.getCantidadEpisodios());
	}

	@Test
	void testSetters() {
		Temporada temp = new Temporada(0, 0);
		temp.setNumero(3);
		temp.setCantidadEpisodios(20);
		assertEquals(3, temp.getNumero());
		assertEquals(20, temp.getCantidadEpisodios());
	}
}

package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.SerieDeTV;
import com.itulabs.modelo.Temporada;

class SerieDeTVTest {

	@Test
	void testConstructorAndGetters() {
		SerieDeTV serie = new SerieDeTV("Friends", 22, "Comedia");
		assertEquals("Friends", serie.getTitulo());
		assertEquals(22, serie.getDuracionEnMinutos());
		assertEquals("Comedia", serie.getGenero());
		assertNotNull(serie.getTemporadas());
		assertTrue(serie.getTemporadas().isEmpty());
	}

	@Test
	void testAgregarTemporada() {
		SerieDeTV serie = new SerieDeTV("Lost", 42, "Drama");
		Temporada temp = new Temporada(1, 25);
		serie.agregarTemporada(temp);
		assertEquals(1, serie.getTemporadas().size());
		assertEquals(temp, serie.getTemporadas().get(0));
	}
}

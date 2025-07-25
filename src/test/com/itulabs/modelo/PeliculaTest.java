package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.Actor;
import com.itulabs.modelo.Pelicula;

class PeliculaTest {

	@Test
	void testConstructorAndGetters() {
		Pelicula peli = new Pelicula("Matrix", 136, "Acción", "Warner");
		assertEquals("Matrix", peli.getTitulo());
		assertEquals(136, peli.getDuracionEnMinutos());
		assertEquals("Acción", peli.getGenero());
		assertEquals("Warner", peli.getEstudio());
		assertNotNull(peli.getActores());
		assertTrue(peli.getActores().isEmpty());
	}

	@Test
	void testAgregarActor() {
		Pelicula peli = new Pelicula("Inception", 148, "Ciencia Ficción", "WB");
		Actor actor = new Actor("Leo", 45, "EEUU");
		peli.agregarActor(actor);
		assertEquals(1, peli.getActores().size());
		assertEquals(actor, peli.getActores().get(0));
	}

	@Test
	void testSetEstudio() {
		Pelicula peli = new Pelicula("Tenet", 150, "Acción", "WB");
		peli.setEstudio("Universal");
		assertEquals("Universal", peli.getEstudio());
	}
}

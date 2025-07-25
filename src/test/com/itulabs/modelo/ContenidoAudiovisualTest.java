package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.ContenidoAudiovisual;

class ContenidoAudiovisualTest {

	// Clase abstracta, se prueba a través de subclases. Aquí un ejemplo usando una subclase anónima.
	@Test
	void testConstructorAndGetters() {
		ContenidoAudiovisual contenido = new ContenidoAudiovisual("Titulo", 120, "Drama") {};
		assertEquals("Titulo", contenido.getTitulo());
		assertEquals(120, contenido.getDuracionEnMinutos());
		assertEquals("Drama", contenido.getGenero());
		assertTrue(contenido.getId() >= 0);
	}

	@Test
	void testSetters() {
		ContenidoAudiovisual contenido = new ContenidoAudiovisual("", 0, "") {};
		contenido.setTitulo("Nuevo Titulo");
		contenido.setDuracionEnMinutos(90);
		contenido.setGenero("Comedia");
		assertEquals("Nuevo Titulo", contenido.getTitulo());
		assertEquals(90, contenido.getDuracionEnMinutos());
		assertEquals("Comedia", contenido.getGenero());
	}
}

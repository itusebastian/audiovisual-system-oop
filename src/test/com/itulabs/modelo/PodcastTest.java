package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.Podcast;

class PodcastTest {

	@Test
	void testConstructorAndGetters() {
		Podcast pod = new Podcast("TechTalk", 60, "Tecnología", "Juan", 10, "IA");
		assertEquals("TechTalk", pod.getTitulo());
		assertEquals(60, pod.getDuracionEnMinutos());
		assertEquals("Tecnología", pod.getGenero());
		assertEquals("Juan", pod.getAnfitrion());
		assertEquals(10, pod.getCantidadEpisodios());
		assertEquals("IA", pod.getTematica());
	}

	@Test
	void testSetters() {
		Podcast pod = new Podcast("", 0, "", "", 0, "");
		pod.setAnfitrion("Ana");
		pod.setCantidadEpisodios(20);
		pod.setTematica("Robótica");
		assertEquals("Ana", pod.getAnfitrion());
		assertEquals(20, pod.getCantidadEpisodios());
		assertEquals("Robótica", pod.getTematica());
	}
}

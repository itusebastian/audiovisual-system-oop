package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.VideoMusical;

class VideoMusicalTest {

	@Test
	void testConstructorAndGetters() {
		VideoMusical video = new VideoMusical("Song1", 4, "Pop", "Artista1", "Album1", "Director1");
		assertEquals("Song1", video.getTitulo());
		assertEquals(4, video.getDuracionEnMinutos());
		assertEquals("Pop", video.getGenero());
		assertEquals("Artista1", video.getArtista());
		assertEquals("Album1", video.getAlbum());
		assertEquals("Director1", video.getDirector());
	}

	@Test
	void testSetters() {
		VideoMusical video = new VideoMusical("", 0, "", "", "", "");
		video.setArtista("Artista2");
		video.setAlbum("Album2");
		video.setDirector("Director2");
		assertEquals("Artista2", video.getArtista());
		assertEquals("Album2", video.getAlbum());
		assertEquals("Director2", video.getDirector());
	}
}

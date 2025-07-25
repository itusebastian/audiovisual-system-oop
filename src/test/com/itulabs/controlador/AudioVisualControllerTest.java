package test.com.itulabs.controlador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.controlador.AudioVisualController;
import com.itulabs.modelo.ContenidoAudiovisual;
import com.itulabs.modelo.Pelicula;
import com.itulabs.vista.VistaAudioVisual;

class AudioVisualControllerTest {

	@Test
	void testMostrarContenidos() {
		// Mock de VistaAudioVisual
		VistaAudioVisual vista = new VistaAudioVisual() {
			int count = 0;
			@Override
			public void mostrarContenido(ContenidoAudiovisual contenido) {
				count++;
			}
		};
		AudioVisualController controller = new AudioVisualController(vista);
		ContenidoAudiovisual[] contenidos = {
			new Pelicula("Peli1", 100, "Acción", "Estudio1"),
			new Pelicula("Peli2", 120, "Comedia", "Estudio2")
		};
		controller.mostrarContenidos(contenidos);
		// No hay aserción directa, pero no debe lanzar excepción
	}
}

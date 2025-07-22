package com.itulabs.aplicacion;

import com.itulabs.controlador.AudioVisualController;
import com.itulabs.modelo.*;
import com.itulabs.vista.ConsolaVistaAudioVisual;
import com.itulabs.vista.VistaAudioVisual;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases actualizadas
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", 45, "Australia"));
        pelicula.agregarActor(new Actor("Zoe Saldana", 44, "Estados Unidos"));

        Pelicula pelicula2 = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        pelicula2.agregarActor(new Actor("Leonardo DiCaprio", 50, "Estados Unidos"));
        pelicula2.agregarActor(new Actor("Elliot Page", 38, "Canadá"));

        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy");
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));

        SerieDeTV serie2 = new SerieDeTV("Breaking Bad", 47, "Drama");
        serie2.agregarTemporada(new Temporada(1, 7));
        serie2.agregarTemporada(new Temporada(2, 13));

        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.agregarInvestigador(new Investigador("Carl Sagan", "Astronomía"));
        documental.agregarInvestigador(new Investigador("Ann Druyan", "Guionismo"));

        Documental documental2 = new Documental("Nuestro Planeta", 50, "Naturaleza", "Ecosistemas");
        documental2.agregarInvestigador(new Investigador("David Attenborough", "Biología"));

        VideoMusical videoMusical = new VideoMusical("Thriller", 14, "Pop", "Michael Jackson", "Thriller", "John Landis");
        VideoMusical videoMusical2 = new VideoMusical("Bad Guy", 4, "Pop", "Billie Eilish", "When We All Fall Asleep, Where Do We Go?", "Dave Meyers");

        Podcast podcast = new Podcast("Entrelíneas", 60, "Cultura", "Juan Pérez", 25, "Literatura");
        Podcast podcast2 = new Podcast("Ciencia al Día", 45, "Ciencia", "Ana Torres", 40, "Divulgación científica");

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[] {
            pelicula, pelicula2, serie, serie2, documental, documental2,
            videoMusical, videoMusical2, podcast, podcast2
        };

        VistaAudioVisual vista = new ConsolaVistaAudioVisual();
        AudioVisualController controlador = new AudioVisualController(vista);
        controlador.mostrarContenidos(contenidos);
    }
}
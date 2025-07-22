package com.itulabs.aplicacion;

import com.itulabs.controlador.AudioVisualController;
import com.itulabs.modelo.*;
import com.itulabs.vista.ConsolaVistaAudioVisual;
import com.itulabs.vista.VistaAudioVisual;
import com.itulabs.util.*;

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

        // Guardar películas en CSV
        try {
            ActorCsvAdapter actorAdapter = new ActorCsvAdapter();
            PeliculaCsvAdapter peliculaAdapter = new PeliculaCsvAdapter(actorAdapter);
            PeliculaCsvService peliculaService = new PeliculaCsvService(peliculaAdapter);
            peliculaService.escribirEnArchivo("peliculas.csv", java.util.Arrays.asList(pelicula, pelicula2));
        } catch (Exception e) {
            System.err.println("Error guardando películas: " + e.getMessage());
        }

        // Guardar series en CSV
        try {
            TemporadaCsvAdapter temporadaAdapter = new TemporadaCsvAdapter();
            SerieDeTVCsvAdapter serieAdapter = new SerieDeTVCsvAdapter(temporadaAdapter);
            SerieDeTVCsvService serieService = new SerieDeTVCsvService(serieAdapter);
            serieService.escribirEnArchivo("series.csv", java.util.Arrays.asList(serie, serie2));
        } catch (Exception e) {
            System.err.println("Error guardando series: " + e.getMessage());
        }

        // Guardar documentales en CSV
        try {
            InvestigadorCsvAdapter investigadorAdapter = new InvestigadorCsvAdapter();
            DocumentalCsvAdapter documentalAdapter = new DocumentalCsvAdapter(investigadorAdapter);
            DocumentalCsvService documentalService = new DocumentalCsvService(documentalAdapter);
            documentalService.escribirEnArchivo("documentales.csv", java.util.Arrays.asList(documental, documental2));
        } catch (Exception e) {
            System.err.println("Error guardando documentales: " + e.getMessage());
        }

        // ...puedes agregar lógica similar para actores, temporadas, etc. si lo deseas...
    }
}
package com.itulabs.aplicacion;

import com.itulabs.controlador.AudioVisualController;
import com.itulabs.modelo.*;
import com.itulabs.vista.ConsolaVistaAudioVisual;
import com.itulabs.vista.VistaAudioVisual;
import com.itulabs.util.*;
import com.itulabs.presentacion.*;
import java.util.List;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Presentadores
        DetallePresenter<Actor> actorPresenter = new ActorConsolePresenter();
        DetallePresenter<Pelicula> peliculaPresenter = new PeliculaConsolePresenter(actorPresenter);
        DetallePresenter<Temporada> temporadaPresenter = new TemporadaConsolePresenter();
        DetallePresenter<SerieDeTV> seriePresenter = new SerieDeTVConsolePresenter(temporadaPresenter);
        DetallePresenter<Investigador> investigadorPresenter = new InvestigadorConsolePresenter();
        DetallePresenter<Documental> documentalPresenter = new DocumentalConsolePresenter(investigadorPresenter);

        // Mostrar películas desde CSV
        try {
            ActorCsvAdapter actorAdapter = new ActorCsvAdapter();
            PeliculaCsvAdapter peliculaAdapter = new PeliculaCsvAdapter(actorAdapter);
            PeliculaCsvService peliculaService = new PeliculaCsvService(peliculaAdapter);
            java.util.List<Pelicula> peliculas = peliculaService.leerDesdeArchivo("peliculas.csv");
            System.out.println("--- Películas ---");
            for (Pelicula p : peliculas) {
                peliculaPresenter.mostrarDetalles(p);
            }
        } catch (Exception e) {
            System.err.println("Error leyendo películas: " + e.getMessage());
        }

        // Mostrar series desde CSV
        try {
            TemporadaCsvAdapter temporadaAdapter = new TemporadaCsvAdapter();
            SerieDeTVCsvAdapter serieAdapter = new SerieDeTVCsvAdapter(temporadaAdapter);
            SerieDeTVCsvService serieService = new SerieDeTVCsvService(serieAdapter);
            java.util.List<SerieDeTV> series = serieService.leerDesdeArchivo("series.csv");
            System.out.println("--- Series de TV ---");
            for (SerieDeTV s : series) {
                seriePresenter.mostrarDetalles(s);
            }
        } catch (Exception e) {
            System.err.println("Error leyendo series: " + e.getMessage());
        }

        // Mostrar documentales desde CSV
        try {
            InvestigadorCsvAdapter investigadorAdapter = new InvestigadorCsvAdapter();
            DocumentalCsvAdapter documentalAdapter = new DocumentalCsvAdapter(investigadorAdapter);
            DocumentalCsvService documentalService = new DocumentalCsvService(documentalAdapter);
            java.util.List<Documental> documentales = documentalService.leerDesdeArchivo("documentales.csv");
            System.out.println("--- Documentales ---");
            for (Documental d : documentales) {
                documentalPresenter.mostrarDetalles(d);
            }
        } catch (Exception e) {
            System.err.println("Error leyendo documentales: " + e.getMessage());
        }
    }
}
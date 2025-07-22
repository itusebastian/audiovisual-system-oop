package com.itulabs.vista;

import com.itulabs.modelo.*;
import com.itulabs.presentacion.*;

public class ConsolaVistaAudioVisual implements VistaAudioVisual {
    private final DetallePresenter<Actor> actorPresenter = new ActorConsolePresenter();
    private final DetallePresenter<Pelicula> peliculaPresenter = new PeliculaConsolePresenter(actorPresenter);
    private final DetallePresenter<Temporada> temporadaPresenter = new TemporadaConsolePresenter();
    private final DetallePresenter<SerieDeTV> seriePresenter = new SerieDeTVConsolePresenter(temporadaPresenter);
    private final DetallePresenter<Investigador> investigadorPresenter = new InvestigadorConsolePresenter();
    private final DetallePresenter<Documental> documentalPresenter = new DocumentalConsolePresenter(investigadorPresenter);
    private final DetallePresenter<VideoMusical> videoMusicalPresenter = new VideoMusicalConsolePresenter();
    private final DetallePresenter<Podcast> podcastPresenter = new PodcastConsolePresenter();

    @Override
    public void mostrarContenido(ContenidoAudiovisual contenido) {
        if (contenido instanceof Pelicula) {
            peliculaPresenter.mostrarDetalles((Pelicula) contenido);
        } else if (contenido instanceof SerieDeTV) {
            seriePresenter.mostrarDetalles((SerieDeTV) contenido);
        } else if (contenido instanceof Documental) {
            documentalPresenter.mostrarDetalles((Documental) contenido);
        } else if (contenido instanceof VideoMusical) {
            videoMusicalPresenter.mostrarDetalles((VideoMusical) contenido);
        } else if (contenido instanceof Podcast) {
            podcastPresenter.mostrarDetalles((Podcast) contenido);
        }
    }
}

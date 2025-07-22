package com.itulabs.presentacion;

import com.itulabs.modelo.Podcast;

public class PodcastConsolePresenter implements DetallePresenter<Podcast> {
    @Override
    public void mostrarDetalles(Podcast podcast) {
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + podcast.getId());
        System.out.println("Título: " + podcast.getTitulo());
        System.out.println("Duración en minutos: " + podcast.getDuracionEnMinutos());
        System.out.println("Género: " + podcast.getGenero());
        System.out.println("Anfitrión: " + podcast.getAnfitrion());
        System.out.println("Cantidad de episodios: " + podcast.getCantidadEpisodios());
        System.out.println("Temática: " + podcast.getTematica());
        System.out.println();
    }
}

package com.itulabs.presentacion;

import com.itulabs.modelo.VideoMusical;

public class VideoMusicalConsolePresenter implements DetallePresenter<VideoMusical> {
    @Override
    public void mostrarDetalles(VideoMusical video) {
        System.out.println("Detalles del video musical:");
        System.out.println("ID: " + video.getId());
        System.out.println("Título: " + video.getTitulo());
        System.out.println("Duración en minutos: " + video.getDuracionEnMinutos());
        System.out.println("Género: " + video.getGenero());
        System.out.println("Artista: " + video.getArtista());
        System.out.println("Álbum: " + video.getAlbum());
        System.out.println("Director: " + video.getDirector());
        System.out.println();
    }
}

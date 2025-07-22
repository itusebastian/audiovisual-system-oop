package com.itulabs.modelo;

public class VideoMusical extends ContenidoAudiovisual {
    private String artista;
    private String album;
    private String director;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista, String album, String director) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.album = album;
        this.director = director;
    }

    public String getArtista() {
    // Método mostrarDetalles eliminado. Usar un DetallePresenter para mostrar detalles.
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Método mostrarDetalles eliminado. Usar un DetallePresenter para mostrar detalles.

}

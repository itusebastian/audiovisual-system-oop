package com.itulabs.presentacion;

import com.itulabs.modelo.Pelicula;
import com.itulabs.modelo.Actor;

public class PeliculaConsolePresenter implements DetallePresenter<Pelicula> {
    private final DetallePresenter<Actor> actorPresenter;

    public PeliculaConsolePresenter(DetallePresenter<Actor> actorPresenter) {
        this.actorPresenter = actorPresenter;
    }

    @Override
    public void mostrarDetalles(Pelicula pelicula) {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + pelicula.getId());
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Duración en minutos: " + pelicula.getDuracionEnMinutos());
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Estudio: " + pelicula.getEstudio());
        if (pelicula.getActores().isEmpty()) {
            System.out.println("No hay actores registrados para esta película.");
        } else {
            System.out.println("Actores:");
            for (Actor actor : pelicula.getActores()) {
                actorPresenter.mostrarDetalles(actor);
            }
        }
        System.out.println();
    }
}

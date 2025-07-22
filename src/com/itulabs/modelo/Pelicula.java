/**
 * Class Pelicula
 */
package com.itulabs.modelo;

import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void agregarActor(Actor actor) {
        this.actores.add(actor);
    }

    // Método mostrarActores eliminado. Usar un DetallePresenter para mostrar detalles de actores.

    // Método mostrarDetalles eliminado. Usar un DetallePresenter para mostrar detalles.
}
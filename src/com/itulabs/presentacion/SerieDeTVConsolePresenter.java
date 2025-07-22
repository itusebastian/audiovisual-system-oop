package com.itulabs.presentacion;

import com.itulabs.modelo.SerieDeTV;
import com.itulabs.modelo.Temporada;

public class SerieDeTVConsolePresenter implements DetallePresenter<SerieDeTV> {
    private final DetallePresenter<Temporada> temporadaPresenter;

    public SerieDeTVConsolePresenter(DetallePresenter<Temporada> temporadaPresenter) {
        this.temporadaPresenter = temporadaPresenter;
    }

    @Override
    public void mostrarDetalles(SerieDeTV serie) {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + serie.getId());
        System.out.println("Título: " + serie.getTitulo());
        System.out.println("Duración en minutos: " + serie.getDuracionEnMinutos());
        System.out.println("Género: " + serie.getGenero());
        System.out.println("Temporadas: " + serie.getTemporadas().size());
        for (Temporada t : serie.getTemporadas()) {
            temporadaPresenter.mostrarDetalles(t);
        }
        System.out.println();
    }
}

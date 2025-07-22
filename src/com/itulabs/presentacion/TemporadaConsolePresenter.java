package com.itulabs.presentacion;

import com.itulabs.modelo.Temporada;

public class TemporadaConsolePresenter implements DetallePresenter<Temporada> {
    @Override
    public void mostrarDetalles(Temporada temporada) {
        System.out.println("Temporada " + temporada.getNumero() + ": " + temporada.getCantidadEpisodios() + " episodios");
    }
}

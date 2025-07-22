package com.itulabs.presentacion;

import com.itulabs.modelo.Documental;
import com.itulabs.modelo.Investigador;

public class DocumentalConsolePresenter implements DetallePresenter<Documental> {
    private final DetallePresenter<Investigador> investigadorPresenter;

    public DocumentalConsolePresenter(DetallePresenter<Investigador> investigadorPresenter) {
        this.investigadorPresenter = investigadorPresenter;
    }

    @Override
    public void mostrarDetalles(Documental documental) {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + documental.getId());
        System.out.println("Título: " + documental.getTitulo());
        System.out.println("Duración en minutos: " + documental.getDuracionEnMinutos());
        System.out.println("Género: " + documental.getGenero());
        System.out.println("Tema: " + documental.getTema());
        System.out.println("Investigadores: " + documental.getInvestigadores().size());
        for (Investigador inv : documental.getInvestigadores()) {
            investigadorPresenter.mostrarDetalles(inv);
        }
        System.out.println();
    }
}

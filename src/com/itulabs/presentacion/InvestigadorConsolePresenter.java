package com.itulabs.presentacion;

import com.itulabs.modelo.Investigador;

public class InvestigadorConsolePresenter implements DetallePresenter<Investigador> {
    @Override
    public void mostrarDetalles(Investigador investigador) {
        System.out.println("Investigador: " + investigador.getNombre() + ", Especialidad: " + investigador.getEspecialidad());
    }
}

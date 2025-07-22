package com.itulabs.presentacion;

import com.itulabs.modelo.Actor;

public class ActorConsolePresenter implements DetallePresenter<Actor> {
    @Override
    public void mostrarDetalles(Actor actor) {
        System.out.println("Actor: " + actor.getNombre() + ", Edad: " + actor.getEdad() + ", Nacionalidad: " + actor.getNacionalidad());
    }
}

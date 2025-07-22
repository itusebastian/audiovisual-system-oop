package com.itulabs.controlador;

import com.itulabs.modelo.ContenidoAudiovisual;
import com.itulabs.vista.VistaAudioVisual;

public class AudioVisualController {
    private final VistaAudioVisual vista;

    public AudioVisualController(VistaAudioVisual vista) {
        this.vista = vista;
    }

    public void mostrarContenidos(ContenidoAudiovisual[] contenidos) {
        for (ContenidoAudiovisual contenido : contenidos) {
            vista.mostrarContenido(contenido);
        }
    }
}

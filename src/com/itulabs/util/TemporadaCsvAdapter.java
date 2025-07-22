package com.itulabs.util;

import com.itulabs.modelo.Temporada;

public class TemporadaCsvAdapter implements CsvAdapter<Temporada> {
    @Override
    public Temporada fromCsv(String line) {
        // Formato: numero,cantidadEpisodios
        String[] parts = line.split(",");
        if (parts.length != 2) throw new IllegalArgumentException("Formato CSV inválido para Temporada");
        return new Temporada(Integer.parseInt(parts[0].trim()), Integer.parseInt(parts[1].trim()));
    }

    @Override
    public String toCsv(Temporada obj) {
        return obj.getNumero() + "," + obj.getCantidadEpisodios();
    }
}

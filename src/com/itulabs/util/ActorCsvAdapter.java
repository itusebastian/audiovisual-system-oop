package com.itulabs.util;

import com.itulabs.modelo.Actor;

public class ActorCsvAdapter implements CsvAdapter<Actor> {
    @Override
    public Actor fromCsv(String line) {
        // Formato: nombre,edad,nacionalidad
        String[] parts = line.split(",");
        if (parts.length != 3) throw new IllegalArgumentException("Formato CSV inválido para Actor");
        return new Actor(parts[0].trim(), Integer.parseInt(parts[1].trim()), parts[2].trim());
    }

    @Override
    public String toCsv(Actor obj) {
        return obj.getNombre() + "," + obj.getEdad() + "," + obj.getNacionalidad();
    }
}

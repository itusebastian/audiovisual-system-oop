package com.itulabs.util;

import com.itulabs.modelo.*;
import java.util.*;

public class PeliculaCsvAdapter implements CsvAdapter<Pelicula> {
    private final CsvAdapter<Actor> actorAdapter;

    public PeliculaCsvAdapter(CsvAdapter<Actor> actorAdapter) {
        this.actorAdapter = actorAdapter;
    }

    @Override
    public Pelicula fromCsv(String line) {
        // Formato: titulo;duracion;genero;estudio;actor1,edad1,nacionalidad1|actor2,edad2,nacionalidad2
        String[] parts = line.split(";");
        if (parts.length < 5) throw new IllegalArgumentException("Formato CSV inválido para Pelicula");
        Pelicula pelicula = new Pelicula(parts[0].trim(), Integer.parseInt(parts[1].trim()), parts[2].trim(), parts[3].trim());
        if (!parts[4].trim().isEmpty()) {
            String[] actores = parts[4].split("\\|");
            for (String actorStr : actores) {
                pelicula.agregarActor(actorAdapter.fromCsv(actorStr));
            }
        }
        return pelicula;
    }

    @Override
    public String toCsv(Pelicula obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getTitulo()).append(";")
          .append(obj.getDuracionEnMinutos()).append(";")
          .append(obj.getGenero()).append(";")
          .append(obj.getEstudio()).append(";");
        List<Actor> actores = obj.getActores();
        for (int i = 0; i < actores.size(); i++) {
            sb.append(actorAdapter.toCsv(actores.get(i)));
            if (i < actores.size() - 1) sb.append("|");
        }
        return sb.toString();
    }
}

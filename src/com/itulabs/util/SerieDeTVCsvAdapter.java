package com.itulabs.util;

import com.itulabs.modelo.*;
import java.util.*;

public class SerieDeTVCsvAdapter implements CsvAdapter<SerieDeTV> {
    private final CsvAdapter<Temporada> temporadaAdapter;

    public SerieDeTVCsvAdapter(CsvAdapter<Temporada> temporadaAdapter) {
        this.temporadaAdapter = temporadaAdapter;
    }

    @Override
    public SerieDeTV fromCsv(String line) {
        // Formato: titulo;duracion;genero;temporada1,episodios1|temporada2,episodios2
        String[] parts = line.split(";");
        if (parts.length < 4) throw new IllegalArgumentException("Formato CSV inválido para SerieDeTV");
        SerieDeTV serie = new SerieDeTV(parts[0].trim(), Integer.parseInt(parts[1].trim()), parts[2].trim());
        if (!parts[3].trim().isEmpty()) {
            String[] temporadas = parts[3].split("\\|");
            for (String tempStr : temporadas) {
                serie.agregarTemporada(temporadaAdapter.fromCsv(tempStr));
            }
        }
        return serie;
    }

    @Override
    public String toCsv(SerieDeTV obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getTitulo()).append(";")
          .append(obj.getDuracionEnMinutos()).append(";")
          .append(obj.getGenero()).append(";");
        List<Temporada> temporadas = obj.getTemporadas();
        for (int i = 0; i < temporadas.size(); i++) {
            sb.append(temporadaAdapter.toCsv(temporadas.get(i)));
            if (i < temporadas.size() - 1) sb.append("|");
        }
        return sb.toString();
    }
}

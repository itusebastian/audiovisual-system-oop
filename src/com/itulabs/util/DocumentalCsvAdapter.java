package com.itulabs.util;

import com.itulabs.modelo.*;
import java.util.*;

public class DocumentalCsvAdapter implements CsvAdapter<Documental> {
    private final CsvAdapter<Investigador> investigadorAdapter;

    public DocumentalCsvAdapter(CsvAdapter<Investigador> investigadorAdapter) {
        this.investigadorAdapter = investigadorAdapter;
    }

    @Override
    public Documental fromCsv(String line) {
        // Formato: titulo;duracion;genero;tema;investigador1,especialidad1|investigador2,especialidad2
        String[] parts = line.split(";");
        if (parts.length < 5) throw new IllegalArgumentException("Formato CSV inválido para Documental");
        Documental doc = new Documental(parts[0].trim(), Integer.parseInt(parts[1].trim()), parts[2].trim(), parts[3].trim());
        if (!parts[4].trim().isEmpty()) {
            String[] investigadores = parts[4].split("\\|");
            for (String invStr : investigadores) {
                doc.agregarInvestigador(investigadorAdapter.fromCsv(invStr));
            }
        }
        return doc;
    }

    @Override
    public String toCsv(Documental obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getTitulo()).append(";")
          .append(obj.getDuracionEnMinutos()).append(";")
          .append(obj.getGenero()).append(";")
          .append(obj.getTema()).append(";");
        List<Investigador> investigadores = obj.getInvestigadores();
        for (int i = 0; i < investigadores.size(); i++) {
            sb.append(investigadorAdapter.toCsv(investigadores.get(i)));
            if (i < investigadores.size() - 1) sb.append("|");
        }
        return sb.toString();
    }
}

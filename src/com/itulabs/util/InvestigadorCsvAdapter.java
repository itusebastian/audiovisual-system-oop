package com.itulabs.util;

import com.itulabs.modelo.Investigador;

public class InvestigadorCsvAdapter implements CsvAdapter<Investigador> {
    @Override
    public Investigador fromCsv(String line) {
        // Formato: nombre,especialidad
        String[] parts = line.split(",");
        if (parts.length != 2) throw new IllegalArgumentException("Formato CSV inválido para Investigador");
        return new Investigador(parts[0].trim(), parts[1].trim());
    }

    @Override
    public String toCsv(Investigador obj) {
        return obj.getNombre() + "," + obj.getEspecialidad();
    }
}

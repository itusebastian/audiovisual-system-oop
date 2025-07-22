package com.itulabs.util;

import com.itulabs.modelo.Temporada;
import java.io.*;
import java.util.*;

public class TemporadaCsvService {
    private final CsvAdapter<Temporada> adapter;

    public TemporadaCsvService(CsvAdapter<Temporada> adapter) {
        this.adapter = adapter;
    }

    public List<Temporada> leerDesdeArchivo(String ruta) throws IOException {
        List<Temporada> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lista.add(adapter.fromCsv(linea));
                }
            }
        }
        return lista;
    }

    public void escribirEnArchivo(String ruta, List<Temporada> lista) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Temporada obj : lista) {
                bw.write(adapter.toCsv(obj));
                bw.newLine();
            }
        }
    }
}

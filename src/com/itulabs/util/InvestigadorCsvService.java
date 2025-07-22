package com.itulabs.util;

import com.itulabs.modelo.Investigador;
import java.io.*;
import java.util.*;

public class InvestigadorCsvService {
    private final CsvAdapter<Investigador> adapter;

    public InvestigadorCsvService(CsvAdapter<Investigador> adapter) {
        this.adapter = adapter;
    }

    public List<Investigador> leerDesdeArchivo(String ruta) throws IOException {
        List<Investigador> lista = new ArrayList<>();
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

    public void escribirEnArchivo(String ruta, List<Investigador> lista) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Investigador inv : lista) {
                bw.write(adapter.toCsv(inv));
                bw.newLine();
            }
        }
    }
}

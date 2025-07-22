package com.itulabs.util;

import com.itulabs.modelo.Documental;
import java.io.*;
import java.util.*;

public class DocumentalCsvService {
    private final CsvAdapter<Documental> adapter;

    public DocumentalCsvService(CsvAdapter<Documental> adapter) {
        this.adapter = adapter;
    }

    public List<Documental> leerDesdeArchivo(String ruta) throws IOException {
        List<Documental> lista = new ArrayList<>();
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

    public void escribirEnArchivo(String ruta, List<Documental> lista) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Documental obj : lista) {
                bw.write(adapter.toCsv(obj));
                bw.newLine();
            }
        }
    }
}

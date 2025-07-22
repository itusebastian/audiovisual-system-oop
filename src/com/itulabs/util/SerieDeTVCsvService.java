package com.itulabs.util;

import com.itulabs.modelo.SerieDeTV;
import java.io.*;
import java.util.*;

public class SerieDeTVCsvService {
    private final CsvAdapter<SerieDeTV> adapter;

    public SerieDeTVCsvService(CsvAdapter<SerieDeTV> adapter) {
        this.adapter = adapter;
    }

    public List<SerieDeTV> leerDesdeArchivo(String ruta) throws IOException {
        List<SerieDeTV> lista = new ArrayList<>();
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

    public void escribirEnArchivo(String ruta, List<SerieDeTV> lista) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (SerieDeTV obj : lista) {
                bw.write(adapter.toCsv(obj));
                bw.newLine();
            }
        }
    }
}

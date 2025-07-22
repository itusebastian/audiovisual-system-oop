package com.itulabs.util;

import com.itulabs.modelo.Pelicula;
import java.io.*;
import java.util.*;

public class PeliculaCsvService {
    private final CsvAdapter<Pelicula> adapter;

    public PeliculaCsvService(CsvAdapter<Pelicula> adapter) {
        this.adapter = adapter;
    }

    public List<Pelicula> leerDesdeArchivo(String ruta) throws IOException {
        List<Pelicula> lista = new ArrayList<>();
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

    public void escribirEnArchivo(String ruta, List<Pelicula> lista) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Pelicula obj : lista) {
                bw.write(adapter.toCsv(obj));
                bw.newLine();
            }
        }
    }
}

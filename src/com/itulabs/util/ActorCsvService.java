package com.itulabs.util;

import com.itulabs.modelo.Actor;
import java.io.*;
import java.util.*;

public class ActorCsvService {
    private final CsvAdapter<Actor> adapter;

    public ActorCsvService(CsvAdapter<Actor> adapter) {
        this.adapter = adapter;
    }

    public List<Actor> leerDesdeArchivo(String ruta) throws IOException {
        List<Actor> lista = new ArrayList<>();
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

    public void escribirEnArchivo(String ruta, List<Actor> lista) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Actor obj : lista) {
                bw.write(adapter.toCsv(obj));
                bw.newLine();
            }
        }
    }
}

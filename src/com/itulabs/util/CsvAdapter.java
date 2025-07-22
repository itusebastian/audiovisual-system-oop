package com.itulabs.util;

public interface CsvAdapter<T> {
    T fromCsv(String line);
    String toCsv(T obj);
}

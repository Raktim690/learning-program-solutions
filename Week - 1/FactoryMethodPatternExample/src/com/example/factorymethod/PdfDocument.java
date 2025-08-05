package com.example.factorymethod;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }

    @Override
    public void save() {
        System.out.println("Saving a PDF document.");
    }

    @Override
    public void close() {
        System.out.println("Closing a PDF document.");
    }
}
package com.example.factorymethod;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }

    @Override
    public void save() {
        System.out.println("Saving an Excel document.");
    }

    @Override
    public void close() {
        System.out.println("Closing an Excel document.");
    }
}

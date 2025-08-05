package com.example.factorymethod;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }

    @Override
    public void save() {
        System.out.println("Saving a Word document.");
    }

    @Override
    public void close() {
        System.out.println("Closing a Word document.");
    }
}
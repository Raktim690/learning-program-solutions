package com.example.factorymethod;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    protected Document createDocumentInstance() {
        return new PdfDocument();
    }
}
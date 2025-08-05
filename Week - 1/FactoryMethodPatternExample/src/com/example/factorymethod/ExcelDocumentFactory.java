package com.example.factorymethod;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    protected Document createDocumentInstance() {
        return new ExcelDocument();
    }
}
package com.example.factorymethod;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    protected Document createDocumentInstance() {
        return new WordDocument();
    }
}
package com.example.factorymethod;

public abstract class DocumentFactory {
    public Document createDocument() {
        Document document = createDocumentInstance();
        return document;
    }

    protected abstract Document createDocumentInstance();
}
package com.inventory.system;

import com.inventory.model.Product;
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> products;

    public InventoryManager() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Error: Product with ID " + product.getProductId() + " already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product " + product.getProductName() + " added successfully.");
        }
    }

    public void updateProduct(String productId, int newQuantity, double newPrice) {
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product " + productId + " updated successfully.");
        } else {
            System.out.println("Error: Product with ID " + productId + " not found.");
        }
    }
 
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product " + productId + " deleted successfully.");
        } else {
            System.out.println("Error: Product with ID " + productId + " not found.");
        }
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public void printInventory() {
        System.out.println("\nCurrent Inventory:");
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
        System.out.println("--------------------");
    }
}


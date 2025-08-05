package com.inventory.main;

import com.inventory.model.Product;
import com.inventory.system.InventoryManager;

public class Main {

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        System.out.println("--- Adding Products ---");
        Product laptop = new Product("P001", "Laptop", 10, 1200.50);
        Product mouse = new Product("P002", "Wireless Mouse", 50, 25.00);
        manager.addProduct(laptop);
        manager.addProduct(mouse);
        manager.printInventory();

        System.out.println("--- Adding Duplicate Product ---");
        manager.addProduct(new Product("P001", "Desktop", 5, 800.00));
        manager.printInventory();

        System.out.println("--- Updating Product P001 ---");
        manager.updateProduct("P001", 8, 1150.00);
        manager.printInventory();

        System.out.println("--- Deleting Product P002 ---");
        manager.deleteProduct("P002");
        manager.printInventory();

        System.out.println("--- Deleting Non-existent Product ---");
        manager.deleteProduct("P003");
        manager.printInventory();
    }
}
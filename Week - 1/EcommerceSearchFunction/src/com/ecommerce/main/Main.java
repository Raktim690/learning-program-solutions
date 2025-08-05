package com.ecommerce.main;

import com.ecommerce.model.Product;
import com.ecommerce.search.SearchAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P003", "Laptop", "Electronics"));
        products.add(new Product("P001", "Smartphone", "Electronics"));
        products.add(new Product("P005", "T-Shirt", "Apparel"));
        products.add(new Product("P002", "Coffee Maker", "Home Appliances"));
        products.add(new Product("P004", "Keyboard", "Electronics"));

        System.out.println("Unsorted Product List:");
        products.forEach(System.out::println);
        System.out.println("----------------------------------------\n");

        System.out.println("--- Demonstrating Linear Search ---");
        SearchAlgorithms.linearSearch(products, "P005");
        System.out.println();
        SearchAlgorithms.linearSearch(products, "P006"); // Non-existent product
        System.out.println("----------------------------------------\n");

        System.out.println("--- Demonstrating Binary Search ---");

        Collections.sort(products); 

        System.out.println("Sorted Product List:");
        products.forEach(System.out::println);
        System.out.println();

        SearchAlgorithms.binarySearch(products, "P005");
        System.out.println();
        SearchAlgorithms.binarySearch(products, "P006"); // Non-existent product
        System.out.println("----------------------------------------\n");

        System.out.println("--- Final Analysis ---");
        System.out.println("Linear Search Time Complexity: O(n)");
        System.out.println("Binary Search Time Complexity: O(log n)");
        System.out.println("Why Binary Search is better for this platform:");
        System.out.println("- E-commerce platforms typically have millions of products.");
        System.out.println("- A linear search would be too slow, as its performance degrades linearly with the number of products.");
        System.out.println("- Binary search is significantly faster because it halves the search space with each comparison.");
        System.out.println("- Even with a large product list, binary search can find a product in a handful of steps (e.g., a list of 1 million items takes only ~20 steps).");
        System.out.println("- The one-time cost of sorting the data is a worthwhile trade-off for the massive performance gains on subsequent searches.");
    }
}
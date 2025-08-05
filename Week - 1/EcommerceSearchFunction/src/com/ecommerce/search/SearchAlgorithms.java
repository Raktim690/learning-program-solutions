package com.ecommerce.search;

import com.ecommerce.model.Product;

import java.util.List;
public class SearchAlgorithms {

    public static Product linearSearch(List<Product> products, String targetProductId) {
        System.out.println("Starting Linear Search for Product ID: " + targetProductId);
        for (Product product : products) {
            if (product.getProductId().equals(targetProductId)) {
                System.out.println("Product found!");
                return product; 
            }
        }
        System.out.println("Product not found.");
        return null; 
    }

    public static Product binarySearch(List<Product> products, String targetProductId) {
        System.out.println("Starting Binary Search for Product ID: " + targetProductId);


        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midProductId = products.get(mid).getProductId();

            int comparison = midProductId.compareTo(targetProductId);

            if (comparison == 0) {
                System.out.println("Product found!");
                return products.get(mid); 
            }
            if (comparison < 0) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        System.out.println("Product not found.");
        return null; 
    }
}

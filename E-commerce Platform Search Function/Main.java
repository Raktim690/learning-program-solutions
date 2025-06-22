import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Product> searchProducts(List<Product> productList, String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(product);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Smartphone", 699.99));
        productList.add(new Product("Smartwatch", 199.99));
        productList.add(new Product("Laptop", 899.99));
        productList.add(new Product("Wireless Mouse", 29.99));
        productList.add(new Product("Keyboard", 49.99));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product keyword to search: ");
        String keyword = scanner.nextLine();

        List<Product> results = searchProducts(productList, keyword);

        if (results.isEmpty()) {
            System.out.println("No products found matching: " + keyword);
        } else {
            System.out.println("Search Results:");
            for (Product product : results) {
                product.display();
            }
        }

        scanner.close();
    }
}

package Algorithum_data_structure.EcommerceSearchExample;

import java.util.*;

public class EcommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(104, "Wireless Mouse", "Electronics"),
                new Product(101, "Running Shoes", "Footwear"),
                new Product(105, "Coffee Maker", "Home Appliances"),
                new Product(102, "Laptop Stand", "Electronics"),
                new Product(103, "Backpack", "Accessories")

        };
        Product linearResult = ProductSearch.linearSearch(products, 102);
        System.out.println("Linear search: " + linearResult);
        Product[] sortedProducts = products.clone();
        Arrays.sort(sortedProducts, Comparator.comparingInt(Product::getProductId));
        Product binaryResult = ProductSearch.binarySearch(sortedProducts, 102);
        System.out.println("Binary search: " + binaryResult);
        Product missing = ProductSearch.binarySearch(sortedProducts, 999);
        System.out.println("Missing product: "+ (missing == null ? "Not found" : missing));

    }
}
    


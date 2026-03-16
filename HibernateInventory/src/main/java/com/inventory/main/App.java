package com.inventory.main;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class App {

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

        // INSERT
        Product p1 = new Product("Laptop", "Gaming Laptop", 75000, 10);
        Product p2 = new Product("Mouse", "Wireless Mouse", 1200, 50);
        Product p3 = new Product("Keyboard", "Mechanical Keyboard", 3500, 30);
        dao.saveProduct(p1);
        dao.saveProduct(p2);
        dao.saveProduct(p3);
        System.out.println("Products saved.");

        // READ
        Product fetched = dao.getProduct(p1.getId());
        if (fetched != null) {
            System.out.println("Retrieved: " + fetched.getName() + " | Price: " + fetched.getPrice());
        }

        // UPDATE
        dao.updateProduct(p1.getId(), 72000, 8);
        System.out.println("Product updated.");

        // DELETE
        dao.deleteProduct(p2.getId());
        System.out.println("Product deleted.");
    }
}

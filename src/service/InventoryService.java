package service;

import model.Product;
import java.sql.*;
import java.util.*;

public class InventoryService {

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAdd New Product");
        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.close();
        Product product = new Product(name, category, quantity, price);
        // Connecting to the database
        try (Connection conn = DatabaseConnection.getConnection()) {
            // Query to insert the product into the products table
            String query = "INSERT INTO products (name, category, quantity, price) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, product.getName());
            ps.setString(2, product.getCategory());
            ps.setInt(3, product.getQuantity());
            ps.setDouble(4, product.getPrice());
            // Executing the query
            ps.executeUpdate();
            System.out.println("Product added to the inventory successfully!");
        } catch (SQLException e) {
            // Handling SQL Exception
            System.out.println("Error in adding product: " + e.getMessage());
        }
    }
}

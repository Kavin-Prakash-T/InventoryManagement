package service;

import model.Product;
import java.sql.*;
import java.util.*;

public class InventoryService {

    public void addProduct(Product product) {

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

    public void viewProducts() {
        // Connecting to the database
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM products";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Category: %s | Quantity: %d | Price: %.2f%n",
                        rs.getInt("id"), rs.getString("name"), rs.getString("category"),
                        rs.getInt("quantity"), rs.getDouble("price"));
            }
        }
        catch (SQLException e) {
            // Handling SQL Exception
            System.out.println("Error in viewing the products: " + e.getMessage());
        }
    }
}

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

    // Method to update the product details in the databasee
    public void updateProduct(Scanner sc) {

        System.out.println("Updating product");
        // Getting product id
        System.out.print("\nEnter Product ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Getting the choice to update
        System.out.println("\nWhat would you like to update?");
        System.out.println("1. Name");
        System.out.println("2. Category");
        System.out.println("3. Quantity");
        System.out.println("4. Price");
        System.out.println("5. All fields");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        String query = "";
        // Connection the database
        try (Connection conn = DatabaseConnection.getConnection()) {
            PreparedStatement ps = null;

            // Switch statement to update details based on the user choice
            switch (choice) {
                // Case to update name
                case 1:
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    query = "UPDATE products SET name = ? WHERE id = ?";
                    ps = conn.prepareStatement(query);
                    ps.setString(1, name);
                    ps.setInt(2, id);
                    break;
                // Case to update category
                case 2:
                    System.out.print("Enter new category: ");
                    String category = sc.nextLine();
                    query = "UPDATE products SET category = ? WHERE id = ?";
                    ps = conn.prepareStatement(query);
                    ps.setString(1, category);
                    ps.setInt(2, id);
                    break;
                // Case to update quantity
                case 3:
                    System.out.print("Enter new quantity: ");
                    int quantity = sc.nextInt();
                    query = "UPDATE products SET quantity = ? WHERE id = ?";
                    ps = conn.prepareStatement(query);
                    ps.setInt(1, quantity);
                    ps.setInt(2, id);
                    break;
                // Case to update price
                case 4:
                    System.out.print("Enter new price: ");
                    double price = sc.nextDouble();
                    query = "UPDATE products SET price = ? WHERE id = ?";
                    ps = conn.prepareStatement(query);
                    ps.setDouble(1, price);
                    ps.setInt(2, id);
                    break;
                // case to update all fields
                case 5:
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new category: ");
                    String newCategory = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = sc.nextDouble();

                    query = "UPDATE products SET name = ?, category = ?, quantity = ?, price = ? WHERE id = ?";
                    ps = conn.prepareStatement(query);
                    ps.setString(1, newName);
                    ps.setString(2, newCategory);
                    ps.setInt(3, newQuantity);
                    ps.setDouble(4, newPrice);
                    ps.setInt(5, id);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Product is updated successfully!");
            else
                System.out.println("Nothing found with the given ID.");

        } catch (SQLException e) {
            System.out.println("Error! updating product: " + e.getMessage());
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
        } catch (SQLException e) {
            // Handling SQL Exception
            System.out.println("Error in viewing the products: " + e.getMessage());
        }
    }
}

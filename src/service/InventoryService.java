package service;

import model.Product;

import java.sql.*;
import java.util.*;

public class InventoryService {

    public void addProduct(Product product) {
        Connection conn = DBConnection.getConnection();
        String query = "INSERT INTO products (name, category, quantity, price) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, product.getName());
        ps.setString(2, product.getCategory());
        ps.setInt(3, product.getQuantity());
        ps.setDouble(4, product.getPrice());
        ps.executeUpdate();
        System.out.println("Product added successfully!");
    }
}

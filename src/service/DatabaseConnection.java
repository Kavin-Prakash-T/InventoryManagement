package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    // MySql localhost URL
    private static final String URL = "jdbc:mysql://localhost:3306/inventory_db";
    // MySql user
    private static final String USER = "root";
    // MySql password
    private static final String PASSWORD = "Kavin@123";

    public static Connection getConnection() {
        Connection connection = null;
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }
}

package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // MySql localhost URL
    private static final String URL = "jdbc:mysql://localhost:3306/inventory_db";
    // MySql user
    private static final String USER = "root";
    // MySql password
    private static final String PASSWORD = "Kavin@123";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connection Successful!");
        } catch (SQLException e) {
            System.out.println("Database Not Connected ! Sorry , Try again later !,Process terminated due to : " + e.getMessage());
        }
        return connection;
    }
}

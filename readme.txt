📦 Retail Inventory Management System
📌 Project Overview

The Retail Inventory Management System is a console-based Java application that helps retail shops efficiently manage their product stock. It provides role-based login for Admin and Staff users, supports CRUD operations on products, and can generate reports such as stock levels and sales summaries.

The system uses MySQL database with JDBC connectivity for persistent storage.

🎯 Problem Statement

Retail shops often face challenges in:

Tracking product availability

Updating stock in real-time

Preventing under-stocking or over-stocking

Providing quick insights into inventory for staff

This project solves these challenges by offering a simple, database-driven inventory management solution.

👥 Target Users

Admin (Shop Manager):

Full access: add, update, delete, and view products

Generate reports

Staff (Employees):

Restricted access: can only view stock levels and reports

⚙️ Features

✅ Admin & Staff login system (role-based access)
✅ Product management (Add, Update, Delete, Search, Display all)
✅ Stock and Sales report generation (saved as .txt file)
✅ Secure database connectivity using JDBC
✅ Console-based interface for easy interaction
✅ Demonstrates OOP principles (Inheritance, Polymorphism, Abstraction, Encapsulation)

🏗️ System Design
UML Class Diagram
classDiagram
    class Product {
        - int productId
        - String name
        - String category
        - int quantity
        - double price
        - String supplier
    }

    class ProductDAO {
        + addProduct()
        + updateProduct()
        + deleteProduct()
        + viewProducts()
        + searchProduct()
    }

    class User {
        <<abstract>>
        - String username
        - String password
        + login()
        + showMenu()
    }

    class Admin {
        + showMenu()
        + full access
    }

    class Staff {
        + showMenu()
        + view only
    }

    class Report {
        <<abstract>>
        + generate()
    }

    class StockReport {
        + generate()
    }

    class SalesReport {
        + generate()
    }

    User <|-- Admin
    User <|-- Staff
    Report <|-- StockReport
    Report <|-- SalesReport
    ProductDAO --> Product

🧑‍💻 OOP Concepts Used

Encapsulation: Product attributes secured with getters/setters.

Inheritance: Admin & Staff inherit from User; StockReport & SalesReport inherit from Report.

Polymorphism:

showMenu() → behaves differently for Admin and Staff.

generate() → implemented differently for Stock vs Sales report.

Abstraction: User and Report are abstract classes, ensuring modular design.

Modularity: DAO (Data Access Object) layer separates database logic from business logic.

🛠️ Tech Stack

Language: Java

Database: MySQL

Connectivity: JDBC (Java Database Connectivity)

Version Control: Git & GitHub

Reports: Exported as .txt files

📂 Project Structure
Retail-Inventory-System/
│── src/
│   ├── models/
│   │   └── Product.java
│   ├── dao/
│   │   └── ProductDAO.java
│   ├── users/
│   │   ├── User.java
│   │   ├── Admin.java
│   │   └── Staff.java
│   ├── reports/
│   │   ├── Report.java
│   │   ├── StockReport.java
│   │   └── SalesReport.java
│   └── Main.java
│
│── database/
│   └── inventory.sql   (DB Schema & Tables)
│
│── reports/
│   ├── StockReport.txt
│   └── SalesReport.txt
│
│── README.md
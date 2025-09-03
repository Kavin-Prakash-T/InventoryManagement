package model;

// Derived class from the base class User - Inheritance

public class Staff extends User {

    //Calling the constructor of the immediate parent class using super keyword for code reusability
    public Staff(String username, String password) {
        super(username, password);
    }

    //Method to view the products in the inventory - Polymorphism
    @Override
    public void viewProducts() {
        System.out.println("Viewing all products...");
    }

    //Method to generate a report based on the given information and category - Polymorphism
    @Override
    public void generateReport() {
        System.out.println("Generating full report...");
    }

    //Method to view the past CRUD operations performed by the users - Polymorphism
    @Override
    public void viewLogs() {
        System.out.println("View Past CRUD History...");
    }
}

package model;

// Derived class from the base class User

public class Admin extends User { 

    //Calling the constructor of the immediate parent class using super keyword for code reusability
    public Admin(String username, String password) {
        super(username, password);
    }

    //Implementation of the abstract methods
    public void addProduct() {
        System.out.println("Adding product...");
    }

    public void updateProduct() {
        System.out.println("Updating product...");
    }

    public void deleteProduct() {
        System.out.println("Deleting product...");
    }

    @Override
    public void viewProducts() {
        System.out.println("Viewing all products...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating full report...");
    }

    @Override
    public void viewLogs() {
        System.out.println("View Past CRUD History...");
    }
}

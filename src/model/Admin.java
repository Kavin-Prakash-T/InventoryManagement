package model;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

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

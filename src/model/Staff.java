package model;

public class Staff extends User {
    public Staff(String username, String password) {
        super(username, password);
    }

    @Override
    public void viewProducts() {
        System.out.println("Viewing available products...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating stock report...");
    }

    @Override
    public void viewLogs() {
        System.out.println("View Past CRUD History...");
    }
}

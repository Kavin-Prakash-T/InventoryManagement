package model;

// Derived class from the base class User - Inheritance

public class Admin extends User { 

    //Calling the constructor of the immediate parent class using super keyword for code reusability
    public Admin(String username, String password) {
        super(username, password);
    }

    //Implementation of the abstract methods
    //Method to get the details of the product to be added
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAdd New Product");
        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, category, quantity, price);
        inventoryService.addProduct(product);
    }

    //Method to get the details of the product to be updated
    public void updateProduct() {
        System.out.println("Updating product...");
    }

    //Method to get the details of the product to be removed from the inventory
    public void deleteProduct() {
        System.out.println("Deleting product...");
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

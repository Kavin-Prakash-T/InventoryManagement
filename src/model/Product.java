package model;

public class Product {
    
    //Basic attributes of a product in inventory
    //Encapsulation of product attributes
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String category; //(ie..) "Electronics", "Groceries", "Clothing"

    //Parameterized constructor for initializing product attributes
    public Product(int id, String name, int quantity, double price, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    // Getters for accessing product attributes
    public int getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    // Setters for modifying product attributes
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
    public void setCategory(String category) { this.category = category; }

    // For displaying product details - Polymorphism 
    @Override
    public String toString() {
        return "Product{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Category='" + category + '\'' +
                ", Quantity=" + quantity +
                ", Price=" + price +
                '}';
    }
}

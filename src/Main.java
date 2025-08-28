import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {                                                                 //Menu Bar for user interaction
            System.out.println("Retail Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Generate Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Product selected");
                    break;
                case 2:
                    System.out.println("Update Product selected");
                    break;
                case 3:
                    System.out.println("Delete Product selected");
                    break;
                case 4:
                    System.out.println("View Product selected");
                    break;
                case 5:
                    System.out.println("Display All Products selected");
                    break;
                case 6:
                    System.out.println("Generate Report selected");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);
        sc.close();
    }
}

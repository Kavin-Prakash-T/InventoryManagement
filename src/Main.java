import java.util.Scanner;
import model.Admin;
import model.Staff;
import model.User;

//Main class to run the application using Menu driven approach 

public class Main {
    public static void main(String[] args) {

        // Scanner class to get user input 
        Scanner sc=new Scanner(System.in); 

        // Welcome message and login prompt
        System.out.println("Retail Inventory Management System");
        System.out.print("Enter your position(Admin/Staff):");
        String position=sc.nextLine();
        if(position.equals("Staff")){
            int staffID=sc.nextInt();
        }
        System.out.print("Enter your username:");
        String username=sc.nextLine();
        System.out.print("Enter your password:");
        String password=sc.nextLine();

        // Simple authentication - Role based Authentication
        User user;
        if (username.equals("admin") && password.equals("admin123")) {
            
            //Runtime implementation based on user role
            user = new Admin(username, password);
            showAdminMenu((Admin) user, sc);
        } 
        else if (username.equals("staff") && password.equals("staff123")) {
            
            //Runtime implementation based on user role
            user = new Staff(username, password);
            showStaffMenu((Staff) user, sc);
        } 
        else {
            System.out.println("Invalid credentials!");
            return;
        }
        sc.close();
    }

    //Menu for Admin with options to manage inventory
    private static void showAdminMenu(Admin admin, Scanner sc) {
        int choice;
        do {
            System.out.println("\nAdmin Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. Generate Report");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    admin.addProduct();
                    break;
                case 2:
                    admin.updateProduct();
                    break;
                case 3:
                    admin.deleteProduct();
                    break;
                case 4:
                    admin.viewProducts();
                    break;
                case 5:
                    admin.generateReport();
                    break;
                case 6:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }

    //Menu for Staff with limited options
    private static void showStaffMenu(Staff staff, Scanner sc) {
        int choice;
        do {
            System.out.println("\nStaff Menu");
            System.out.println("1. View Products");
            System.out.println("2. Generate Report");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    staff.viewProducts();
                    break;
                case 2:
                    staff.generateReport();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }

}

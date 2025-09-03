package model;

//Abstract base class for different type of users - Inheritance

public abstract class User {

    //basic attributes for user
    //Encapsulation
    protected String username;
    protected String password;

    //parameterized constructor for initializing user attributes
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Abstract methods to be implemented by derived classes
    //These are the common features for all type of users
    //Abstraction
    public abstract void viewProducts();
    public abstract void generateReport();
    public abstract void viewLogs();
}

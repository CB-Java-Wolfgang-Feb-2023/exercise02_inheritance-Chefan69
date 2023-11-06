public class Vehicle {
    // protected access modifier used for atributes, methods that should only be accessible
    // in the same package or subclasses
    protected String brand;
    protected int year;

    // default constructor
    public Vehicle () {
        this.brand = "Unknown Brand";
        this.year = 0;

    }

    // Parameterized constructor
    public Vehicle (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Information: Brand - " + brand + ", Year - " + year);
    }

    // Method to be overridden by subclasses
    public void start() {
        System.out.println("Starting the vehicle");
    }

}

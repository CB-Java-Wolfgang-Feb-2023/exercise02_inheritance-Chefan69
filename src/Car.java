public class Car extends Vehicle {
    private int numDoors;

    public Car(){
        super();
        this.numDoors = 4;
    }

    // Parameterized constructor
    public Car (String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    // Method to display car information
    @Override
    public void displayInfo() {

        System.out.println("Car Information: Brand - " + brand + ", Year - " + year + ", Doors - " + numDoors);

    }

    @Override
    public void start() {
        System.out.println("Starting the Car");
    }
}

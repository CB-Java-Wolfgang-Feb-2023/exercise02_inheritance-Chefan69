public class Motorcycle extends Vehicle{

    private String type;

    // Default Constructor
    public Motorcycle() {
        super();
        this.type = "Unknown Motorcycle";

    }

    // Parameterized constructor
    public Motorcycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Information: Brand - " + brand + ", Year - " + year + ", Type - " + type);
    }

    // Overridden method
    @Override
    public void start() {
        System.out.println("Starting the motorcycle");

    }


}

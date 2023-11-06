// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of each class
        Vehicle vehicle = new Vehicle("Some Vehicle", 2022);
        Car car = new Car("Toyota", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 2020, "Cruiser");

        // Display information using polymorphism
        // displayVehicleInfoAndStart on vehicle, car and motorcycle
        displayVehicleInfoAndStart(vehicle);
        displayVehicleInfoAndStart(car);
        displayVehicleInfoAndStart(motorcycle);
    }

    // Polymorphic method
    public static void displayVehicleInfoAndStart(Vehicle v) {
        v.displayInfo();
        v.start();
        System.out.println();

    }
}
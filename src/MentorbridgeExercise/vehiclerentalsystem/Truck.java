package MentorbridgeExercise.vehiclerentalsystem;

/**
 * Represents a truck in the rental system.
 * Truck is a type of Vehicle.
 */
public class Truck extends Vehicle {

    private double loadCapacity;

    /**
     * Creates a Truck object.
     *
     * @param vehicleNumber truck registration number
     * @param brand truck brand name
     * @param model truck model name
     * @param rentPerDay rental cost per day
     * @param loadCapacity load capacity of the truck
     */
    public Truck(String vehicleNumber, String brand,
                 String model, double rentPerDay,
                 double loadCapacity) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.loadCapacity = loadCapacity;
    }

    /**
     * Displays truck details.
     * This method overrides the Vehicle method.
     */
    @Override
    public void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Vehicle Type  : Truck");
        System.out.println("Load Capacity : " + loadCapacity);
    }
}
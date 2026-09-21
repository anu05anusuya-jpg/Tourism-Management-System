package MentorbridgeExercise.vehiclerentalsystem;

/**
 * Represents a bike in the rental system.
 * Bike is a type of Vehicle.
 */
public class Bike extends Vehicle {

    private int engineCC;

    /**
     * Creates a Bike object.
     *
     * @param vehicleNumber bike registration number
     * @param brand bike brand name
     * @param model bike model name
     * @param rentPerDay rental cost per day
     * @param engineCC engine capacity of the bike
     */
    public Bike(String vehicleNumber, String brand,
                String model, double rentPerDay,
                int engineCC) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.engineCC = engineCC;
    }

    /**
     * Displays bike details.
     * This method overrides the Vehicle method.
     */
    @Override
    public void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Vehicle Type  : Bike");
        System.out.println("Engine CC     : " + engineCC);
    }
}
package MentorbridgeExercise.vehiclerentalsystem;

/**
 * Represents a car in the rental system.
 * Car is a type of Vehicle.
 */
public class Car extends Vehicle {

    private int numberOfSeats;

    /**
     * Creates a Car object.
     *
     * @param vehicleNumber car registration number
     * @param brand car brand name
     * @param model car model name
     * @param rentPerDay rental cost per day
     * @param numberOfSeats number of seats in the car
     */
    public Car(String vehicleNumber, String brand,
               String model, double rentPerDay,
               int numberOfSeats) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Displays car details.
     * This method overrides the Vehicle method.
     */
    @Override
    public void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Vehicle Type  : Car");
        System.out.println("Number Seats  : " + numberOfSeats);
    }
}
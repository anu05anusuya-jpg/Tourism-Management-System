package MentorbridgeExercise.vehiclerentalsystem;

/**
 * Represents a rental in the vehicle rental system.
 * A Rental HAS-A Customer and HAS-A Vehicle.
 */
public class Rental {

    private String rentalId;
    private int rentalDays;
    private Customer customer;
    private Vehicle vehicle;

    /**
     * Creates a Rental object.
     *
     * @param rentalId rental identification number
     * @param rentalDays number of rental days
     * @param customer customer who rents the vehicle
     * @param vehicle vehicle being rented
     */
    public Rental(String rentalId, int rentalDays,
                  Customer customer, Vehicle vehicle) {

        this.rentalId = rentalId;
        this.rentalDays = rentalDays;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    /**
     * Calculates the total rental cost.
     *
     * @return total rental cost
     */
    public double calculateTotalCost() {
        return vehicle.calculateRent(rentalDays);
    }

    /**
     * Displays rental, customer and vehicle details.
     */
    public void displayRentalDetails() {

        System.out.println("========================================");
        System.out.println("       VEHICLE RENTAL MANAGEMENT");
        System.out.println("========================================");

        System.out.println("Rental ID     : " + rentalId);
        System.out.println("Rental Days   : " + rentalDays);

        System.out.println("\nCustomer Details:");
        customer.displayCustomerDetails();

        System.out.println("\nVehicle Details:");
        vehicle.displayVehicleDetails();

        System.out.println("Total Amount  : €" + calculateTotalCost());
    }
}
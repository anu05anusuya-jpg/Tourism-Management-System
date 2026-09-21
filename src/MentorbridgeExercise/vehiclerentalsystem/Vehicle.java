package MentorbridgeExercise.vehiclerentalsystem;

/**
 * Represents a vehicle in the vehicle rental system.
 * @author Anusuya
 */
public class Vehicle {

    private String vehicleNumber;
    private String brand;
    private String model;
    private double rentPerDay;

    /**
     * Creates a Vehicle object with vehicle details.
     * @param vehicleNumber
     * @param brand
     * @param model
     * @param rentPerDay
     */
    public Vehicle(String vehicleNumber, String brand,
                   String model, double rentPerDay) {

        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    /**
     * Returns the vehicle number.
     * @return
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * Returns the vehicle brand
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Return the vehicle model
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Return  the rentperday
     * @return
     */
    public double getRentPerDay() {
        return rentPerDay;
    }

    /**
     * Calculates the total rent for the given number of days.
     * @param rentalDays
     * @return
     */
    public double calculateRent(int rentalDays) {
        return rentPerDay * rentalDays;
    }

    /**
     * Displays the vehicle details.
     */
    public void displayVehicleDetails() {
        System.out.println("Vehicle No    : " + vehicleNumber);
        System.out.println("Brand         : " + brand);
        System.out.println("Model         : " + model);
        System.out.println("Rent Per Day  : €" + rentPerDay);
    }
}
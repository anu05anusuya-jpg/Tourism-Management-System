package MentorbridgeExercise;

import MentorbridgeExercise.vehiclerentalsystem.*;
import java.util.Scanner;

/**
 * Main class for the Vehicle Rental Management System.
 *
 * <p>This class accepts customer and address details,
 * allows the user to select a vehicle, creates a rental,
 * and calculates the total rental cost.</p>
 *
 * @author Anusuya
 */
public class VehicleRentalMain {

    /**
     * Starts the Vehicle Rental Management System.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       VEHICLE RENTAL MANAGEMENT");
        System.out.println("========================================");

        // Customer Details
        System.out.println("\n----- CUSTOMER DETAILS -----");

        System.out.print("Customer ID   : ");
        String customerId = scanner.nextLine();

        System.out.print("Customer Name : ");
        String customerName = scanner.nextLine();

        System.out.print("Phone Number  : ");
        String phoneNumber = scanner.nextLine();

        // Address Details
        System.out.println("\n----- ADDRESS DETAILS -----");

        System.out.print("House Number  : ");
        String houseNumber = scanner.nextLine();

        System.out.print("Street        : ");
        String street = scanner.nextLine();

        System.out.print("City          : ");
        String city = scanner.nextLine();

        System.out.print("Postal Code   : ");
        String postalCode = scanner.nextLine();

        Address address = new Address(
                houseNumber,
                street,
                city,
                postalCode
        );

        // Customer HAS-A Address
        Customer customer = new Customer(
                customerId,
                customerName,
                phoneNumber,
                address
        );

        // Vehicle Selection
        System.out.println("\n----- VEHICLE SELECTION -----");

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        System.out.print("Choose Vehicle : ");
        int choice = scanner.nextInt();

        /*
         * Polymorphism:
         * Vehicle reference can hold
         * Car, Bike or Truck object.
         */
        Vehicle vehicle;

        if (choice == 1) {

            vehicle = new Car(
                    "BE-123-ABC",
                    "Toyota",
                    "Corolla",
                    50,
                    5
            );

        } else if (choice == 2) {

            vehicle = new Bike(
                    "BIKE-101",
                    "Royal Enfield",
                    "Classic 350",
                    40,
                    349
            );

        } else if (choice == 3) {

            vehicle = new Truck(
                    "TR-101",
                    "Volvo",
                    "FH16",
                    100,
                    10
            );

        } else {

            System.out.println("Invalid vehicle choice!");
            scanner.close();
            return;
        }

        // Rental Details
        scanner.nextLine();

        System.out.println("\n----- RENTAL DETAILS -----");

        System.out.print("Rental ID     : ");
        String rentalId = scanner.nextLine();

        System.out.print("Rental Days   : ");
        int rentalDays = scanner.nextInt();

        // Rental HAS-A Customer
        // Rental HAS-A Vehicle
        Rental rental = new Rental(
                rentalId,
                rentalDays,
                customer,
                vehicle
        );

        // Display Customer
        System.out.println("\n----- CUSTOMER INFORMATION -----");

        customer.displayCustomerDetails();

        // Display Vehicle
        System.out.println("\n----- VEHICLE INFORMATION -----");

        vehicle.displayVehicleDetails();

        // Display Rental
        System.out.println("\n----- RENTAL INFORMATION -----");

        System.out.println("Rental ID    : " + rentalId);
        System.out.println("Rental Days  : " + rentalDays);

        double totalAmount = rental.calculateTotalCost();

        System.out.println("Total Amount : €" + totalAmount);

        scanner.close();
    }
}
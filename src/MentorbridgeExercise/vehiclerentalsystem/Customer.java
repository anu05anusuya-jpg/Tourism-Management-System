package MentorbridgeExercise.vehiclerentalsystem;

/**
 * Represents a customer in the vehicle rental system.
 * A Customer HAS-A Address.
 */
public class Customer {

    private String customerId;
    private String customerName;
    private String phoneNumber;
    private Address address;

    /**
     * Creates a Customer object with customer details and address.
     *
     * @param customerId customer identification number
     * @param customerName customer name
     * @param phoneNumber customer phone number
     * @param address customer address
     */
    public Customer(String customerId, String customerName,
                    String phoneNumber, Address address) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * Displays the customer details and address.
     */
    public void displayCustomerDetails() {

        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + phoneNumber);

        System.out.println("Address:");
        address.displayAddress();
    }
}
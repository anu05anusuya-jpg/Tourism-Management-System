package MentorbridgeExercise.vehiclerentalsystem;

/**
 * Represents the address of a customer.
 */
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String postalCode;

    /**
     * Creates an Address object.
     *
     * @param houseNumber
     * @param street
     * @param city
     * @param postalCode
     */
    public Address(String houseNumber, String street,
                   String city, String postalCode) {

        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     * Displays the address details.
     */
    public void displayAddress() {

        System.out.println("House Number : " + houseNumber);
        System.out.println("Street       : " + street);
        System.out.println("City         : " + city);
        System.out.println("Postal Code  : " + postalCode);
    }
}

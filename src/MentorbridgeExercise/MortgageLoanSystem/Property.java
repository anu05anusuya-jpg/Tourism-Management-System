package MentorbridgeExercise.MortgageLoanSystem;

/**
 * Represents the property details used in a mortgage loan application.
 * The class implements LoanVerification to verify the property value.
 */
public class Property implements LoanVerification {

    private String propertyId;
    private String address;
    private String propertyType;
    private double propertyValue;

    /**
     * Creates a property with the given details.
     *
     * @param propertyId unique ID of the property
     * @param address address of the property
     * @param propertyType type of the property
     * @param propertyValue value of the property
     */
    public Property(String propertyId,
                    String address,
                    String propertyType,
                    double propertyValue) {

        this.propertyId = propertyId;
        this.address = address;
        this.propertyType = propertyType;
        this.propertyValue = propertyValue;
    }

    /**
     * Returns the property ID.
     *
     * @return property ID
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * Returns the property address.
     *
     * @return property address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the property type.
     *
     * @return property type
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Returns the property value.
     *
     * @return property value
     */
    public double getPropertyValue() {
        return propertyValue;
    }

    /**
     * Verifies the property value.
     * The verification passes when the property value is greater than zero.
     */
    @Override
    public void verify() {

        if (propertyValue > 0) {

            System.out.println(
                    "Property Verification : PASSED"
            );

        } else {

            System.out.println(
                    "Property Verification : FAILED"
            );
        }
    }

    /**
     * Displays the property details.
     */
    public void displayPropertyDetails() {

        System.out.println(
                "Property ID    : " + propertyId
        );

        System.out.println(
                "Address        : " + address
        );

        System.out.println(
                "Property Type  : " + propertyType
        );

        System.out.printf(
                "Property Value : ₹%,.2f%n",
                propertyValue
        );
    }
}
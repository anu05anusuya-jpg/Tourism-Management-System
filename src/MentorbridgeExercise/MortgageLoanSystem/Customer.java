package MentorbridgeExercise.MortgageLoanSystem;

public class Customer {

    private String customerId;
    private String name;
    private String phone;
    private String email;
    private int age;

    /**
     * Creates a customer with the given details.
     *
     * @param customerId unique ID of the customer
     * @param name customer name
     * @param phone customer phone number
     * @param email customer email address
     * @param age customer age
     */
    public Customer(String customerId,
                    String name,
                    String phone,
                    String email,
                    int age) {

        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    /**
     * Returns the customer ID.
     *
     * @return customer ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Returns the customer name.
     *
     * @return customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the customer phone number.
     *
     * @return customer phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Returns the customer email address.
     *
     * @return customer email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the customer age.
     *
     * @return customer age
     */
    public int getAge() {
        return age;
    }

    /**
     * Displays the customer's details.
     */
    public void displayCustomerDetails() {

        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Phone       : " + phone);
        System.out.println("Email       : " + email);
    }
}
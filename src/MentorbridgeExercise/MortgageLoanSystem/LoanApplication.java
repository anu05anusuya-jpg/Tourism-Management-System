package MentorbridgeExercise.MortgageLoanSystem;

import java.time.LocalDate;

public class LoanApplication {

    private String applicationId;
    private LocalDate applicationDate;

    private Customer customer;
    private Employment employment;
    private Property property;
    private CreditCheck creditCheck;
    private MortgageLoan loan;

    private LoanStatus status;

    /**
     * Creates a loan application with customer, employment,
     * property, credit, and loan details.
     *
     * @param applicationId unique application ID
     * @param customer customer details
     * @param employment employment details
     * @param property property details
     * @param creditCheck credit check details
     * @param loan mortgage loan details
     */
    public LoanApplication(String applicationId,
                           Customer customer,
                           Employment employment,
                           Property property,
                           CreditCheck creditCheck,
                           MortgageLoan loan) {

        this.applicationId = applicationId;
        this.applicationDate = LocalDate.now();

        this.customer = customer;
        this.employment = employment;
        this.property = property;
        this.creditCheck = creditCheck;
        this.loan = loan;

        this.status = LoanStatus.SUBMITTED;
    }

    /**
     * Returns the application ID.
     *
     * @return application ID
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Returns the application date.
     *
     * @return application date
     */
    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    /**
     * Returns the customer associated with the application.
     *
     * @return customer object
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Returns the employment details.
     *
     * @return employment object
     */
    public Employment getEmployment() {
        return employment;
    }

    /**
     * Returns the property details.
     *
     * @return property object
     */
    public Property getProperty() {
        return property;
    }

    /**
     * Returns the credit check details.
     *
     * @return credit check object
     */
    public CreditCheck getCreditCheck() {
        return creditCheck;
    }

    /**
     * Returns the mortgage loan.
     *
     * @return mortgage loan object
     */
    public MortgageLoan getLoan() {
        return loan;
    }

    /**
     * Returns the current application status.
     *
     * @return current loan status
     */
    public LoanStatus getStatus() {
        return status;
    }

    /**
     * Updates the current application status.
     *
     * @param status new loan application status
     */
    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    /**
     * Checks the loan eligibility based on income,
     * credit score, and property value.
     *
     * @return eligibility result
     */
    public EligibilityResult checkEligibility() {

        boolean incomePassed =
                employment.getMonthlyIncome() >= 30000
                        && employment.getExperience() >= 2;

        boolean creditPassed =
                creditCheck.getCreditScore() >= 700;

        boolean propertyPassed =
                property.getPropertyValue()
                        >= loan.getLoanAmount();

        return new EligibilityResult(
                incomePassed,
                creditPassed,
                propertyPassed
        );
    }

    /**
     * Displays the basic loan application details.
     */
    public void displayApplicationDetails() {

        System.out.println(
                "Application ID   : " + applicationId
        );

        System.out.println(
                "Application Date : " + applicationDate
        );

        System.out.println(
                "Status           : " + status
        );
    }
}
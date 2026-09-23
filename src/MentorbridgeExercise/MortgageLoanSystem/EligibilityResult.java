package MentorbridgeExercise.MortgageLoanSystem;

public class EligibilityResult {

    private boolean incomePassed;
    private boolean creditPassed;
    private boolean propertyPassed;
    private boolean eligible;

    /**
     * Creates an eligibility result based on income,
     * credit, and property verification results.
     *
     * @param incomePassed whether the income requirement passed
     * @param creditPassed whether the credit requirement passed
     * @param propertyPassed whether the property requirement passed
     */
    public EligibilityResult(boolean incomePassed,
                             boolean creditPassed,
                             boolean propertyPassed) {

        this.incomePassed = incomePassed;
        this.creditPassed = creditPassed;
        this.propertyPassed = propertyPassed;

        this.eligible =
                incomePassed
                        && creditPassed
                        && propertyPassed;
    }

    /**
     * Checks whether the loan is eligible.
     *
     * @return true if all requirements are passed, otherwise false
     */
    public boolean isEligible() {
        return eligible;
    }

    /**
     * Displays the income, credit, property,
     * and overall loan eligibility results.
     */
    public void displayResult() {

        System.out.println(
                "Income Requirement     : "
                        + (incomePassed ? "PASSED" : "FAILED")
        );

        System.out.println(
                "Credit Requirement     : "
                        + (creditPassed ? "PASSED" : "FAILED")
        );

        System.out.println(
                "Property Requirement   : "
                        + (propertyPassed ? "PASSED" : "FAILED")
        );

        System.out.println();

        System.out.println(
                "LOAN ELIGIBILITY       : "
                        + (eligible ? "APPROVED" : "REJECTED")
        );
    }
}
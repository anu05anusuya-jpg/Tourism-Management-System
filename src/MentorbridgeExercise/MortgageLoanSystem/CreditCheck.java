package MentorbridgeExercise.MortgageLoanSystem;

public class CreditCheck implements LoanVerification {

    private int creditScore;

    /**
     * Creates a credit check with the given credit score.
     *
     * @param creditScore the customer's credit score
     */
    public CreditCheck(int creditScore) {
        this.creditScore = creditScore;
    }

    /**
     * Returns the customer's credit score.
     *
     * @return the credit score
     */
    public int getCreditScore() {
        return creditScore;
    }

    /**
     * Verifies the customer's credit score.
     * The verification passes when the credit score is 700 or above.
     */
    @Override
    public void verify() {

        if (creditScore >= 700) {

            System.out.println(
                    "Credit Verification : PASSED"
            );

        } else {

            System.out.println(
                    "Credit Verification : FAILED"
            );
        }
    }

    /**
     * Displays the customer's credit score.
     */
    public void displayCreditDetails() {

        System.out.println(
                "Credit Score : " + creditScore
        );
    }
}
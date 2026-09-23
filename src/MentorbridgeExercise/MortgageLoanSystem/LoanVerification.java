package MentorbridgeExercise.MortgageLoanSystem;

/**
 * Defines the verification operations required for a loan.
 */
public interface LoanVerification {

    /**
     * Interface is a contract that defines what a class must do, while the implementing class defines how to do it.
     * Performs the verification process.
     */
    void verify();

    /**
     * Displays a common verification completion message.
     */
    default void showVerificationMessage() {

        System.out.println(
                "Verification process completed."
        );
    }
}
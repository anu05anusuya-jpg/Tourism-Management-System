package MentorbridgeExercise.MortgageLoanSystem;

/**
 * Represents the possible statuses of a loan application.
 */
public enum LoanStatus {

    /**
     * Enum is a special Java type used to represent a fixed set of constant values.
     * Application has been submitted.
     */
    SUBMITTED,

    /**
     * Application is currently under review.
     */
    UNDER_REVIEW,

    /**
     * Loan application has been approved.
     */
    APPROVED,

    /**
     * Loan application has been rejected.
     */
    REJECTED,

    /**
     * Loan processing has started.
     */
    PROCESSING
}
package MentorbridgeExercise.MortgageLoanSystem;

/**
 * Represents a commercial mortgage loan.
 * Extends MortgageLoan and provides the interest rate
 * specific to a commercial loan.
 */
public class CommercialLoan extends MortgageLoan {

    /**
     * Creates a commercial loan with the given amount and tenure.
     *
     * @param loanAmount the loan amount
     * @param loanYears the loan tenure in years
     */
    public CommercialLoan(double loanAmount,
                          int loanYears) {

        super(loanAmount, loanYears);
    }

    /**
     * Returns the annual interest rate for a commercial loan.
     *
     * @return annual interest rate of 9%
     */
    @Override
    public double getAnnualInterestRate() {

        return 9.0;
    }
}
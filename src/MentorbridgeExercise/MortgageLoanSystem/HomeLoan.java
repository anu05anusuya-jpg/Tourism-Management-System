package MentorbridgeExercise.MortgageLoanSystem;

public class HomeLoan extends MortgageLoan {

    /**
     * Creates a home loan with the given amount and tenure.
     *
     * @param loanAmount the loan amount
     * @param loanYears the loan tenure in years
     */
    public HomeLoan(double loanAmount,
                    int loanYears) {

        super(loanAmount, loanYears);
    }

    /**
     * Returns the annual interest rate for a home loan.
     *
     * @return annual interest rate of 8%
     */
    @Override
    public double getAnnualInterestRate() {

        return 8.0;
    }
}
package MentorbridgeExercise.MortgageLoanSystem;

/**
 * Represents the common properties and operations of a mortgage loan.
 */
public abstract class MortgageLoan {

    private double loanAmount;
    private int loanYears;

    /**
     * Creates a mortgage loan with the given amount and tenure.
     *
     * @param loanAmount the loan amount
     * @param loanYears the loan tenure in years
     */
    public MortgageLoan(double loanAmount,
                        int loanYears) {

        this.loanAmount = loanAmount;
        this.loanYears = loanYears;
    }

    /**
     * Returns the loan amount.
     *
     * @return loan amount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Returns the loan tenure.
     *
     * @return loan tenure in years
     */
    public int getLoanYears() {
        return loanYears;
    }

    /**
     * Returns the annual interest rate for the loan.
     *
     * @return annual interest rate
     */
    public abstract double getAnnualInterestRate();

    /**
     * Displays the loan amount, tenure, and interest rate.
     */
    public void displayLoanDetails() {

        System.out.printf(
                "Loan Amount   : ₹%,.2f%n",
                loanAmount
        );

        System.out.println(
                "Loan Tenure   : " + loanYears + " years"
        );

        System.out.printf(
                "Interest Rate : %.2f%%%n",
                getAnnualInterestRate()
        );
    }

    /**
     * Calculates the monthly EMI without insurance.
     *
     * @return monthly EMI
     */
    public double calculateEMI() {
        return calculateEMI(false);
    }

    /**
     * Calculates the monthly EMI with an optional insurance amount.
     *
     * @param insurance whether insurance should be added
     * @return monthly EMI
     */
    public double calculateEMI(boolean insurance) {

        double principal = loanAmount;

        double monthlyRate =
                getAnnualInterestRate() / 12 / 100;

        int numberOfMonths =
                loanYears * 12;

        double emi;

        if (monthlyRate == 0) {

            emi = principal / numberOfMonths;

        } else {

            double power =
                    Math.pow(
                            1 + monthlyRate,
                            numberOfMonths
                    );

            emi =
                    principal
                            * monthlyRate
                            * power
                            / (power - 1);
        }

        if (insurance) {
            emi += 1000;
        }

        return emi;
    }

    /**
     * Returns the common loan category.
     *
     * @return mortgage loan category
     */
    public static String getLoanCategory() {
        return "Mortgage Loan";
    }
}
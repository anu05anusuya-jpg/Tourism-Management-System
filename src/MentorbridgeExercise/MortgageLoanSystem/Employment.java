package MentorbridgeExercise.MortgageLoanSystem;

public class Employment implements LoanVerification {

    private String companyName;
    private String employmentType;
    private double monthlyIncome;
    private int experience;

    /**
     * Creates an employment record with the given details.
     *
     * @param companyName the name of the company
     * @param employmentType the type of employment
     * @param monthlyIncome the monthly income of the customer
     * @param experience the number of years of work experience
     */
    public Employment(String companyName,
                      String employmentType,
                      double monthlyIncome,
                      int experience) {

        this.companyName = companyName;
        this.employmentType = employmentType;
        this.monthlyIncome = monthlyIncome;
        this.experience = experience;
    }

    /**
     * Returns the company name.
     *
     * @return company name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Returns the employment type.
     *
     * @return employment type
     */
    public String getEmploymentType() {
        return employmentType;
    }

    /**
     * Returns the monthly income.
     *
     * @return monthly income
     */
    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * Returns the customer's work experience.
     *
     * @return experience in years
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Verifies the employment details.
     * The verification passes when monthly income is at least
     * ₹30,000 and work experience is at least 2 years.
     */
    @Override
    public void verify() {

        if (monthlyIncome >= 30000 && experience >= 2) {

            System.out.println(
                    "Employment Verification : PASSED"
            );

        } else {

            System.out.println(
                    "Employment Verification : FAILED"
            );
        }
    }

    /**
     * Displays the customer's employment details.
     */
    public void displayEmploymentDetails() {

        System.out.println(
                "Company         : " + companyName
        );

        System.out.println(
                "Employment Type : " + employmentType
        );

        System.out.printf(
                "Monthly Income  : ₹%,.2f%n",
                monthlyIncome
        );

        System.out.println(
                "Experience      : " + experience + " years"
        );
    }
}
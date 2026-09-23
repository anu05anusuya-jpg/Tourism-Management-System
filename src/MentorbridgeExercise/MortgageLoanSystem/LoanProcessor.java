package MentorbridgeExercise.MortgageLoanSystem;

public class LoanProcessor {

    /**
     * Processes a loan application by performing employment,
     * credit, property, and eligibility verification.
     *
     * @param application the loan application to process
     */
    public void processApplication(
            LoanApplication application) {

        System.out.println();
        System.out.println(
                "============================================================"
        );

        System.out.println(
                "                  APPLICATION REVIEW"
        );

        System.out.println(
                "============================================================"
        );

        application.setStatus(
                LoanStatus.UNDER_REVIEW
        );

        System.out.println(
                "Application Status : "
                        + application.getStatus()
        );

        System.out.println();

        System.out.println(
                "Employment Verification :"
        );

        application.getEmployment().verify();

        System.out.println();

        System.out.println(
                "Credit Verification :"
        );

        application.getCreditCheck().verify();

        System.out.println();

        System.out.println(
                "Property Verification :"
        );

        application.getProperty().verify();

        System.out.println();

        System.out.println(
                "------------------------------------------------------------"
        );

        System.out.println(
                "                  ELIGIBILITY SUMMARY"
        );

        System.out.println(
                "------------------------------------------------------------"
        );

        EligibilityResult result =
                application.checkEligibility();

        result.displayResult();

        if (result.isEligible()) {

            application.setStatus(
                    LoanStatus.APPROVED
            );

            System.out.println();

            System.out.printf(
                    "Loan Amount : ₹%,.2f%n",
                    application.getLoan()
                            .getLoanAmount()
            );

            System.out.printf(
                    "Monthly EMI : ₹%,.2f%n",
                    application.getLoan()
                            .calculateEMI()
            );

            application.setStatus(
                    LoanStatus.PROCESSING
            );

            System.out.println();

            System.out.println(
                    "Application Status : "
                            + application.getStatus()
            );

            System.out.println(
                    "Loan processing started successfully."
            );

        } else {

            application.setStatus(
                    LoanStatus.REJECTED
            );

            System.out.println();

            System.out.println(
                    "Application Status : "
                            + application.getStatus()
            );

            System.out.println(
                    "Loan application could not be approved."
            );
        }
    }
}
package MentorbridgeExercise.MortgageLoanSystem;

import java.util.Scanner;

/**
 * Main application class for the Mortgage Loan Application System.
 *
 * <p>This class collects customer, employment, property, credit,
 * and loan details from the user and processes the loan application.</p>
 */
public class MortgageLoanApplication {

    /**
     * Starts the Mortgage Loan Application System.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("     MORTGAGE LOAN APPLICATION SYSTEM");
        System.out.println("==============================================");

        System.out.print("Enter Application ID : ");
        String applicationId = sc.nextLine();

        System.out.println("\n--- CUSTOMER DETAILS ---");

        System.out.print("Customer ID : ");
        String customerId = sc.nextLine();

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Phone : ");
        String phone = sc.nextLine();

        System.out.print("Email : ");
        String email = sc.nextLine();

        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        Customer customer = new Customer(
                customerId,
                name,
                phone,
                email,
                age
        );

        System.out.println("\n--- EMPLOYMENT DETAILS ---");

        System.out.print("Company Name : ");
        String companyName = sc.nextLine();

        System.out.print("Employment Type : ");
        String employmentType = sc.nextLine();

        System.out.print("Monthly Income : ");
        double monthlyIncome = sc.nextDouble();

        System.out.print("Experience : ");
        int experience = sc.nextInt();
        sc.nextLine();

        Employment employment = new Employment(
                companyName,
                employmentType,
                monthlyIncome,
                experience
        );

        System.out.println("\n--- PROPERTY DETAILS ---");

        System.out.print("Property ID : ");
        String propertyId = sc.nextLine();

        System.out.print("Address : ");
        String address = sc.nextLine();

        System.out.print("Property Type : ");
        String propertyType = sc.nextLine();

        System.out.print("Property Value : ");
        double propertyValue = sc.nextDouble();

        sc.nextLine();

        Property property = new Property(
                propertyId,
                address,
                propertyType,
                propertyValue
        );

        System.out.println("\n--- CREDIT CHECK ---");

        System.out.print("Credit Score : ");
        int creditScore = sc.nextInt();

        CreditCheck creditCheck =
                new CreditCheck(creditScore);

        System.out.println("\n--- LOAN DETAILS ---");

        System.out.println("1. Home Loan");
        System.out.println("2. Commercial Loan");

        System.out.print("Choose Loan Type : ");
        int loanChoice = sc.nextInt();

        System.out.print("Loan Amount : ");
        double loanAmount = sc.nextDouble();

        System.out.print("Loan Tenure : ");
        int loanYears = sc.nextInt();

        MortgageLoan loan;

        if (loanChoice == 1) {

            loan = new HomeLoan(
                    loanAmount,
                    loanYears
            );

        } else {

            loan = new CommercialLoan(
                    loanAmount,
                    loanYears
            );
        }

        LoanApplication application =
                new LoanApplication(
                        applicationId,
                        customer,
                        employment,
                        property,
                        creditCheck,
                        loan
                );

        System.out.println("\n==============================================");
        System.out.println("          APPLICATION SUMMARY");
        System.out.println("==============================================");

        application.displayApplicationDetails();

        System.out.println();

        customer.displayCustomerDetails();

        System.out.println();

        employment.displayEmploymentDetails();

        System.out.println();

        property.displayPropertyDetails();

        System.out.println();

        loan.displayLoanDetails();

        LoanProcessor processor =
                new LoanProcessor();

        processor.processApplication(application);

        System.out.println("\n==============================================");
        System.out.println("          FINAL APPLICATION STATUS");
        System.out.println("==============================================");

        System.out.println(
                "Application ID : "
                        + application.getApplicationId()
        );

        System.out.println(
                "Customer       : "
                        + customer.getName()
        );

        System.out.println(
                "Loan Type      : "
                        + loan.getClass().getSimpleName()
        );

        System.out.printf(
                "Loan Amount    : ₹%,.2f%n",
                loan.getLoanAmount()
        );

        System.out.printf(
                "Monthly EMI    : ₹%,.2f%n",
                loan.calculateEMI()
        );

        System.out.println(
                "Status         : "
                        + application.getStatus()
        );

        System.out.println("==============================================");

        sc.close();
    }
}
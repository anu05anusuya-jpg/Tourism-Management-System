package MentorbridgeExercise;

public class EmployeePayroll {

    public static void main(String[] args) {

        // 5. Polymorphism
        Employee e1 = new Developer(123, "Anu", 40000, 5000);

        Employee e2 = new SeniorDeveloper(
                456, "Priya", 50000, 7000, 8000
        );

        Employee e3 = new TeamLead(
                789, "Kavi", 60000, 8000, 10000, 12000
        );

        System.out.println("===== EMPLOYEE PAYROLL MANAGEMENT SYSTEM =====");
        System.out.println();

        e1.displayDetails();

        System.out.println();
        e2.displayDetails();

        System.out.println();
        e3.displayDetails();
    }
}


// 1. Abstraction
abstract class Employee {

    // 5. Encapsulation
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    // Constructor
    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Abstract method for salary calculation
    abstract double calculateSalary();

    // Common display method
    public void displayDetails() {

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee Role : " + getRole());
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("Allowance     : ₹" + getAllowance());
        System.out.println("Total Salary  : ₹" + calculateSalary());
    }

    abstract String getRole();

    abstract double getAllowance();
}


// 2. Developer
class Developer extends Employee {

    private double allowance;

    Developer(int employeeId,
              String employeeName,
              double basicSalary,
              double allowance) {

        super(employeeId, employeeName, basicSalary);
        this.allowance = allowance;
    }

    // 4. Method Overriding
    @Override
    double calculateSalary() {
        return getBasicSalary() + allowance;
    }

    @Override
    String getRole() {
        return "Developer";
    }

    @Override
    double getAllowance() {
        return allowance;
    }
}


// 2 & 3. Multilevel Inheritance
class SeniorDeveloper extends Developer {

    private double seniorAllowance;

    SeniorDeveloper(int employeeId,
                    String employeeName,
                    double basicSalary,
                    double allowance,
                    double seniorAllowance) {

        super(employeeId, employeeName, basicSalary, allowance);
        this.seniorAllowance = seniorAllowance;
    }

    // Method Overriding
    @Override
    double calculateSalary() {
        return super.calculateSalary() + seniorAllowance;
    }

    @Override
    String getRole() {
        return "Senior Developer";
    }

    @Override
    double getAllowance() {
        return super.getAllowance() + seniorAllowance;
    }
}


// 2 & 3. Multilevel Inheritance
class TeamLead extends SeniorDeveloper {

    private double leadAllowance;

    TeamLead(int employeeId,
             String employeeName,
             double basicSalary,
             double allowance,
             double seniorAllowance,
             double leadAllowance) {

        super(employeeId,
                employeeName,
                basicSalary,
                allowance,
                seniorAllowance);

        this.leadAllowance = leadAllowance;
    }

    // Method Overriding
    @Override
    double calculateSalary() {
        return super.calculateSalary() + leadAllowance;
    }

    @Override
    String getRole() {
        return "Team Lead";
    }

    @Override
    double getAllowance() {
        return super.getAllowance() + leadAllowance;
    }
}



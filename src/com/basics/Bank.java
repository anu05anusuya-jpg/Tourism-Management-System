package MentorbridgeExercise;

// Method Overloading(same method,Different parameter)

//other names /terms:

//Compile-time Polymorphism
//Static Polymorphism
//Early Binding / Static Binding

class BankAccount {

    void withdraw(int amount) {
        System.out.println("Withdraw: ₹" + amount);
    }

    void withdraw(int amount, String accountType) {
        System.out.println("Withdraw: ₹" + amount);
        System.out.println("Account Type: " + accountType);
    }
}

public class Bank {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.withdraw(2000);

        ba.withdraw(3000, "Saving");
    }
}
*/

/*
// Method Overriding(same method(withdraw) and same siganture(int))
//extends = used to inherit the properties and methods of a parent class into a child class.
//other name / term:

//Runtime Polymorphism
//Dynamic Polymorphism
//Late Binding / Dynamic Binding


// Parent class
class BankAccount {

    // Parent method
    void withdraw(int amount) {
        System.out.println("Normal Bank Withdrawal: ₹" + amount);
    }
}

// Child class
class SavingsAccount extends BankAccount {

    // Overriding parent method
    @Override
    void withdraw(int amount) {
        System.out.println("Savings Account Withdrawal: ₹" + amount);
    }
}

// Main class
class Main {

    public static void main(String[] args) {

        // Creating object
        SavingsAccount s = new SavingsAccount();

        // Calling method
        s.withdraw(2000);
    }
}

 */
/*
//Dynamic method(deciding which overridden method to execute at runtime)


class BankAccount {

    void accountType() {
        System.out.println("Normal Bank Account");
    }
}

class SavingsAccount extends BankAccount {

    @Override
    void accountType() {
        System.out.println("Savings Account ");
    }
}

class Main {

    public static void main(String[] args) {

        BankAccount b = new SavingsAccount();

        b.accountType();
    }
}


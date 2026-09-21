package MentorbridgeExercise;

class Bank {

    String customerName;
    int age;
    double balance;

    // 1. No-Argument Constructor/defalut
    Bank() {
        customerName = "lux";
        age = 20;
        balance = 5;

        System.out.println("No-Argument Constructor Called");
    }

    // 2. Parameterized Constructor
    Bank(String name, int age, double balance) {
        this.customerName = name;
        this.age = age;
        this.balance = balance;

        System.out.println("Parameterized Constructor Called");
    }

    // 3. Constructor Overloading
    Bank(String name) {
        this.customerName = name;
        this.age = 21;
        this.balance = 1000.0;

        System.out.println("One-Parameter Constructor Called");
    }

    // 4. Copy Constructor
    Bank(Bank b) {
        this.customerName = b.customerName;
        this.age = b.age;
        this.balance = b.balance;

        System.out.println("Copy Constructor Called");
    }

    // Method
    void display() {
        System.out.println("----------------------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Age           : " + age);
        System.out.println("Balance       : ₹" + balance);
    }
}

class Main {

    public static void main(String[] args) {

        // 1. No-Argument Constructor
        Bank b1 = new Bank();
        b1.display();


        // 2. Parameterized Constructor
        Bank b2 = new Bank("Anu", 21, 5000);
        b2.display();


        // 3. One-Parameter Constructor
        Bank b3 = new Bank("Priya");
        b3.display();


        // 4. Copy Constructor
        Bank b4 = new Bank(b2);
        b4.display();
    }
}


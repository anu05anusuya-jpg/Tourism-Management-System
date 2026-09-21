package MentorbridgeExercise;

// Parent class
class Restaurant {

    // Instance variables
    String customerName;
    int age;
    double price;
    boolean paymentDone;
    char rating;

    // Static variable
    static int orderCount = 0;

    // Final variable
    final double TAX = 0.05;

    // No-argument constructor
    Restaurant() {
        customerName = "Unknown";
        age = 0;
        price = 0.0;
        paymentDone = false;
        rating = 'N';

        orderCount++;
    }

    // Parameterized constructor
    Restaurant(String customerName, int age, double price) {
        this.customerName = customerName;
        this.age = age;
        this.price = price;

        orderCount++;
    }

    // Constructor overloading
    Restaurant(String customerName, int age, double price,
               boolean paymentDone, char rating) {

        this.customerName = customerName;
        this.age = age;
        this.price = price;
        this.paymentDone = paymentDone;
        this.rating = rating;

        orderCount++;
    }

    // Method overloading
    void order(String food) {
        System.out.println("Food: " + food);
    }

    void order(String food, int quantity) {
        System.out.println("Food: " + food);
        System.out.println("Quantity: " + quantity);
    }

    void order(String food, int quantity, double price) {
        System.out.println("Food: " + food);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: ₹" + price);
    }

    // Instance method
    void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Age: " + age);
        System.out.println("Price: ₹" + price);
        System.out.println("Payment Done: " + paymentDone);
        System.out.println("Rating: " + rating);
    }

    // Static method
    static void displayOrderCount() {
        System.out.println("Total Orders: " + orderCount);
    }

    // Parent method
    void delivery() {
        System.out.println("Normal Delivery");
    }
}

// Child class
class HomeDelivery extends Restaurant {

    // Parameterized constructor
    HomeDelivery(String customerName, int age, double price) {

        super(customerName, age, price);

        System.out.println("Home Delivery Order Created");
    }

    // Method overriding
    @Override
    void delivery() {
        System.out.println("Home Delivery Available");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Object creation
        HomeDelivery h =
                new HomeDelivery("Anu", 21, 499.50);

        System.out.println();

        // Instance method
        h.displayCustomer();

        System.out.println();

        // Method overloading
        h.order("Pizza");

        System.out.println();

        h.order("Burger", 2);

        System.out.println();

        h.order("Pizza", 1, 499.50);

        System.out.println();

        // Non-primitive array
        String[] foods = {
                "Pizza",
                "Burger",
                "Coke"
        };

        // Loop
        System.out.println("Food Items:");

        for (String food : foods) {
            System.out.println(food);
        }

        System.out.println();

        // If else
        if (h.paymentDone) {
            System.out.println("Payment Successful");
        } else {
            System.out.println("Payment Pending");
        }

        System.out.println();

        // Method overriding
        h.delivery();

        System.out.println();

        // Dynamic method dispatch
        Restaurant r =
                new HomeDelivery("Priya", 22, 799.0);

        r.delivery();

        System.out.println();

        // Static method
        Restaurant.displayOrderCount();
    }
}



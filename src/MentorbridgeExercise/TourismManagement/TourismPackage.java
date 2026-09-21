package MentorbridgeExercise.TourismManagement;

public abstract class TourismPackage {

    private String packageId;
    private String destination;
    private int days;
    private int travelers;
    private double basePrice;

    // Parameterized constructor
    public TourismPackage(String packageId,
                          String destination,
                          int days,
                          int travelers,
                          double basePrice) {

        this.packageId = packageId;
        this.destination = destination;
        this.days = days;
        this.travelers = travelers;
        this.basePrice = basePrice;
    }

    // Getters
    public String getPackageId() {
        return packageId;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    public int getTravelers() {
        return travelers;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Setters
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setTravelers(int travelers) {
        this.travelers = travelers;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // Discount calculation
    public double calculateDiscount() {

        if (days >= 10) {
            return basePrice * 0.10;
        } else if (days >= 5) {
            return basePrice * 0.05;
        }

        return 0;
    }

    // Package type
    public String getPackageType() {

        String className = getClass().getSimpleName();

        switch (className) {

            case "DomesticTourism":
                return "Domestic Tourism";

            case "InternationalTourism":
                return "International Tourism";

            case "AdventureTourism":
                return "Adventure Tourism";

            case "LuxuryTourism":
                return "Luxury Tourism";

            default:
                return "Tourism";
        }
    }

    // Concrete method
    public void displayPackageDetails() {

        System.out.println("Package ID    : " + packageId);
        System.out.println("Package Type  : " + getPackageType());
        System.out.println("Destination   : " + destination);
        System.out.println("Days          : " + days);
        System.out.println("Travelers     : " + travelers);

        System.out.printf(
                "Base Price    : ₹%,.2f%n",
                basePrice
        );

        System.out.printf(
                "Discount      : ₹%,.2f%n",
                calculateDiscount()
        );

        System.out.printf(
                "Final Price   : ₹%,.2f%n",
                calculateFinalPrice()
        );
    }

    // Abstract method
    public abstract double calculateFinalPrice();
}
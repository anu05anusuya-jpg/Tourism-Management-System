package MentorbridgeExercise.TourismManagement;

public class Booking {

    private String bookingId;
    private Tourist tourist;
    private TourismPackage tourismPackage;
    private String bookingDate;

    // Parameterized constructor
    public Booking(String bookingId,
                   Tourist tourist,
                   TourismPackage tourismPackage,
                   String bookingDate) {

        this.bookingId = bookingId;
        this.tourist = tourist;
        this.tourismPackage = tourismPackage;
        this.bookingDate = bookingDate;
    }

    // Getters
    public String getBookingId() {
        return bookingId;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public TourismPackage getTourismPackage() {
        return tourismPackage;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    // Setters
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public void setTourismPackage(TourismPackage tourismPackage) {
        this.tourismPackage = tourismPackage;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    // Display booking details
    public void displayBookingDetails() {

        System.out.println("Booking ID     : " + bookingId);
        System.out.println("Booking Date   : " + bookingDate);

        System.out.println();

        System.out.println("Tourist ID     : "
                + tourist.getTouristId());

        System.out.println("Tourist Name   : "
                + tourist.getTouristName());

        System.out.println("Email          : "
                + tourist.getEmail());

        System.out.println("Phone          : "
                + tourist.getPhone());

        System.out.println();

        System.out.println("Package ID     : "
                + tourismPackage.getPackageId());

        System.out.println("Package Type   : "
                + tourismPackage.getPackageType());

        System.out.println("Destination    : "
                + tourismPackage.getDestination());

        System.out.println("Days           : "
                + tourismPackage.getDays());

        System.out.println("Travelers      : "
                + tourismPackage.getTravelers());

        System.out.printf(
                "Base Price     : ₹%,.2f%n",
                tourismPackage.getBasePrice()
        );

        System.out.printf(
                "Discount       : ₹%,.2f%n",
                tourismPackage.calculateDiscount()
        );

        System.out.printf(
                "Final Price    : ₹%,.2f%n",
                tourismPackage.calculateFinalPrice()
        );
    }
}
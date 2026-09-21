package MentorbridgeExercise.TourismManagement;

import java.util.Scanner;

public class TourismManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                    DHILTOUR TRAVELS");
        System.out.println("============================================================");

        System.out.println();
        System.out.println("                    TOURIST DETAILS");
        System.out.println("------------------------------------------------------------");

        System.out.print("Tourist ID : ");
        int touristId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name       : ");
        String touristName = sc.nextLine();

        System.out.print("Email      : ");
        String email = sc.nextLine();

        System.out.print("Phone      : ");
        String phone = sc.nextLine();


        // No-argument constructor
        Tourist tourist = new Tourist();

        // Using setters
        tourist.setTouristId(touristId);
        tourist.setTouristName(touristName);
        tourist.setEmail(email);
        tourist.setPhone(phone);


        // Parameterized constructor demonstration
        Tourist tourist2 = new Tourist(
                102,
                "Priya",
                "priya@gmail.com",
                "9876543211"
        );

        // Display entered tourist
        System.out.println();
        tourist.displayTouristDetails();

        System.out.println();
        System.out.println("                    TRIP DETAILS");
        System.out.println("------------------------------------------------------------");

        System.out.print("Enter Number of Days      : ");
        int days = sc.nextInt();

        System.out.print("Enter Number of Travelers : ");
        int travelers = sc.nextInt();

        sc.nextLine();

        TourismPackage package1 =
                new DomesticTourism(
                        "TP101",
                        "Goa",
                        days,
                        travelers,
                        40000
                );

        TourismPackage package2 =
                new InternationalTourism(
                        "TP102",
                        "Paris",
                        days,
                        travelers,
                        100000
                );

        TourismPackage package3 =
                new AdventureTourism(
                        "TP103",
                        "Manali",
                        days,
                        travelers,
                        60000
                );

        TourismPackage package4 =
                new LuxuryTourism(
                        "TP104",
                        "Dubai",
                        days,
                        travelers,
                        300000
                );


        // ====================================================
        // POLYMORPHISM
        // ====================================================

        TourismPackage[] packages = {
                package1,
                package2,
                package3,
                package4
        };


        // ====================================================
        // DISPLAY ALL PACKAGES
        // ====================================================

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                 AVAILABLE TOURISM PACKAGES");
        System.out.println("============================================================");

        for (TourismPackage tourismPackage : packages) {

            System.out.println();
            System.out.println("------------------------------------------------------------");

            tourismPackage.displayPackageDetails();

            System.out.println("------------------------------------------------------------");
        }

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                    SELECT PACKAGE");
        System.out.println("============================================================");

        System.out.println("TP101 - Domestic Tourism");
        System.out.println("TP102 - International Tourism");
        System.out.println("TP103 - Adventure Tourism");
        System.out.println("TP104 - Luxury Tourism");

        System.out.println();

        System.out.print("Enter Package ID : ");
        String selectedPackageId = sc.nextLine();


        TourismPackage selectedPackage = null;


        for (TourismPackage tourismPackage : packages) {

            if (tourismPackage.getPackageId()
                    .equalsIgnoreCase(selectedPackageId)) {

                selectedPackage = tourismPackage;
                break;
            }
        }


        // ====================================================
        // BOOKING
        // ====================================================

        if (selectedPackage != null) {

            System.out.println();
            System.out.println("------------------------------------------------------------");

            System.out.print("Enter Booking ID   : ");
            String bookingId = sc.nextLine();

            System.out.print("Enter Booking Date : ");
            String bookingDate = sc.nextLine();


            Booking booking = new Booking(
                    bookingId,
                    tourist,
                    selectedPackage,
                    bookingDate
            );

            System.out.println();
            System.out.println("============================================================");
            System.out.println("                   SELECTED PACKAGE");
            System.out.println("============================================================");

            selectedPackage.displayPackageDetails();

            System.out.println();
            System.out.println("============================================================");
            System.out.println("                  BOOKING CONFIRMATION");
            System.out.println("============================================================");

            booking.displayBookingDetails();

            System.out.println();
            System.out.println("============================================================");
            System.out.println("             PACKAGE BOOKED SUCCESSFULLY!");
            System.out.println("============================================================");

        } else {

            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.println("Invalid Package ID!");
            System.out.println("Please enter TP101, TP102, TP103 or TP104.");
            System.out.println("------------------------------------------------------------");
        }
        sc.close();
    }
}
package MentorbridgeExercise.TourismManagement;

public class DomesticTourism extends TourismPackage {

    public DomesticTourism(String packageId,
                           String destination,
                           int days,
                           int travelers,
                           double basePrice) {

        super(
                packageId,
                destination,
                days,
                travelers,
                basePrice
        );
    }

    @Override
    public double calculateFinalPrice() {

        double serviceCharge = getBasePrice() * 0.05;

        return getBasePrice()
                + serviceCharge
                - calculateDiscount();
    }
}
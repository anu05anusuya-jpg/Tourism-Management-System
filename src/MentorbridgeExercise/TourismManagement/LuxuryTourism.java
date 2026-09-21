package MentorbridgeExercise.TourismManagement;

public class LuxuryTourism extends TourismPackage {

    public LuxuryTourism(String packageId,
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

        double luxuryCharge = getBasePrice() * 0.20;

        return getBasePrice()
                + luxuryCharge
                - calculateDiscount();
    }
}
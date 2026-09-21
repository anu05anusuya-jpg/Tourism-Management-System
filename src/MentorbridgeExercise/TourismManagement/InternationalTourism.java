package MentorbridgeExercise.TourismManagement;

public class InternationalTourism extends TourismPackage {

    public InternationalTourism(String packageId,
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

        double serviceCharge = getBasePrice() * 0.10;
        double tax = getBasePrice() * 0.08;

        return getBasePrice()
                + serviceCharge
                + tax
                - calculateDiscount();
    }
}
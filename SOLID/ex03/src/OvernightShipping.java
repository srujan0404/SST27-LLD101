public class OvernightShipping extends ShippingType {
    @Override
    public double calculateCost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}

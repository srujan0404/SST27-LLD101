public class StandardShipping extends ShippingType {
    @Override
    public double calculateCost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}

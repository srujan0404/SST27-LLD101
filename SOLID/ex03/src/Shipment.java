public class Shipment {
    private ShippingType shippingType;
    private double weightKg;
    
    public Shipment(ShippingType type, double weightKg) {
        this.shippingType = type;
        this.weightKg = weightKg;
    }
    
    public double getWeightKg() {
        return weightKg;
    }
    
    public ShippingType getShippingType() {
        return shippingType;
    }
}
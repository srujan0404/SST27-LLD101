public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        
        Shipment expressShipment = new Shipment(new ExpressShipping(), 2.0);
        System.out.println("Express cost: " + calculator.cost(expressShipment));
    }
}

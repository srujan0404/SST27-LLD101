public class UPIPayment implements PaymentType {
    @Override
    public String processPayment(double amount) {
        return "Paid via UPI: " + amount;
    }
}

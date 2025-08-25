public class CardPayment implements PaymentType {
    @Override
    public String processPayment(double amount) {
        return "Charged card: " + amount;
    }
}

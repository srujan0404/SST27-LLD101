
public class PaymentService {
    public String pay(Payment payment) {
        return payment.getType().processPayment(payment.getAmount());
    }
}
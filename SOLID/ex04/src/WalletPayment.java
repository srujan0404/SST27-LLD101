public class WalletPayment implements PaymentType {
    @Override
    public String processPayment(double amount) {
        return "Wallet debit: " + amount;
    }
}

public class Payment {
    private PaymentType type;
    private double amount;
    
    public Payment(PaymentType type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    
    public PaymentType getType() {
        return type;
    }
    
    public double getAmount() {
        return amount;
    }
}
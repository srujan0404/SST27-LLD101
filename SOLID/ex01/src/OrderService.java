public class OrderService {
    private Tax tax = new Tax();
    private EmailClient emailClient = new EmailClient();

    public void checkout(String customerEmail, double subtotal) {
        double total = tax.calculateTotalWithTax(subtotal);
        emailClient.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}
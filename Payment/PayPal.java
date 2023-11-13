package OOPTasks.Payment;

public class PayPal implements Payment {
    Integer value;

    public PayPal(Integer n) {
        value = n;
    }

    public PayPal() {
        value = 0;
    }

    @Override
    public void processPayment() {
        // Fees
        value += 2;
    }

}
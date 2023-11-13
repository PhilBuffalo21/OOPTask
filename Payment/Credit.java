package OOPTasks.Payment;

public class Credit implements Payment {
    Integer value;

    public Credit(Integer v) {
        value = v;
    }

    public Credit() {
        value = 0;
    }

    @Override
    public void processPayment() {
        // Fees
        value += 1;
    }

}

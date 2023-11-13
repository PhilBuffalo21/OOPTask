package OOPTasks.Payment;

import java.util.List;
import java.util.function.Consumer;

public class PaymentProcessor<T extends Payment> {
    public void processor(List<T> payments, Consumer<T> processingStrategy) {
        payments.forEach(processingStrategy);
    }
}

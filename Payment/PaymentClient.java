package OOPTasks.Payment;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class PaymentClient {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Credit> creditList = new ArrayList<>();
        System.out.println("Before");
        for (int i = 0; i < 20; i++) {
            int randomInt = r.nextInt(100);
            Payment c = new Credit(randomInt);
            System.out.println(randomInt);
            creditList.add((Credit) c);
        }
        Consumer<Credit> paymentStrategyCredit = (payment) -> {
            payment.processPayment();
        };
        PaymentProcessor<Credit> processorC = new PaymentProcessor<>();
        processorC.processor(creditList, paymentStrategyCredit);
        System.out.println("After");
        for (Credit c : creditList) {
            System.out.println(c.value);
        }
    }
}

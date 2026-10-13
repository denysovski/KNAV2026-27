package upa.fei.dp.adapter;

public class Shop {
    private final PaymentProcessor processor;

    public Shop(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void checkout(String customer, double amount) {
        System.out.println("Pokladna: " + customer + ", " + amount + " Kc");
        processor.pay(customer, amount);
    }
}

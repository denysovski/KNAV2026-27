package upa.fei.dp.adapter;

import java.math.BigDecimal;
import java.util.Objects;

public class Shop {
    private final PaymentProcessor processor;

    public Shop(PaymentProcessor processor) {
        this.processor = Objects.requireNonNull(processor, "processor nesmi byt null");
    }

    public boolean checkout(String customer, BigDecimal amount) {
        String name = Check.text(customer, "customer");
        Check.positive(amount, "amount");
        System.out.println("Pokladna: " + name + ", " + amount.toPlainString() + " Kc");
        boolean paid = processor.pay(name, amount);
        System.out.println(paid ? "Pokladna: objednavka zaplacena" : "Pokladna: PLATBA SELHALA, objednavka se neodesle");
        return paid;
    }
}

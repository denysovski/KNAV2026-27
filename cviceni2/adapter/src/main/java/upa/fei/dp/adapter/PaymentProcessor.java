package upa.fei.dp.adapter;

public interface PaymentProcessor {
    boolean pay(String customer, double amountCzk);
}

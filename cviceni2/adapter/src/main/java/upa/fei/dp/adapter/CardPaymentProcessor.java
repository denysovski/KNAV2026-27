package upa.fei.dp.adapter;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean pay(String customer, double amountCzk) {
        System.out.println("Karta: " + customer + " zaplatil " + amountCzk + " Kc");
        return true;
    }
}

package upa.fei.dp.adapter;

import java.math.BigDecimal;

public class CardPaymentProcessor implements PaymentProcessor {
    private static final BigDecimal LIMIT = new BigDecimal("50000");

    @Override
    public boolean pay(String customer, BigDecimal amountCzk) {
        String name = Check.text(customer, "customer");
        Check.positive(amountCzk, "amountCzk");
        if (amountCzk.compareTo(LIMIT) > 0) {
            System.out.println("Karta: platba " + amountCzk.toPlainString() + " Kc zamitnuta (limit "
                    + LIMIT.toPlainString() + " Kc)");
            return false;
        }
        System.out.println("Karta: " + name + " zaplatil " + amountCzk.toPlainString() + " Kc");
        return true;
    }
}

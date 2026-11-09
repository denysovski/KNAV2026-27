package upa.fei.dp.adapter;

import java.math.BigDecimal;

public interface PaymentProcessor {

    boolean pay(String customer, BigDecimal amountCzk);
}

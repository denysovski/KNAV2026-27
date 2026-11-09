package upa.fei.dp.adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BankAdapter implements PaymentProcessor {
    private final LegacyBank bank;
    private final String account;

    public BankAdapter(LegacyBank bank, String account) {
        this.bank = Objects.requireNonNull(bank, "bank nesmi byt null");
        this.account = Check.text(account, "account");
    }

    @Override
    public boolean pay(String customer, BigDecimal amountCzk) {
        Check.text(customer, "customer");
        Check.positive(amountCzk, "amountCzk");

        long cents = amountCzk.movePointRight(2).setScale(0, RoundingMode.HALF_UP).longValueExact();
        return bank.makeTransfer(account, cents);
    }
}

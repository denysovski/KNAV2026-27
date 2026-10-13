package upa.fei.dp.adapter;

public class BankAdapter implements PaymentProcessor {
    private final LegacyBank bank;
    private final String account;

    public BankAdapter(LegacyBank bank, String account) {
        this.bank = bank;
        this.account = account;
    }

    @Override
    public boolean pay(String customer, double amountCzk) {
        bank.makeTransfer(account, Math.round(amountCzk * 100));
        return true;
    }
}

package upa.fei.dp.adapter;

public class CryptoAdapter implements PaymentProcessor {
    private static final double CZK_PER_BTC = 1_500_000;
    private final CryptoWallet wallet;
    private final String address;

    public CryptoAdapter(CryptoWallet wallet, String address) {
        this.wallet = wallet;
        this.address = address;
    }

    @Override
    public boolean pay(String customer, double amountCzk) {
        wallet.send(address, amountCzk / CZK_PER_BTC);
        return true;
    }
}

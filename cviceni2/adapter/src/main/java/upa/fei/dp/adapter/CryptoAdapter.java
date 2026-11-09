package upa.fei.dp.adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class CryptoAdapter implements PaymentProcessor {
    private static final BigDecimal CZK_PER_BTC = new BigDecimal("1500000");
    private final CryptoWallet wallet;
    private final String address;

    public CryptoAdapter(CryptoWallet wallet, String address) {
        this.wallet = Objects.requireNonNull(wallet, "wallet nesmi byt null");
        this.address = Check.text(address, "address");
    }

    @Override
    public boolean pay(String customer, BigDecimal amountCzk) {
        Check.text(customer, "customer");
        Check.positive(amountCzk, "amountCzk");
        BigDecimal btc = amountCzk.divide(CZK_PER_BTC, 8, RoundingMode.HALF_UP);
        return wallet.send(address, btc);
    }
}

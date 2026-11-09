package upa.fei.dp.adapter;

import java.math.BigDecimal;

public class CryptoWallet {

    public boolean send(String address, BigDecimal btc) {
        if (address == null || !address.startsWith("bc1") || address.length() < 8) {
            System.out.println("CryptoWallet: neplatna adresa " + address);
            return false;
        }
        if (btc == null || btc.signum() <= 0) {
            System.out.println("CryptoWallet: castka v BTC musi byt kladna");
            return false;
        }
        System.out.println("CryptoWallet: odeslano " + btc.toPlainString() + " BTC na adresu " + address);
        return true;
    }
}

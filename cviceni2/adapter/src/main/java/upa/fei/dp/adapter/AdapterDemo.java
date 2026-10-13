package upa.fei.dp.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        new Shop(new CardPaymentProcessor()).checkout("Jan", 1200);
        System.out.println();
        new Shop(new BankAdapter(new LegacyBank(), "123456789/0100")).checkout("Eva", 199.90);
        System.out.println();
        new Shop(new CryptoAdapter(new CryptoWallet(), "bc1qxyz")).checkout("Petr", 30000);
    }
}

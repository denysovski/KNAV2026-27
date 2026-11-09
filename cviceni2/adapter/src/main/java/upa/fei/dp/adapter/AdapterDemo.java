package upa.fei.dp.adapter;

import java.math.BigDecimal;

public class AdapterDemo {
    public static void main(String[] args) {
        new Shop(new CardPaymentProcessor()).checkout("Jan", new BigDecimal("1200"));
        System.out.println();
        new Shop(new BankAdapter(new LegacyBank(), "123456789/0100")).checkout("Eva", new BigDecimal("199.90"));
        System.out.println();
        new Shop(new CryptoAdapter(new CryptoWallet(), "bc1qxyzabc123")).checkout("Petr", new BigDecimal("30000"));

        System.out.println("\n--- Platba, kterou system odmitne ---");
        new Shop(new CardPaymentProcessor()).checkout("Karel", new BigDecimal("80000"));
        System.out.println();
        new Shop(new BankAdapter(new LegacyBank(), "spatny-ucet")).checkout("Jana", new BigDecimal("500"));

        System.out.println("\n--- Kontrola vstupu ---");
        Shop shop = new Shop(new CardPaymentProcessor());
        try {
            shop.checkout("x", new BigDecimal("-100"));
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            new BankAdapter(new LegacyBank(), null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            new Shop(null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }
}

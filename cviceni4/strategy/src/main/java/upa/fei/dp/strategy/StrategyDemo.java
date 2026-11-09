package upa.fei.dp.strategy;

import java.math.BigDecimal;

public class StrategyDemo {
    public static void main(String[] args) {
        ShippingStrategy[] all = {
            new TruckStrategy(), new ShipStrategy(), new AirStrategy()
        };

        Order order = new Order(all[0], 100, 500);

        System.out.println("Cena stejne zasilky pri ruznych strategiich:");
        ShippingStrategy cheapest = null;
        BigDecimal cheapestPrice = null;
        for (ShippingStrategy s : all) {
            order.setStrategy(s);
            order.print();
            BigDecimal price = order.price();
            if (cheapestPrice == null || price.compareTo(cheapestPrice) < 0) {
                cheapest = s;
                cheapestPrice = price;
            }
        }
        System.out.println("Nejlevnejsi: " + cheapest.name() + " (" + cheapestPrice.toPlainString() + " Kc)");

        System.out.println("\n--- Kontrola vstupu ---");
        try {
            new Order(all[0], -10, 100);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            new Order(all[1], 10, -100);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            order.setStrategy(null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            all[2].calculate(0, 100);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }
}

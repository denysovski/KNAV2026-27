package upa.fei.dp.fact_met;

import java.math.BigDecimal;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Logistics[] companies = {
            new RoadLogistics(),
            new SeaLogistics(),
            new AirLogistics()
        };

        BigDecimal total = BigDecimal.ZERO;
        for (Logistics company : companies) {
            total = total.add(company.planDelivery("Palety s naradim", 500));
        }
        System.out.println("Celkem za vsechny varianty: " + total.toPlainString() + " Kc");

        System.out.println("\n--- Kontrola vstupu ---");
        Logistics road = new RoadLogistics();
        try {
            road.planDelivery(null, 100);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            road.planDelivery("Zbozi", -50);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }
}

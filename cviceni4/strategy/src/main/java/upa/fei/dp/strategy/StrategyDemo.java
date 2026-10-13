package upa.fei.dp.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShippingStrategy[] all = {
            new TruckStrategy(), new ShipStrategy(), new AirStrategy()
        };

        Order order = new Order(all[0], 100, 500);

        System.out.println("Cena stejne zasilky pri ruznych strategiich:");
        ShippingStrategy cheapest = all[0];
        for (ShippingStrategy s : all) {
            order.setStrategy(s);
            order.print();
            if (s.calculate(100, 500) < cheapest.calculate(100, 500)) {
                cheapest = s;
            }
        }
        System.out.println("Nejlevnejsi: " + cheapest.name());
    }
}

package upa.fei.dp.strategy;

public class Order {
    private ShippingStrategy strategy;
    private final double weightKg;
    private final double distanceKm;

    public Order(ShippingStrategy strategy, double weightKg, double distanceKm) {
        this.strategy = strategy;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double price() {
        return strategy.calculate(weightKg, distanceKm);
    }

    public void print() {
        System.out.println(strategy.name() + ": " + price() + " Kc");
    }
}

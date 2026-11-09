package upa.fei.dp.strategy;

import java.math.BigDecimal;
import java.util.Objects;

public class Order {
    private ShippingStrategy strategy;
    private final double weightKg;
    private final double distanceKm;

    public Order(ShippingStrategy strategy, double weightKg, double distanceKm) {
        this.strategy = Objects.requireNonNull(strategy, "strategy nesmi byt null");
        this.weightKg = Check.positive(weightKg, "weightKg");
        this.distanceKm = Check.positive(distanceKm, "distanceKm");
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "strategy nesmi byt null");
    }

    public ShippingStrategy getStrategy() { return strategy; }

    public BigDecimal price() {
        return strategy.calculate(weightKg, distanceKm);
    }

    public void print() {
        System.out.println(strategy.name() + ": " + price().toPlainString() + " Kc");
    }
}

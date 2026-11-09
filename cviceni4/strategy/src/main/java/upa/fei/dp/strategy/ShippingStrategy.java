package upa.fei.dp.strategy;

import java.math.BigDecimal;

public interface ShippingStrategy {
    String name();

    BigDecimal calculate(double weightKg, double distanceKm);
}

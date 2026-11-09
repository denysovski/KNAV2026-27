package upa.fei.dp.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TruckStrategy implements ShippingStrategy {
    private static final BigDecimal PER_KG = new BigDecimal("0.5");
    private static final BigDecimal PER_KM = new BigDecimal("2");

    @Override
    public String name() { return "Kamion"; }

    @Override
    public BigDecimal calculate(double weightKg, double distanceKm) {
        Check.positive(weightKg, "weightKg");
        Check.positive(distanceKm, "distanceKm");
        return BigDecimal.valueOf(weightKg).multiply(PER_KG)
                .add(BigDecimal.valueOf(distanceKm).multiply(PER_KM))
                .setScale(2, RoundingMode.HALF_UP);
    }
}

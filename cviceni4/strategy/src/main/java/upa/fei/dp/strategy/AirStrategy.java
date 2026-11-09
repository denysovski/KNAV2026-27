package upa.fei.dp.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AirStrategy implements ShippingStrategy {
    private static final BigDecimal PER_KG = new BigDecimal("2");
    private static final BigDecimal PER_KM = new BigDecimal("5");

    @Override
    public String name() { return "Letadlo"; }

    @Override
    public BigDecimal calculate(double weightKg, double distanceKm) {
        Check.positive(weightKg, "weightKg");
        Check.positive(distanceKm, "distanceKm");
        return BigDecimal.valueOf(weightKg).multiply(PER_KG)
                .add(BigDecimal.valueOf(distanceKm).multiply(PER_KM))
                .setScale(2, RoundingMode.HALF_UP);
    }
}

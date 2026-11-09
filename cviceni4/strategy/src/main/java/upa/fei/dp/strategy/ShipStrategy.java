package upa.fei.dp.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShipStrategy implements ShippingStrategy {
    private static final BigDecimal PER_KG = new BigDecimal("0.2");
    private static final BigDecimal PER_KM = new BigDecimal("0.8");
    private static final BigDecimal PORT_FEE = new BigDecimal("500");

    @Override
    public String name() { return "Lod"; }

    @Override
    public BigDecimal calculate(double weightKg, double distanceKm) {
        Check.positive(weightKg, "weightKg");
        Check.positive(distanceKm, "distanceKm");
        return BigDecimal.valueOf(weightKg).multiply(PER_KG)
                .add(BigDecimal.valueOf(distanceKm).multiply(PER_KM))
                .add(PORT_FEE)
                .setScale(2, RoundingMode.HALF_UP);
    }
}

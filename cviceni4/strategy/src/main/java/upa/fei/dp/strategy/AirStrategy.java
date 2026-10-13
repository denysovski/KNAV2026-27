package upa.fei.dp.strategy;

public class AirStrategy implements ShippingStrategy {
    @Override
    public String name() { return "Letadlo"; }

    @Override
    public double calculate(double weightKg, double distanceKm) {
        return weightKg * 2.0 + distanceKm * 5;
    }
}

package upa.fei.dp.strategy;

public class ShipStrategy implements ShippingStrategy {
    @Override
    public String name() { return "Lod"; }

    @Override
    public double calculate(double weightKg, double distanceKm) {
        return weightKg * 0.2 + distanceKm * 0.8 + 500;
    }
}

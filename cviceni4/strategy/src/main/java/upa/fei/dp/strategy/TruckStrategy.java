package upa.fei.dp.strategy;

public class TruckStrategy implements ShippingStrategy {
    @Override
    public String name() { return "Kamion"; }

    @Override
    public double calculate(double weightKg, double distanceKm) {
        return weightKg * 0.5 + distanceKm * 2;
    }
}

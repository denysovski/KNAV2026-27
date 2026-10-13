package upa.fei.dp.strategy;

public interface ShippingStrategy {
    String name();
    double calculate(double weightKg, double distanceKm);
}

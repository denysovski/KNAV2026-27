package upa.fei.dp.fact_met;

import java.math.BigDecimal;

public class Truck implements TransportType {
    @Override
    public void deliver(String cargo) {
        System.out.println("Delivery by Truck: " + Check.text(cargo, "cargo") + " (po silnici)");
    }

    @Override
    public BigDecimal costPerKm() { return new BigDecimal("2.00"); }
}

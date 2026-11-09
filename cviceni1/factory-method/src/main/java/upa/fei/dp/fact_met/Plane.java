package upa.fei.dp.fact_met;

import java.math.BigDecimal;

public class Plane implements TransportType {
    @Override
    public void deliver(String cargo) {
        System.out.println("Delivery by Plane: " + Check.text(cargo, "cargo") + " (vzduchem)");
    }

    @Override
    public BigDecimal costPerKm() { return new BigDecimal("5.00"); }
}

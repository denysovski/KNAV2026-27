package upa.fei.dp.fact_met;

import java.math.BigDecimal;

public class Ship implements TransportType {
    @Override
    public void deliver(String cargo) {
        System.out.println("Delivery by Ship: " + Check.text(cargo, "cargo") + " (po mori)");
    }

    @Override
    public BigDecimal costPerKm() { return new BigDecimal("0.80"); }
}

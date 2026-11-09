package upa.fei.dp.fact_met;

import java.math.BigDecimal;

public interface TransportType {
    void deliver(String cargo);

    BigDecimal costPerKm();
}

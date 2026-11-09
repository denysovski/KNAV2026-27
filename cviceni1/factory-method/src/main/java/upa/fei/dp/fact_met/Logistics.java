package upa.fei.dp.fact_met;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public abstract class Logistics {

    public abstract TransportType createTransport();

    public BigDecimal planDelivery(String cargo, double distanceKm) {
        String cleanCargo = Check.text(cargo, "cargo");
        Check.positive(distanceKm, "distanceKm");

        TransportType transport = Objects.requireNonNull(createTransport(),
                "createTransport() nesmi vratit null");

        System.out.println("Planuji dopravu: " + cleanCargo + ", vzdalenost " + distanceKm + " km");
        transport.deliver(cleanCargo);

        BigDecimal price = transport.costPerKm()
                .multiply(BigDecimal.valueOf(distanceKm))
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("Cena: " + price.toPlainString() + " Kc\n");
        return price;
    }
}

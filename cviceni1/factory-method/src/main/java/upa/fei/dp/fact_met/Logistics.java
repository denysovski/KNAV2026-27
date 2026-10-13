package upa.fei.dp.fact_met;

public abstract class Logistics {

    public abstract TransportType createTransport();

    public void planDelivery(String cargo, double distanceKm) {
        TransportType transport = createTransport();
        System.out.println("Planuji dopravu: " + cargo + ", vzdalenost " + distanceKm + " km");
        transport.deliver(cargo);
        System.out.println("Cena: " + transport.costPerKm() * distanceKm + " Kc\n");
    }
}

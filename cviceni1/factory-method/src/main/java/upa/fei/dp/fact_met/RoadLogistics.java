package upa.fei.dp.fact_met;

public class RoadLogistics extends Logistics {
    @Override
    public TransportType createTransport() {
        return new Truck();
    }
}

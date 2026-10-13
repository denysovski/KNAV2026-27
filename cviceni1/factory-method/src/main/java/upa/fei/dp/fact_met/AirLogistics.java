package upa.fei.dp.fact_met;

public class AirLogistics extends Logistics {
    @Override
    public TransportType createTransport() {
        return new Plane();
    }
}

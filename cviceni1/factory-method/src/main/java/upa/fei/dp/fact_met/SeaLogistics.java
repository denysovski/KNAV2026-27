package upa.fei.dp.fact_met;

public class SeaLogistics extends Logistics {
    @Override
    public TransportType createTransport() {
        return new Ship();
    }
}

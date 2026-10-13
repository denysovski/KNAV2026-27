package upa.fei.dp.fact_met;

public class Truck implements TransportType {
    @Override
    public void deliver(String cargo) {
        System.out.println("Delivery by Truck: " + cargo + " (po silnici)");
    }

    @Override
    public double costPerKm() { return 2.0; }
}

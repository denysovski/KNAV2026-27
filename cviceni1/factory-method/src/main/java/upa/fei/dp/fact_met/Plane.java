package upa.fei.dp.fact_met;

public class Plane implements TransportType {
    @Override
    public void deliver(String cargo) {
        System.out.println("Delivery by Plane: " + cargo + " (vzduchem)");
    }

    @Override
    public double costPerKm() { return 5.0; }
}

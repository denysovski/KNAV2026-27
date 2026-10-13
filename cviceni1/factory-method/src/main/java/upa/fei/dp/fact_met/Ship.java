package upa.fei.dp.fact_met;

public class Ship implements TransportType {
    @Override
    public void deliver(String cargo) {
        System.out.println("Delivery by Ship: " + cargo + " (po mori)");
    }

    @Override
    public double costPerKm() { return 0.8; }
}

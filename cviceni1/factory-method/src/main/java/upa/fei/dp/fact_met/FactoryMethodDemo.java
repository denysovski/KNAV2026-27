package upa.fei.dp.fact_met;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Logistics[] companies = {
            new RoadLogistics(),
            new SeaLogistics(),
            new AirLogistics()
        };

        for (Logistics company : companies) {
            company.planDelivery("Palety s naradim", 500);
        }
    }
}

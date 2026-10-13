package upa.fei.dp.singleton;

public class OrderService {
    private int orders = 0;

    public void createOrder(String item) {
        if (orders >= Configuration.getInstance().getMaxOrders()) {
            AppLogger.getInstance().log("OrderService", "limit objednavek dosazen, " + item + " zamitnuto");
            return;
        }
        orders++;
        AppLogger.getInstance().log("OrderService", "objednavka c. " + orders + ": " + item);
    }
}

package upa.fei.dp.singleton;

public class OrderService {
    private int orders = 0;

    public boolean createOrder(String item) {
        String clean = Check.text(item, "item");
        if (orders >= Configuration.getInstance().getMaxOrders()) {
            AppLogger.getInstance().log("OrderService", "limit objednavek dosazen, " + clean + " zamitnuto");
            return false;
        }
        orders++;
        AppLogger.getInstance().log("OrderService", "objednavka c. " + orders + ": " + clean);
        return true;
    }
}

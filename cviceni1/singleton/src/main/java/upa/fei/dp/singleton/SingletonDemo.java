package upa.fei.dp.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        AppLogger a = AppLogger.getInstance();
        AppLogger b = AppLogger.getInstance();
        System.out.println("Je to stejna instance? " + (a == b));

        Configuration.getInstance().setLanguage("en");
        System.out.println("Jazyk: " + Configuration.getInstance().getLanguage());

        UserService users = new UserService();
        OrderService orders = new OrderService();
        users.register("Jan");
        orders.createOrder("Klavesnice");
        orders.createOrder("Mys");
        orders.createOrder("Monitor");
        orders.createOrder("Webkamera");

        b.printHistory();
    }
}

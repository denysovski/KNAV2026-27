package upa.fei.dp.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        AppLogger a = AppLogger.getInstance();
        AppLogger b = AppLogger.getInstance();
        System.out.println("Je to stejna instance? " + (a == b));

        Configuration.getInstance().setLanguage(Language.EN);
        System.out.println("Jazyk: " + Configuration.getInstance().getLanguage());

        UserService users = new UserService();
        OrderService orders = new OrderService();
        System.out.println("Registrace Jan: " + users.register("Jan"));
        System.out.println("Registrace Jan znovu: " + users.register("Jan"));

        String[] items = {"Klavesnice", "Mys", "Monitor", "Webkamera"};
        for (String item : items) {
            System.out.println("Objednavka " + item + ": " + (orders.createOrder(item) ? "prijata" : "zamitnuta"));
        }

        b.printHistory();

        System.out.println("\n--- Kontrola vstupu ---");
        try {
            users.register(null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            orders.createOrder("  ");
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            Configuration.getInstance().setLanguage(null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }
}

package upa.fei.dp.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        System.out.println("== Virtual proxy ==");
        Image lazy = new LazyImageProxy("foto.jpg");
        System.out.println("Proxy vytvoren, nic se zatim nenacetlo.");
        lazy.display();
        lazy.display();

        System.out.println("\n== Protection proxy ==");
        Image secret = new LazyImageProxy("tajne.png");
        Role[] roles = { Role.GUEST, Role.parse("admin") };
        for (Role role : roles) {
            try {
                new ProtectedImageProxy(secret, role, Role.ADMIN).display();
            } catch (SecurityException e) {
                System.out.println("ProtectedImageProxy: " + e.getMessage());
            }
        }

        System.out.println("\n--- Kontrola vstupu ---");
        try {
            new LazyImageProxy(null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            Role.parse("boss");
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            new ProtectedImageProxy(null, Role.ADMIN, Role.ADMIN);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }
}

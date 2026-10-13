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
        new ProtectedImageProxy(secret, "GUEST").display();
        new ProtectedImageProxy(secret, "ADMIN").display();
    }
}

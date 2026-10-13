package upa.fei.dp.proxy;

public class ProtectedImageProxy implements Image {
    private final Image image;
    private final String userRole;

    public ProtectedImageProxy(Image image, String userRole) {
        this.image = image;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if ("ADMIN".equals(userRole)) {
            image.display();
        } else {
            System.out.println("ProtectedImageProxy: pristup zamitnut (role " + userRole + ")");
        }
    }
}

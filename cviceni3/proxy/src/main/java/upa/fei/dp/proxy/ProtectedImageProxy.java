package upa.fei.dp.proxy;

import java.util.Objects;

public class ProtectedImageProxy implements Image {
    private final Image image;
    private final Role userRole;
    private final Role requiredRole;

    public ProtectedImageProxy(Image image, Role userRole, Role requiredRole) {
        this.image = Objects.requireNonNull(image, "image nesmi byt null");
        this.userRole = Objects.requireNonNull(userRole, "userRole nesmi byt null");
        this.requiredRole = Objects.requireNonNull(requiredRole, "requiredRole nesmi byt null");
    }

    @Override
    public void display() {
        if (!userRole.isAtLeast(requiredRole)) {
            throw new SecurityException("Pristup zamitnut: role " + userRole
                    + ", vyzaduje se alespon " + requiredRole);
        }
        image.display();
    }
}

package upa.fei.dp.proxy;

public class LazyImageProxy implements Image {
    private final String file;
    private RealImage real;

    public LazyImageProxy(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (real == null) {
            real = new RealImage(file);
        }
        real.display();
    }
}

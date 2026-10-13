package upa.fei.dp.proxy;

public class RealImage implements Image {
    private final String file;

    public RealImage(String file) {
        this.file = file;
        System.out.println("RealImage: nacitam " + file + " z disku (draha operace)");
    }

    @Override
    public void display() {
        System.out.println("RealImage: zobrazuji " + file);
    }
}

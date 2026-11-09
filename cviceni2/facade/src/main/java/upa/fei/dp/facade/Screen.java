package upa.fei.dp.facade;

public class Screen {
    private boolean down = false;

    public void down() {
        if (down) return;
        down = true;
        System.out.println("Screen: platno dolu");
    }

    public void up() {
        if (!down) return;
        down = false;
        System.out.println("Screen: platno nahoru");
    }

    public boolean isDown() { return down; }
}

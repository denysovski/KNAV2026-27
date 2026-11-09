package upa.fei.dp.facade;

public class Projector {
    private boolean on = false;

    public void on() {
        if (on) return;
        on = true;
        System.out.println("Projector: zapnut");
    }

    public void wideScreenMode() {
        if (!on) throw new IllegalStateException("Projector je vypnuty");
        System.out.println("Projector: siroky rezim");
    }

    public void off() {
        if (!on) return;
        on = false;
        System.out.println("Projector: vypnut");
    }

    public boolean isOn() { return on; }
}

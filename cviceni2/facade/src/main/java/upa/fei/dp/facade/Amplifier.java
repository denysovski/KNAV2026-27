package upa.fei.dp.facade;

public class Amplifier {
    private boolean on = false;
    private int volume = 0;

    public void on() {
        if (on) return;
        on = true;
        System.out.println("Amplifier: zapnut");
    }

    public void setVolume(int v) {
        requireOn();
        volume = Check.range(v, 0, 10, "volume");
        System.out.println("Amplifier: hlasitost " + volume);
    }

    public void setSurround() {
        requireOn();
        System.out.println("Amplifier: prostorovy zvuk");
    }

    public void off() {
        if (!on) return;
        on = false;
        volume = 0;
        System.out.println("Amplifier: vypnut");
    }

    public boolean isOn() { return on; }

    private void requireOn() {
        if (!on) throw new IllegalStateException("Amplifier je vypnuty");
    }
}

package upa.fei.dp.facade;

public class Player {
    private boolean on = false;
    private boolean playing = false;

    public void on() {
        if (on) return;
        on = true;
        System.out.println("Player: zapnut");
    }

    public void play(String title) {
        if (!on) throw new IllegalStateException("Player je vypnuty");
        String clean = Check.text(title, "title");
        playing = true;
        System.out.println("Player: prehrava \"" + clean + "\"");
    }

    public void stop() {
        if (!playing) return;
        playing = false;
        System.out.println("Player: zastaven");
    }

    public void off() {
        if (!on) return;
        stop();
        on = false;
        System.out.println("Player: vypnut");
    }

    public boolean isOn() { return on; }
}

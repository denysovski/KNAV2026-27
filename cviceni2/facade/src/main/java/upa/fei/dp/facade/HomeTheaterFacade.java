package upa.fei.dp.facade;

public class HomeTheaterFacade {

    public enum Mode { OFF, MOVIE, MUSIC }

    private final Lights lights = new Lights();
    private final Screen screen = new Screen();
    private final Amplifier amp = new Amplifier();
    private final Projector projector = new Projector();
    private final Player player = new Player();

    private Mode mode = Mode.OFF;

    public Mode getMode() { return mode; }

    public void watchMovie(String movie) {
        String title = Check.text(movie, "movie");
        if (mode != Mode.OFF) {
            shutDown();
        }
        System.out.println("--- Priprava filmu ---");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurround();
        amp.setVolume(8);
        player.on();
        player.play(title);
        mode = Mode.MOVIE;
    }

    public void listenToMusic(String album) {
        String title = Check.text(album, "album");
        if (mode != Mode.OFF) {
            shutDown();
        }
        System.out.println("--- Hudba ---");
        amp.on();
        amp.setVolume(5);
        player.on();
        player.play(title);
        mode = Mode.MUSIC;
    }

    public boolean shutDown() {
        if (mode == Mode.OFF) {
            System.out.println("Domaci kino je uz vypnute, nic nevypinam.");
            return false;
        }
        System.out.println("--- Vypinam ---");

        player.stop();
        player.off();
        projector.off();
        screen.up();
        amp.off();
        lights.on();
        mode = Mode.OFF;
        return true;
    }
}

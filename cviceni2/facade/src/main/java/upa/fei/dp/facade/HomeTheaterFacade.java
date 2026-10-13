package upa.fei.dp.facade;

public class HomeTheaterFacade {
    private final Lights lights = new Lights();
    private final Screen screen = new Screen();
    private final Amplifier amp = new Amplifier();
    private final Projector projector = new Projector();
    private final Player player = new Player();

    public void watchMovie(String movie) {
        System.out.println("--- Priprava filmu ---");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurround();
        amp.setVolume(8);
        player.on();
        player.play(movie);
    }

    public void listenToMusic(String album) {
        System.out.println("--- Hudba ---");
        amp.on();
        amp.setVolume(5);
        player.on();
        player.play(album);
    }

    public void shutDown() {
        System.out.println("--- Vypinam ---");
        player.stop();
        player.off();
        projector.off();
        screen.up();
        amp.off();
        lights.on();
    }
}

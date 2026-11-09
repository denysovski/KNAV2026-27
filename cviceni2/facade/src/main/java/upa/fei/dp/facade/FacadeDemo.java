package upa.fei.dp.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();

        theater.watchMovie("Matrix");
        System.out.println("Rezim: " + theater.getMode());
        System.out.println("Vypnuto: " + theater.shutDown());

        System.out.println();
        theater.listenToMusic("Abbey Road");
        System.out.println("Vypnuto: " + theater.shutDown());

        System.out.println();
        System.out.println("Vypnuto: " + theater.shutDown());

        System.out.println("\n--- Kontrola vstupu ---");
        try {
            theater.watchMovie(null);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            theater.listenToMusic("   ");
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
        try {
            new Amplifier().setVolume(5);
        } catch (RuntimeException e) {
            System.out.println("Zachyceno: " + e.getMessage());
        }
    }
}

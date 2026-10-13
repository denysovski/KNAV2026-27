package upa.fei.dp.facade;

public class Amplifier {
    public void on() { System.out.println("Amplifier: zapnut"); }
    public void setVolume(int v) { System.out.println("Amplifier: hlasitost " + v); }
    public void setSurround() { System.out.println("Amplifier: prostorovy zvuk"); }
    public void off() { System.out.println("Amplifier: vypnut"); }
}

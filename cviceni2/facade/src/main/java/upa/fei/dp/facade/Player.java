package upa.fei.dp.facade;

public class Player {
    public void on() { System.out.println("Player: zapnut"); }
    public void play(String title) { System.out.println("Player: prehrava \"" + title + "\""); }
    public void stop() { System.out.println("Player: zastaven"); }
    public void off() { System.out.println("Player: vypnut"); }
}

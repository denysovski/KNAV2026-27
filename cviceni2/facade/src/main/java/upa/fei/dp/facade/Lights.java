package upa.fei.dp.facade;

public class Lights {
    private int level = 100;

    public void dim(int percent) {
        level = Check.range(percent, 0, 100, "percent");
        System.out.println("Lights: stmivam na " + level + " %");
    }

    public void on() {
        if (level == 100) {
            return;
        }
        level = 100;
        System.out.println("Lights: rozsvicuji");
    }

    public int getLevel() { return level; }
}

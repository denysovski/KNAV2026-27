package upa.fei.dp.strategy;

final class Check {
    private Check() { }

    static double positive(double value, String name) {
        if (Double.isNaN(value) || Double.isInfinite(value) || value <= 0) {
            throw new IllegalArgumentException(name + " musi byt kladne cislo, ale je " + value);
        }
        return value;
    }
}

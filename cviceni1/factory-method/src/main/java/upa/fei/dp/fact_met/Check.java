package upa.fei.dp.fact_met;

import java.util.Objects;

final class Check {
    private Check() { }

    static String text(String value, String name) {
        Objects.requireNonNull(value, name + " nesmi byt null");
        if (value.isBlank()) {
            throw new IllegalArgumentException(name + " nesmi byt prazdny");
        }
        return value.trim();
    }

    static double positive(double value, String name) {
        if (Double.isNaN(value) || Double.isInfinite(value) || value <= 0) {
            throw new IllegalArgumentException(name + " musi byt kladne cislo, ale je " + value);
        }
        return value;
    }
}

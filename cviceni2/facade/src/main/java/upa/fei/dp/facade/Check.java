package upa.fei.dp.facade;

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

    static int range(int value, int min, int max, String name) {
        if (value < min || value > max) {
            throw new IllegalArgumentException(name + " musi byt " + min + " az " + max + ", ale je " + value);
        }
        return value;
    }
}

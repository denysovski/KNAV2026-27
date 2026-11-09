package upa.fei.dp.template;

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
}

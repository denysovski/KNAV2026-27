package upa.fei.dp.adapter;

import java.math.BigDecimal;
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

    static BigDecimal positive(BigDecimal value, String name) {
        Objects.requireNonNull(value, name + " nesmi byt null");
        if (value.signum() <= 0) {
            throw new IllegalArgumentException(name + " musi byt kladna, ale je " + value.toPlainString());
        }
        return value;
    }
}

package upa.fei.dp.proxy;

import java.util.Locale;

public enum Role {
    GUEST, USER, ADMIN;

    public boolean isAtLeast(Role required) {
        return this.ordinal() >= required.ordinal();
    }

    public static Role parse(String text) {
        String clean = Check.text(text, "role");
        try {
            return valueOf(clean.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Neznama role: " + clean);
        }
    }
}

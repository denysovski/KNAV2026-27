package upa.fei.dp.singleton;

import java.util.Objects;

public class Configuration {

    private static final Configuration INSTANCE = new Configuration();

    private static final int MAX_ORDERS = 3;

    private volatile Language language = Language.CS;

    private Configuration() { }

    public static Configuration getInstance() {
        return INSTANCE;
    }

    public Language getLanguage() { return language; }

    public void setLanguage(Language language) {
        this.language = Objects.requireNonNull(language, "language nesmi byt null");
    }

    public int getMaxOrders() { return MAX_ORDERS; }
}

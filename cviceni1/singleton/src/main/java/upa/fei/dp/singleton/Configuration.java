package upa.fei.dp.singleton;

public class Configuration {

    private static final Configuration INSTANCE = new Configuration();

    private String language = "cs";
    private int maxOrders = 3;

    private Configuration() { }

    public static Configuration getInstance() {
        return INSTANCE;
    }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
    public int getMaxOrders() { return maxOrders; }
}

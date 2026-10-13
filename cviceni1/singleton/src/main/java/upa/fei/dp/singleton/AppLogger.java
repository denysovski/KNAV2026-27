package upa.fei.dp.singleton;

import java.util.ArrayList;
import java.util.List;

public class AppLogger {

    private static volatile AppLogger instance;

    private final List<String> history = new ArrayList<>();

    private AppLogger() {
        System.out.println("[AppLogger] vytvarim jedinou instanci");
    }

    public static AppLogger getInstance() {
        if (instance == null) {
            synchronized (AppLogger.class) {
                if (instance == null) {
                    instance = new AppLogger();
                }
            }
        }
        return instance;
    }

    public void log(String source, String message) {
        history.add(source + ": " + message);
    }

    public void printHistory() {
        System.out.println("--- Historie logu (" + history.size() + " zaznamu) ---");
        for (String line : history) {
            System.out.println(line);
        }
    }
}

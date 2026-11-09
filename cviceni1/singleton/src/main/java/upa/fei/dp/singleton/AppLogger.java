package upa.fei.dp.singleton;

import java.util.ArrayList;
import java.util.Collections;
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

    public synchronized void log(String source, String message) {
        String src = Check.text(source, "source");
        String msg = Check.text(message, "message");
        history.add(src + ": " + msg);
    }

    public synchronized List<String> getHistory() {
        return Collections.unmodifiableList(new ArrayList<>(history));
    }

    public synchronized void printHistory() {
        System.out.println("--- Historie logu (" + history.size() + " zaznamu) ---");
        for (String line : history) {
            System.out.println(line);
        }
    }
}

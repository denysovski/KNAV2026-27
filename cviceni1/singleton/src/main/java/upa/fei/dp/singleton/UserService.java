package upa.fei.dp.singleton;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private final Set<String> users = new HashSet<>();

    public boolean register(String name) {
        String clean = Check.text(name, "name");
        if (!users.add(clean)) {
            AppLogger.getInstance().log("UserService", "uzivatel " + clean + " uz existuje");
            return false;
        }
        AppLogger.getInstance().log("UserService", "registrovan uzivatel " + clean);
        return true;
    }
}

package upa.fei.dp.singleton;

public class UserService {
    public void register(String name) {
        AppLogger.getInstance().log("UserService", "registrovan uzivatel " + name);
    }
}

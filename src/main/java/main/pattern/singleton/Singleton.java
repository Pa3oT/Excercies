package main.pattern.singleton;

public class Singleton {
    private static Singleton ourInstance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        return ourInstance == null ? new Singleton() : ourInstance;
    }
}

class Singleton1 {
    public static class SingletonHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }
    public static Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

class Singleton3 {
    public static final Singleton3 INSTANCE = new Singleton3();
}

enum Singleton2 {
    INSTANCE;
}

class Singleton4 {
    private static volatile Singleton4 instance;
    public static Singleton4 getInstance() {
        Singleton4 localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton4.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton4();
                }
            }
        }
        return localInstance;
    }
}
package designpattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Instance already exists");
        }
    }

    public static Singleton getInstance() {
        //single check
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;

        //double -checking
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
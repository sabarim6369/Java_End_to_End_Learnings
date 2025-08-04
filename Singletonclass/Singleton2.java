package Singletonclass;

public class Singleton2 {
    private static Singleton2 obj;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (obj == null) {
            obj = new Singleton2();
        }
        return obj;
    }

    public void printdata() {
        System.out.println("Hello world");
    }
}
package learn_threads.synchronizing.synchronizing_static_methods;

public class MyClass {

    public static synchronized int getCount() {
        return 1 * 3;
    }

    static public int getCountTwo() {
        synchronized (MyClass.class) {
            return 2 + 2;
        }
    }

    public static void classMethod() throws ClassNotFoundException {
        Class cl = Class.forName("MyClass");
        synchronized (cl) {
            System.out.println("Hi");
        }
    }
}

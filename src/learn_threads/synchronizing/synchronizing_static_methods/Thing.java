package learn_threads.synchronizing.synchronizing_static_methods;

public class Thing {

    private static int staticField;

    private int nonstaticField;

    public static synchronized int getStaticField() {
        return staticField;
    }

    public static synchronized void setStaticField(int staticField) {
        Thing.staticField = staticField;
    }

    public synchronized int getNonstaticField() {
        return nonstaticField;
    }

    public synchronized void setNonstaticField(int nonstaticField) {
        this.nonstaticField = nonstaticField;
    }
}

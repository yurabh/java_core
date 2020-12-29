package learn_threads.synchronizing.synchronizing_block;

public class SyncTest {

    public void doStuff() {
        System.out.println("not synchronized");
        synchronized (this) {
            System.out.println("synchronized");
        }
    }

    public static void main(String[] args) {
        SyncTest syncTest = new SyncTest();

        syncTest.doStuff();
    }
}

package learn_threads.threads_core.core_examples;

public class FooRunnable implements Runnable {

    @Override
    public void run() {
        for (int x = 1; x < 6; x++) {
            System.out.println("Runnable running");
        }
    }
}

class TestThreads {

    public static void main(String[] args) throws InterruptedException {

        FooRunnable r = new FooRunnable();

        Thread t = new Thread(r);

        t.setPriority(8);

        t.setPriority(Thread.MAX_PRIORITY);

        t.start();

        System.out.println("main thread");

        t.join();

        System.out.println("hi hello");

        final int count = Thread.activeCount();

        System.out.println("Active count Threads: " + count);
    }
}

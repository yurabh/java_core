package learn_threads.threads_core.core_examples;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable");
    }
}

class TestThread {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread thr = new Thread(r);

        Thread foo = new Thread(r);

        Thread bar = new Thread(r);

        Thread bat = new Thread(r);

        thr.run();

        foo.run();

        bar.run();

        bat.run();
    }
}

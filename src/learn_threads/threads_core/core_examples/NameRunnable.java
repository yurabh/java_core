package learn_threads.threads_core.core_examples;

public class NameRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("NameRunnable running");

        System.out.println("Run by " + Thread.currentThread().getName());
    }
}

class NameThread {

    public static void main(String[] args) {

        NameRunnable nr = new NameRunnable();

        Thread t = new Thread(nr);

        t.setName("Fred");

        t.start();

        System.out.println("thread is " + Thread.currentThread().getName());
    }
}

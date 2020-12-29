package learn_threads.threads_core.core_examples;

public class NameRunnableSecond implements Runnable {

    @Override
    public void run() {
        for (int x = 1; x <= 40; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Exception");
            }
        }
    }
}

class ManyNames {
    public static void main(String[] args) {
        NameRunnableSecond nr = new NameRunnableSecond();

        Thread one = new Thread(nr);

        Thread two = new Thread(nr);

        Thread three = new Thread(nr);

        one.setName("Fred");

        two.setName("Lucy");

        three.setName("Ricky");

        one.start();

        two.start();

        three.start();

        Thread.yield();
    }
}

package learn_threads.threads_core.second_example;

public class ThreadTest {

    public static void main(String[] args)
            throws InterruptedException {

        Runnable printA = new TaskPrintSymbol('a', 11);

        Runnable printB = new TaskPrintSymbol('b', 11);

        Runnable printC = new TaskPrintSymbol('c', 11);

        Runnable printNumber = new TaskPrintNumber(11);

        Thread th1 = new Thread(printA);

        Thread th2 = new Thread(printB);

        Thread th3 = new Thread(printC);

        th1.setPriority(3);

        th2.setPriority(6);

        th3.setPriority(9);

        th1.start();

        th2.start();

        th2.join();

        Thread.sleep(5000);

        th3.start();

        Thread th4 = new Thread(printNumber);

        th4.start();

        th4.join();
    }
}

package lesson_99;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable printA = new TaskPrintSymbol('a', 50);
        Runnable printB = new TaskPrintSymbol('b', 50);
        Runnable printC = new TaskPrintSymbol('c', 50);

        Runnable printNumber = new TaskPrintNumber(50);

        Thread th1 = new Thread(printA);
        Thread th2 = new Thread(printB);
        Thread th3 = new Thread(printC);

        th1.setPriority(3);
        th2.setPriority(6);
        th3.setPriority(9);

        th1.start();
        th2.start();
        th3.start();

        Thread th4 = new Thread(printNumber);

//        th1.start();
        th1.join();
        Thread.sleep(5000);
        Thread.yield();
//        th2.start();
        th2.join();
//        th3.start();
        th2.join();
//        th4.start();
        th4.join();
    }
}

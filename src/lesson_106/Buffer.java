package lesson_106;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {

    private final static int CAPACITY = 1;
    private LinkedList<Integer> queue = new LinkedList<>();
    private static Lock lock = new ReentrantLock();
    private static Condition notEmpty = lock.newCondition();
    private static Condition notFull = lock.newCondition();

    public void write(int number) {
        lock.lock();
        try {
            while (queue.size() == CAPACITY) {
                System.out.println("wait for not full condition ");
                notFull.await();
            }
            queue.offer(number);
            notEmpty.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public int read() {
        int tempValue = 0;
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.println("waiting for data");
                notEmpty.await();
            }
            tempValue = queue.remove();
            notFull.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return tempValue;
    }
}

package learn_concurrency.condition_and_lock.first_example;

import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockWithCondition {

    private Stack<String> stack = new Stack<>();

    private static final int CAPACITY = 5;

    private ReentrantLock lock = new ReentrantLock();

    private Condition stackEmptyCondition = lock.newCondition();

    private Condition stackFullCondition = lock.newCondition();


    public void pushToStack(String item) throws InterruptedException {

        try {
            lock.lock();
            while (stack.size() == CAPACITY) {
                stackFullCondition.await();
            }
            stack.push(item);
            stackEmptyCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }


    public String popFromStack() throws InterruptedException {
        try {
            lock.lock();
            while (stack.size() == 0) {
                stackEmptyCondition.await();
            }
            return stack.pop();
        } finally {
            stackFullCondition.signalAll();
            lock.unlock();
        }
    }
}

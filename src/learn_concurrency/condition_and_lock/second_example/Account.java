package learn_concurrency.condition_and_lock.second_example;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private static Lock lock = new ReentrantLock();

    private static Condition condition = lock.newCondition();

    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void putMoney(int amount) {
        lock.lock();
        try {
            int newBalance = balance + amount;
            balance = newBalance;
            System.out.println("\ndeposit :" + amount + " balance: " + balance);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void drowMoney(int amount) {
        lock.lock();
        try {
            while (balance < amount) {
                System.out.println("\nwaiting for deposit");
                condition.await();
            }
            balance -= amount;
            System.out.println("drow :" + amount + " balance: " + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

package learn_concurrency.semaphore.first_example;

import java.util.concurrent.Semaphore;

public class Account {

    private static Semaphore semaphore = new Semaphore(5);

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        try {
            semaphore.acquire();
            int newBalance = balance + amount;
            Thread.sleep(5);
            balance = newBalance;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

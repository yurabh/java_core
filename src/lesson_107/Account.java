package lesson_107;

import java.util.concurrent.Semaphore;

public class Account {
    private static Semaphore samaphore = new Semaphore(5);

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {

        try {
            samaphore.acquire();
            int newBalance = balance + amount;
            Thread.sleep(5);
            balance = newBalance;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            samaphore.release();
        }
    }
}

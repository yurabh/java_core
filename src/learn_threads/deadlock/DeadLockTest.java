package learn_threads.deadlock;

import learn_concurrency.condition_and_lock.second_example.Account;

public class DeadLockTest {

    public static void main(String[] args) {

        Account ac1 = new Account();

        Account ac2 = new Account();
        //ac1 - TH1
        //ac2 - TH2
        synchronized (ac1) {
            synchronized (ac2) {
            }
        }
    }
}

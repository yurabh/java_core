package learn_threads.synchronizing.synchronizing_methods;

public class AccountDanger implements Runnable {

    private Account acct = new Account();

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private void makeWithdrawal(int amt) {
        synchronized (this) {
            if (acct.getBalance() >= amt) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
                acct.withdraw(amt);
                System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
            } else {
                System.out.println("Not enough in account for " + Thread.currentThread().getName()
                        + " to withdraw " + acct.getBalance());
            }
        }
    }
}

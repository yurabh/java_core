package learn_concurrency.condition_and_lock.second_example;

import java.util.Random;

public class AddMoneyTask implements Runnable {

    private Account someAccount;

    public AddMoneyTask(Account someAccount) {
        this.someAccount = someAccount;
    }

    @Override
    public void run() {
        Random random = new Random();

        try {
            while (true) {
                someAccount.putMoney(random.nextInt(10 + 1));
                Thread.sleep(3000);
                //Thread.currentThread().interrupt();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

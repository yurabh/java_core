package lesson_102;

import java.util.Random;

public class GrowMoneyTask implements Runnable {

    private Account someAccount;

    public GrowMoneyTask(Account someAccount) {
        this.someAccount = someAccount;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            someAccount.drowMoney(random.nextInt(10 + 1));
        }
    }
}

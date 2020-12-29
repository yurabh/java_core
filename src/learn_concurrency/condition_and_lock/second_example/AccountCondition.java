package learn_concurrency.condition_and_lock.second_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountCondition {

    public static Account account = new Account();

    public static void main(String[] args) {

        ExecutorService executorService = null;

        try {
            executorService = Executors.newFixedThreadPool(2);

            executorService.execute(new AddMoneyTask(account));

            executorService.execute(new GrowMoneyTask(account));

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (executorService != null) {
            executorService.shutdown();
        }
    }
}

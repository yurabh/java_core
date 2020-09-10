package lesson_102;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountCondition {
    public static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new AddMoneyTask(account));
        executorService.execute(new GrowMoneyTask(account));
        executorService.shutdown();
    }
}

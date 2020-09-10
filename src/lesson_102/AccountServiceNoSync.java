package lesson_102;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountServiceNoSync {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new AddMoneyTask(account));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            //System.out.println("waiting thread");
        }
        System.out.println("new balance: " + account.getBalance());
    }
}

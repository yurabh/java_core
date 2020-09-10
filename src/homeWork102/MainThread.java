package homeWork102;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {

    private static CountSum countSum = new CountSum();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executorService.execute(new AddSum(countSum));
        }

        executorService.shutdown();
        int i = 0;
        while (!executorService.isTerminated()) {
            System.out.println("thread wait: " + i++);
        }

        System.out.println("new Sum:" + countSum.getCountSum());
    }
}

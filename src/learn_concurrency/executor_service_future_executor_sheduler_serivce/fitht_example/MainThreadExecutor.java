package learn_concurrency.executor_service_future_executor_sheduler_serivce.fitht_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadExecutor {

//    private static CountSum countSum = new CountSum();

    public static void main(String[] args) {

        CountSum countSum = new CountSum();


        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            new Thread(new AddSum(countSum)).start();
        }

        executorService.shutdown();

        int i = 0;

        while (!executorService.isTerminated()) {
//            System.out.println("thread wait: " + i++);
        }
        System.out.println("new Sum:" + countSum.getCountSum());
    }
}

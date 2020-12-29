package learn_concurrency.executor_service_future_executor_sheduler_serivce.third_example;

import java.util.concurrent.*;

public class CheckResult {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            final Future<?> submit = service.submit(() -> {

                for (int i = 0; i < 500; i++) {
                    System.out.println(counter);
                    CheckResult.counter++;
                }
            });

            submit.get(1, TimeUnit.MILLISECONDS);
            System.out.println("Reached!");

        } catch (TimeoutException e) {
            System.out.println("Non reached");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }


        new Thread(() -> {
            for (int i = 0; i < 500; i++)
                CheckResult.counter++;
        }).start();

        while (CheckResult.counter < 100) {
            Thread.sleep(4);
            System.out.println("Not reached yet + " + counter);
        }

        System.out.println("Reached!");
    }
}

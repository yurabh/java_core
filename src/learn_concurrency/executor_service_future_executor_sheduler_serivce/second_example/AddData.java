package learn_concurrency.executor_service_future_executor_sheduler_serivce.second_example;

import java.util.concurrent.*;

public class AddData {

    public static void main(String[] args) throws ExecutionException,
            InterruptedException, TimeoutException {

        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            final Future<Integer> result = service.submit(() -> 33 + 12);

            final Future<Integer> result1 = service.submit(() -> 33 + 12);

            final Future<Integer> result2 = service.submit(() -> 33 + 12);

            final Future<Integer> result3 = service.submit(() -> 33 + 12);

            System.out.println(result.get());

            System.out.println(result1.get());

            System.out.println(result2.get());

            System.out.println(result3.get());

        } finally {
            if (service != null)
                service.shutdown();
        }

        if (service != null) {
            service.awaitTermination(1, TimeUnit.MINUTES);
        }

        if (service.isTerminated()) {
            System.out.println("all tasks finished");
        } else {
            System.out.println("At least one task is still running");
        }


        ScheduledExecutorService scheduledService = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");

        Callable<String> task2 = () -> "Monkey";

        final ScheduledFuture<?> schedule = scheduledService.schedule(task1, 10, TimeUnit.SECONDS);

        final ScheduledFuture<String> schedule1 = scheduledService.schedule(task2, 10, TimeUnit.SECONDS);

        final String s = schedule1.get(11, TimeUnit.SECONDS);

        final Object object = schedule.get(1, TimeUnit.SECONDS);

        System.out.println("call : " + s);

        System.out.println("run: " + object);

        if (scheduledService != null) {
            scheduledService.shutdown();
        }

        final int i = Runtime.getRuntime().availableProcessors();

        System.out.println("available processors : " + i);
    }
}

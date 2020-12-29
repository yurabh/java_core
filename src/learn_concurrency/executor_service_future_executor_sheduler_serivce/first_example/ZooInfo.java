package learn_concurrency.executor_service_future_executor_sheduler_serivce.first_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            System.out.println("begin");

            service.execute(() -> System.out.println("Hello"));

            service.execute(() -> {
                        for (int i = 0; i < 3; i++)
                            System.out.println("Printing record: " + i);
                    }
            );

            service.execute(() -> System.out.println("Printing zoo inventory"));

            System.out.println("end");
        } finally {
            if (service != null)
                service.shutdown();
        }
    }
}

package learn_concurrency.condition_and_lock.fourth_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerProducerCooperation {

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        ExecutorService executorService = null;

        try {
            executorService = Executors.newFixedThreadPool(2);

            executorService.execute(new ProducerTask(buffer));

            executorService.execute(new ConsumerTask(buffer));
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}

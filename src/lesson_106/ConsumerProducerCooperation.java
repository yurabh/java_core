package lesson_106;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsumerProducerCooperation {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new ProducerTask(buffer));
        executorService.execute(new ConsumerTask(buffer));
        executorService.shutdown();
    }
}

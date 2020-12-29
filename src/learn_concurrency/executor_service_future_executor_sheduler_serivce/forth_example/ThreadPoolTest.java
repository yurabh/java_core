package learn_concurrency.executor_service_future_executor_sheduler_serivce.forth_example;

import learn_threads.threads_core.second_example.TaskPrintSymbol;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);

        service.execute(new TaskPrintSymbol('a', 11));

        service.execute(new TaskPrintSymbol('b', 11));

        service.execute(new TaskPrintSymbol('c', 11));

        service.execute(new TaskPrintSymbol('d', 11));

        service.execute(new TaskPrintSymbol('e', 11));

        service.shutdown();
    }
}

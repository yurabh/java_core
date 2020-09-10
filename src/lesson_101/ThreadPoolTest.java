package lesson_101;

import lesson_99.TaskPrintSymbol;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new TaskPrintSymbol('b', 50));
        service.execute(new TaskPrintSymbol('a', 50));
        service.execute(new TaskPrintSymbol('c', 50));
        service.execute(new TaskPrintSymbol('d', 50));
        service.shutdown();
    }
}

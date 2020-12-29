package learn_threads.threads_core.second_example;

public class TaskPrintSymbol implements Runnable {

    private char symbol;
    private int times;

    public TaskPrintSymbol(char symbol, int times) {
        this.symbol = symbol;
        this.times = times;
    }

    @Override
    public void run() {

        for (int i = 0; i < times; i++) {
            if (i == 10) {
                System.out.println(i);
                Thread.currentThread().interrupt();
            }
            System.out.print(symbol);
        }
    }
}

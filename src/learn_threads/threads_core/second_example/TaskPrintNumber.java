package learn_threads.threads_core.second_example;

public class TaskPrintNumber implements Runnable {

    private int maxNumber;

    public TaskPrintNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= maxNumber; i++) {
            if (i == 10) {
                Thread.currentThread().interrupt();
            }
            System.out.print(i);
        }
    }
}

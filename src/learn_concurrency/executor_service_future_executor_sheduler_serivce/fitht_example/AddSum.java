package learn_concurrency.executor_service_future_executor_sheduler_serivce.fitht_example;

public class AddSum implements Runnable {

    private CountSum countSum;

    public AddSum(CountSum countSum) {
        this.countSum = countSum;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        synchronized (countSum) {
            countSum.addNumber(1);
        }
    }
}

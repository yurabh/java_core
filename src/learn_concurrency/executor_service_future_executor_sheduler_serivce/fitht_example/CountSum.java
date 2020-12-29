package learn_concurrency.executor_service_future_executor_sheduler_serivce.fitht_example;

public class CountSum {

    private Integer countSum = 0;

    public Integer getCountSum() {
        return countSum;
    }

    public void addNumber(Integer number) {
        System.out.println("Number -> " + Thread.currentThread().getName());

        Integer newNumber = countSum + number;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countSum = newNumber;
    }
}

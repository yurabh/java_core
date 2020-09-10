package homeWork102;

public class CountSum {
    private Integer countSum = 0;

    public Integer getCountSum() {
        return countSum;
    }

    public void addNumber(Integer number) {
        Integer newNumber = countSum + number;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countSum = newNumber;
    }
}

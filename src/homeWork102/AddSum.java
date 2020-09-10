package homeWork102;

public class AddSum implements Runnable {

    private CountSum countSum;

    public AddSum(CountSum countSum) {
        this.countSum = countSum;
    }

    @Override
    public void run() {
        synchronized (this) {
            countSum.addNumber(1);
        }
    }
}

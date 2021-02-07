package learn_map.second_example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class BankTransaction implements Comparable<BankTransaction> {

    private List<LocalDate> dates = new ArrayList<>();
    private List<Double> transaction = new ArrayList<>();
    private String address;
    private String numberCart;
    private double balance;

    public BankTransaction(String address, String numberCart, double balance) {
        this.address = address;
        this.numberCart = numberCart;
        this.balance = balance;
    }

    public void setTransaction() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            Double value = random.nextDouble() + (110) + 30;
            if (this.balance > 0) {
                dates.add(i, LocalDate.of(2018, 5, 12));
                this.balance -= value;
                transaction.add(i, value);
            } else {
                System.out.println("Balance < 0");
                break;
            }
        }
    }

    public void showTransaction() {
        System.out.println("Date: " + this.dates);
        System.out.println("Transaction: " + this.transaction);
        System.out.println("CartNumber: " + this.numberCart);
        System.out.println("Address: " + this.address);
        System.out.println("Balance: " + this.balance);
    }

    @Override
    public int compareTo(BankTransaction o) {
        if (o.address.equals(address)) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(dates, that.dates) &&
                Objects.equals(transaction, that.transaction) &&
                Objects.equals(address, that.address) &&
                Objects.equals(numberCart, that.numberCart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dates, transaction, address, numberCart, balance);
    }

    @Override
    public String toString() {
        return "dates=" + dates +
                ", transaction=" + transaction +
                ", address='" + address + '\'' +
                ", numberCart='" + numberCart + '\'' +
                ", balance=" + balance + '\n';
    }
}

package learn_threads.synchronizing.synchronizing_methods;

public class TestAccount {

    public static void main(String[] args) {

        AccountDanger r = new AccountDanger();

        Thread one = new Thread(r);

        Thread two = new Thread(r);

        one.setName("Fred");

        two.setName("Lucy");

        one.start();

        two.start();
    }
}

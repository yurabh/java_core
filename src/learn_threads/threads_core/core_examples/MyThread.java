package learn_threads.threads_core.core_examples;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Important job running in MyThread");
    }

    public void run(String s) {
        System.out.println("String in run is " + s);
    }


}

class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());

        t.run();
    }
}

package learn_threads.demon_threads;

public class Test {
    public static void main(String[] args) {
        Thread daemonThread = new Thread();

        daemonThread.setDaemon(true);

        daemonThread.start();
    }
}

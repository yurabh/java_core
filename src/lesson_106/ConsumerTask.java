package lesson_106;

import java.util.Random;

public class ConsumerTask implements Runnable {
    private Buffer buffer;

    public ConsumerTask(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                System.out.println("consumer get data" + buffer.read());
                Thread.sleep(random.nextInt(3000) + 2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package lesson_106;

import java.util.Random;

public class ProducerTask implements Runnable {
    private Buffer buffer;

    public ProducerTask(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 5;
        Random random = new Random();
        try {
            while (true) {
                System.out.println("Producer Send Data: " + i);
                buffer.write(i);
                i++;
                Thread.sleep(random.nextInt(3000) + 2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

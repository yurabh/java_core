package learn_concurrency.synchronizing.synchronizing_collections;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.*;

public class ZooManagerTwo {

    private Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();

    public void put(String key, String value) {
        foodData.put(key, value);
    }

    public Object get(String key) {
        return foodData.get(key);
    }

    public static void main(String[] args) {
        try {

            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

            blockingQueue.offer(39);

            blockingQueue.offer(3, 10, TimeUnit.SECONDS);

            System.out.println(blockingQueue.poll());

            System.out.println(blockingQueue.poll(1000, TimeUnit.SECONDS));

            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

            blockingDeque.offer(91);

            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);

            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);

            blockingDeque.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingDeque.poll());

            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));

            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));

            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));


            Map<String, Integer> map = new ConcurrentHashMap<>();

            map.put("zebra", 52);

            map.put("elephant", 10);

            System.out.println(map.get("elephant"));

            Queue<Integer> queue = new ConcurrentLinkedQueue<>();

            queue.offer(31);

            System.out.println(queue.peek());

            System.out.println(queue.poll());

            Deque<Integer> deque = new ConcurrentLinkedDeque<>();

            deque.offer(10);

            deque.push(4);

            System.out.println(deque.peek());

            System.out.println(deque.pop());

        } catch (
                InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

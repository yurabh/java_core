package learn_custom_queue;

public class RunnerQueue {
    public static void main(String[] args) {

        Queue queue = new Queue(5);

        System.out.println("name class: " + queue.getClass() + "\n");

        System.out.println("hash code: " + queue.hashCode() + "\n");

        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);

        System.out.println("count element into queue : " + queue.getSize() + "\n");

        System.out.println("rear element: " + queue.getRear() + "\n");

        System.out.println("front element: " + queue.getFront() + "\n");

        int[] queueOne = queue.getQueue();
        for (int i = 0; i < (queue.getSize() - 1); i++) {
            System.out.println("Array: " + i + "   " + queueOne[i]);
        }

        queue.offer(55);
        queue.offer(66);
        queue.offer(77);
        queue.offer(88);
        queue.offer(99);

        queue.showInfo();

        System.out.println("Чи черга непереповнена: " + queue.ifFilled() + "\n");

        System.out.println("Чи черга пуста: " + queue.isEmpty() + "\n");

        System.out.println("Повертаеєм першого у черзі: " + queue.peek() + "\n");

        System.out.println("Видаляем елемент із черги: " + queue.remove() + "\n");

        System.out.println("Видаляем елемент із черги: " + queue.remove() + "\n");

        queue.showInfo();

        System.out.println("Чи черга непереповнена: " + queue.ifFilled() + "\n");

        System.out.println("Чи черга пуста: " + queue.isEmpty() + "\n");

        System.out.println("Повертаеєм першого у черзі: " + queue.peek() + "\n");

        System.out.println(queue.toString() + "\n");

        System.out.println("Чи дві черги рівні: " + queue.equals(queue) + "\n");
    }
}

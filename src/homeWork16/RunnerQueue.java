package homeWork16;

public class RunnerQueue {
    public static void main(String[] args) {

        Queue queue = new Queue(5);
        System.out.println("Назва класу: " + queue.getClass());
        System.out.println("hash cod: " + queue.hashCode());
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);

        System.out.println("Максимальна кількість елементів у черзі : " + queue.getSize());
        System.out.println("Зверху у черзі кількість елементів: " + queue.getRear());
        System.out.println("Знизу у черзі: " + queue.getFront());
        int[] queueOne = queue.getQueue();
        for (int i = 0; i < (queue.getSize() - 1); i++) {
            System.out.println("Array: " + i + "   " + queueOne[i]);
        }

        queue.offer(55);
        queue.offer(66);
        queue.offer(77);
        queue.offer(88);
        queue.offer(99);

        System.out.println("");
        queue.showInfo();
        System.out.println("");

        System.out.println("Чи черга непереповнена: " + queue.ifFilled());
        System.out.println("Чи черга пуста: " + queue.isEmpty());
        System.out.println("Повертаеєм першого у черзі: " + queue.peek());
        System.out.println("");
        System.out.println("Видаляем елемент із черги: " + queue.remove());
        System.out.println("Видаляем елемент із черги: " + queue.remove());
        System.out.println("");
        queue.showInfo();
        System.out.println("");

        System.out.println("Чи черга непереповнена: " + queue.ifFilled());
        System.out.println("Чи черга пуста: " + queue.isEmpty());
        System.out.println("Повертаеєм першого у черзі: " + queue.peek());
        System.out.println(queue.toString());
        System.out.println("Чи дві черги рівні: " + queue.equals(queue));
    }
}

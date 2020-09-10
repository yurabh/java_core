package homeWork16;

import java.util.Arrays;
import java.util.Objects;

public class Queue {
    private int[] queue;
    private int front;
    private int size;
    private int rear;
    private int iterator;


    public Queue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.iterator = 0;
    }

    public void offer(int value) {
        if (!ifFilled()) {
            queue[++rear] = value;
        } else {
            int[] quiqe = new int[queue.length + 1];
            for (int i = 0; i < size; i++) {
                quiqe[i] = queue[i];
            }
            quiqe[++rear] = value;
            this.size++;
            this.queue = quiqe;
        }
        iterator++;
    }


    boolean ifFilled() {
        return iterator == size - 1;
    }


    public boolean isEmpty() {
        return iterator == 0;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Черга пуста(((");
            return 0;
        } else {
            return queue[front];
        }
    }


    public int remove() {
        int tmpValue = queue[front++];
        if (front == size - 1) {
            front = 0;
        }
        iterator--;
        return tmpValue;
    }


    public void showInfo() {
        System.out.println("Максимальна кількість елементів у черзі: " + this.size);
        System.out.println("Початок черги: " + this.front);
        System.out.println("Кінець черги: " + this.rear);
        for (int i = 0; i < size; i++) {
            System.out.println("Черга[" + i + "]: " + this.queue[i]);
        }
    }


    public int[] getQueue() {
        return queue;
    }


    public int getFront() {
        return front;
    }

    public int getSize() {
        return size;
    }

    public int getRear() {
        return rear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return front == queue.front &&
                size == queue.size &&
                rear == queue.rear &&
                Arrays.equals(this.queue, queue.queue);
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(front, size, rear);
        result = 31 * result + Arrays.hashCode(queue);
        return result;
    }


    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(queue) +
                ", front=" + front +
                ", size=" + size +
                ", rear=" + rear +
                '}';
    }
}

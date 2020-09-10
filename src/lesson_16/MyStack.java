package lesson_16;

import java.util.Arrays;
import java.util.Objects;

public class MyStack {
    private int[] stack;
    private int size;
    private int top;

    public MyStack() {
        this.size = 3;
        this.stack = new int[3];
        this.top = -1;
    }


    public MyStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }


    public void push(int value) {
        if (!isFull()) {
            stack[++top] = value;
        } else {
            System.out.println("Arrays problems");
            int[] stak = new int[size + 1];
            for (int i = 0; i < size; i++) {
                stak[i] = stack[i];
            }
            stak[++top] = value;
            this.size++;
            this.stack = stak;
        }
    }


    public int pop() {
        if (!isEmpty()) {
            this.size--;
            return stack[top--];
        } else {
            System.out.println("Steck is empty qui");
            return 0;
        }
    }


    public boolean isFull() {
        return (top >= size - 1);
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("No isn't the element in stack");
            return 0;
        } else {
            return stack[top];
        }
    }


    public int[] getStack() {
        return stack;
    }


    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStack myStack = (MyStack) o;
        return size == myStack.size &&
                top == myStack.top &&
                Arrays.equals(stack, myStack.stack);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(size, top);
        result = 31 * result + Arrays.hashCode(stack);
        return result;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + Arrays.toString(stack) +
                ",     size=" + size +
                ",     top=" + top +
                '}';
    }

    public void showInfo() {
        System.out.println("Count elements:  " + this.size);
        System.out.println("Vuvivd top: " + this.top);
        for (int i = 0; i < size; i++) {
            System.out.println("Element stac[" + i + "] : " + this.stack[i]);
        }
    }
}
package lesson_130.bruce_eckel_examples.four_example;

public class CountedInteger {
    private static long counter;

    private final long id = counter++;

    public CountedInteger() {
    }

    public String toString() {
        return Long.toString(id);
    }
}

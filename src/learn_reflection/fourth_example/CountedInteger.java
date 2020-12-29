package learn_reflection.fourth_example;

public class CountedInteger {

    private static long counter;

    private final long id = counter++;

    public CountedInteger() {
    }

    public String toString() {
        return Long.toString(id);
    }
}
